package com.datainteg.visualization.mbg.mapper;

import com.datainteg.visualization.json.TopETC;
import com.datainteg.visualization.json.TopSbyb;
import com.datainteg.visualization.mbg.model.SbybInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

/**
 * <p>
 * sbyb_info Mapper 接口
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
public interface SbybInfoMapper extends BaseMapper<SbybInfo> {
    @Select("SELECT SUM(tran_amt_fen) " +
            "FROM dm.sbyb_info " +
            "WHERE tran_date LIKE '${yearMonth}%'")
    BigDecimal getAmountByMonth(@Param("yearMonth") String yearMonth);

    @Select("SELECT cust_name, SUM(tran_amt_fen) AS total_amt " +
            "FROM dm.sbyb_info " +
            "WHERE tran_date LIKE '${yearMonth}' " +
            "GROUP BY cust_name " +
            "ORDER BY SUM(tran_amt_fen) DESC " +
            "LIMIT 1")
    TopSbyb getTopSbyb(@Param("yearMonth") String yearMonth);
}
