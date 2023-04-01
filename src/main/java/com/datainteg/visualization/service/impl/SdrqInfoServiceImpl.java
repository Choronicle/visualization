package com.datainteg.visualization.service.impl;

import com.datainteg.visualization.json.TopSdrq;
import com.datainteg.visualization.mbg.model.SdrqInfo;
import com.datainteg.visualization.mbg.mapper.SdrqInfoMapper;
import com.datainteg.visualization.service.ISdrqInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * <p>
 * sdrq_info 服务实现类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Service
public class SdrqInfoServiceImpl extends ServiceImpl<SdrqInfoMapper, SdrqInfo> implements ISdrqInfoService {

    @Autowired
    private SdrqInfoMapper sdrqInfoMapper;

    @Override
    public BigDecimal getAmountByMonth(String yearMonth) {
        return sdrqInfoMapper.getAmountByMonth(yearMonth);
    }

    @Override
    public TopSdrq getTopSdrq(String yearMonth) {
        return sdrqInfoMapper.getTopSdrq(yearMonth);
    }
}
