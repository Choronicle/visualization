package com.datainteg.visualization.service;

import com.datainteg.visualization.json.TopSdrq;
import com.datainteg.visualization.mbg.model.SdrqInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * <p>
 * sdrq_info 服务类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
public interface ISdrqInfoService extends IService<SdrqInfo> {
    BigDecimal getAmountByMonth(String yearMonth);
    TopSdrq getTopSdrq(String yearMonth);
}
