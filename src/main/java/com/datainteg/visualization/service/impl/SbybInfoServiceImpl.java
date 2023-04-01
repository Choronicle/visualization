package com.datainteg.visualization.service.impl;

import com.datainteg.visualization.json.TopSbyb;
import com.datainteg.visualization.mbg.model.SbybInfo;
import com.datainteg.visualization.mbg.mapper.SbybInfoMapper;
import com.datainteg.visualization.service.ISbybInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * <p>
 * sbyb_info 服务实现类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Service
public class SbybInfoServiceImpl extends ServiceImpl<SbybInfoMapper, SbybInfo> implements ISbybInfoService {

    @Autowired
    private SbybInfoMapper sbybInfoMapper;

    @Override
    public BigDecimal getAmountByMonth(String yearMonth) {
        return sbybInfoMapper.getAmountByMonth(yearMonth);
    }

    @Override
    public TopSbyb getTopSbyb(String yearMonth) {
        return sbybInfoMapper.getTopSbyb(yearMonth);
    }
}
