package com.datainteg.visualization.service.impl;

import com.datainteg.visualization.json.TopShop;
import com.datainteg.visualization.mbg.model.ShopInfo;
import com.datainteg.visualization.mbg.mapper.ShopInfoMapper;
import com.datainteg.visualization.service.IShopInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * <p>
 * shop_info 服务实现类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Service
public class ShopInfoServiceImpl extends ServiceImpl<ShopInfoMapper, ShopInfo> implements IShopInfoService {

    @Autowired
    private ShopInfoMapper shopInfoMapper;

    @Override
    public BigDecimal getAmountByMonth(String yearMonth) {
        return shopInfoMapper.getAmountByMonth(yearMonth);
    }

    @Override
    public TopShop getTopShop(String yearMonth) {
        return shopInfoMapper.getTopShop(yearMonth);
    }

}
