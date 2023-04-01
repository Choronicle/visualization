package com.datainteg.visualization.mbg.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * pri_cust_liab_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.pri_cust_liab_info")
public class PriCustLiabInfo implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField("all_bal")
    private BigDecimal allBal;

    @TableField("bad_bal")
    private BigDecimal badBal;

    @TableField("due_intr")
    private BigDecimal dueIntr;

    @TableField("norm_bal")
    private BigDecimal normBal;

    @TableField("delay_bal")
    private BigDecimal delayBal;

    @TableField("etl_dt")
    private String etlDt;


}
