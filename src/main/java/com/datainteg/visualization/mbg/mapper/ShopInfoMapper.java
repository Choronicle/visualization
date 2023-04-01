package com.datainteg.visualization.mbg.mapper;

import com.datainteg.visualization.json.TopShop;
import com.datainteg.visualization.mbg.model.ShopInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

/**
 * <p>
 * shop_info Mapper 接口
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
public interface ShopInfoMapper extends BaseMapper<ShopInfo> {
    @Select("SELECT SUM(tran_amt) " +
            "FROM dm.shop_info " +
            "WHERE tran_date LIKE '${yearMonth}%'")
    BigDecimal getAmountByMonth(@Param("yearMonth") String yearMonth);

    @Select("SELECT shop_name, SUM(tran_amt) AS total_amt " +
            "FROM dm.shop_info " +
            "WHERE tran_date LIKE '${yearMonth}' " +
            "GROUP BY shop_name " +
            "ORDER BY SUM(tran_amt) DESC " +
            "LIMIT 1")
    TopShop getTopShop(@Param("yearMonth") String yearMonth);
}
