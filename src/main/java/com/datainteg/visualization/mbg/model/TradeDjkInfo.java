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
 * trade_djk_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.trade_djk_info")
public class TradeDjkInfo implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField("card_no")
    private String cardNo;

    @TableField("tran_type")
    private String tranType;

    @TableField("tran_type_desc")
    private String tranTypeDesc;

    @TableField("tran_amt")
    private BigDecimal tranAmt;

    @TableField("tran_amt_sign")
    private String tranAmtSign;

    @TableField("mer_type")
    private String merType;

    @TableField("mer_code")
    private String merCode;

    @TableField("rev_ind")
    private String revInd;

    @TableField("tran_desc")
    private String tranDesc;

    @TableField("tran_date")
    private String tranDate;

    @TableField("val_date")
    private String valDate;

    @TableField("pur_date")
    private String purDate;

    @TableField("tran_time")
    private String tranTime;

    @TableField("acct_no")
    private String acctNo;

    @TableField("etl_dt")
    private String etlDt;


}
