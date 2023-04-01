package com.datainteg.visualization.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.datainteg.visualization.mbg.model.EtcInfo;
import com.datainteg.visualization.service.IEtcInfoService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * etc_info 前端控制器
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Controller
@RequestMapping("/etc-info")
public class EtcInfoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EtcInfoController.class);
    @Autowired
    private IEtcInfoService etcService;

    @RequestMapping(value = "/byMonth", method = RequestMethod.GET)
    @ResponseBody
    public List<BigDecimal> getAmtByMonth(@Param("year") Integer year){
        List<BigDecimal> res = new ArrayList<>();
        for(int month = 1; month <= 12; month++){
            StringBuilder sb = new StringBuilder();
            sb.append(year);
            if(month < 10)sb.append('0');
            sb.append(month);
            res.add(etcService.getAmountByMonth(sb.toString()));
        }
        return res;
    }
}
