package com.datainteg.visualization.service;

import com.datainteg.visualization.json.TopShop;
import com.datainteg.visualization.mbg.model.ShopInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * <p>
 * shop_info 服务类
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
public interface IShopInfoService extends IService<ShopInfo> {
    BigDecimal getAmountByMonth(String yearMonth);
    TopShop getTopShop(String yearMonth);
}
