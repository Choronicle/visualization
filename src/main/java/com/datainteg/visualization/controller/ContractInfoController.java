package com.datainteg.visualization.controller;


import com.datainteg.visualization.mbg.model.ContractInfo;
import com.datainteg.visualization.service.IContractInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * contract_info 前端控制器
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Controller
@RequestMapping("/contract-info")
public class ContractInfoController {
    @Autowired
    private IContractInfoService contractService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public ContractInfo test(){
        return contractService.getOne(null);
    }
}
