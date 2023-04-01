package com.datainteg.visualization.service;

import com.datainteg.visualization.json.TopSbyb;
import com.datainteg.visualization.mbg.model.SbybInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * <p>
 * sbyb_info 服务类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
public interface ISbybInfoService extends IService<SbybInfo> {
    BigDecimal getAmountByMonth(String yearMonth);
    TopSbyb getTopSbyb(String yearMonth);
}
