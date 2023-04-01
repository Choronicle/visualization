package com.datainteg.visualization.service;

import com.datainteg.visualization.json.TopETC;
import com.datainteg.visualization.mbg.model.EtcInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * <p>
 * etc_info 服务类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
public interface IEtcInfoService extends IService<EtcInfo> {
    BigDecimal getAmountByMonth(String yearMonth);
    TopETC getTopETC(String yearMonth);
}
