package com.datainteg.visualization.controller;

import com.alibaba.fastjson2.JSONObject;
import com.datainteg.visualization.json.*;
import com.datainteg.visualization.service.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/visual")
public class VisualController {
    @Autowired
    private IEtcInfoService etcService;
    @Autowired
    private ISbybInfoService sbybService;
    @Autowired
    private ISdrqInfoService sdrqService;
    @Autowired
    private IShopInfoService shopService;
    @Autowired
    private IDmVAsDjkfqInfoService installmentService;

    @RequestMapping(value = "/byMonth", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getAmountByMonth(@Param("year") Integer year){
        BigDecimal[][] res = new BigDecimal[4][12];
        TopETC[] etcTopList = new TopETC[12];
        TopSbyb[] sbybTopList = new TopSbyb[12];
        TopSdrq[] sdrqTopList = new TopSdrq[12];
        TopShop[] shopTopList = new TopShop[12];
        BigDecimal[] installmentAmountList = new BigDecimal[12];
        for(int month = 1; month <= 12; month++){
            StringBuilder yearMonth = new StringBuilder();
            yearMonth.append(year);
            if(month < 10)yearMonth.append('0');
            yearMonth.append(month);
            String yearMonthString = yearMonth.toString();
            res[0][month - 1] = etcService.getAmountByMonth(yearMonthString);
            res[1][month - 1] = sbybService.getAmountByMonth(yearMonthString);
            res[2][month - 1] = sdrqService.getAmountByMonth(yearMonthString);
            res[3][month - 1] = shopService.getAmountByMonth(yearMonthString);
            TopETC temp1 = etcService.getTopETC(yearMonthString);
            TopSbyb temp2 = sbybService.getTopSbyb(yearMonthString);
            TopSdrq temp3 = sdrqService.getTopSdrq(yearMonthString);
            TopShop temp4 = shopService.getTopShop(yearMonthString);
            etcTopList[month - 1] = temp1;
            sbybTopList[month - 1] = temp2;
            sdrqTopList[month - 1] = temp3;
            shopTopList[month - 1] = temp4;
            installmentAmountList[month - 1] = installmentService.getAmountByMonth(yearMonthString);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("dataArray", res);
        map.put("etcTopList", etcTopList);
        map.put("sbybTopList", sbybTopList);
        map.put("sdrqTopList", sdrqTopList);
        map.put("shopTopList", shopTopList);
        map.put("installmentList", installmentAmountList);
        return new JSONObject(map);
    }
}
