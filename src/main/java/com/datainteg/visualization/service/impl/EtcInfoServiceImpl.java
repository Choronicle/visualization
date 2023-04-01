package com.datainteg.visualization.service.impl;

import com.datainteg.visualization.json.TopETC;
import com.datainteg.visualization.mbg.model.EtcInfo;
import com.datainteg.visualization.mbg.mapper.EtcInfoMapper;
import com.datainteg.visualization.service.IEtcInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * <p>
 * etc_info 服务实现类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Service
public class EtcInfoServiceImpl extends ServiceImpl<EtcInfoMapper, EtcInfo> implements IEtcInfoService {

    @Autowired
    private EtcInfoMapper mapper;

    @Override
    public BigDecimal getAmountByMonth(String yearMonth) {
        return mapper.getAmountByMonth(yearMonth);
    }

    @Override
    public TopETC getTopETC(String yearMonth) {
        return mapper.getTopETC(yearMonth);
    }
}
