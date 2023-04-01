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
 * shop_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.shop_info")
public class ShopInfo implements Serializable {


    @TableId(value = "tran_channel", type = IdType.AUTO)
    private String tranChannel;

    @TableField("order_code")
    private String orderCode;

    @TableField("shop_code")
    private String shopCode;

    @TableField("shop_name")
    private String shopName;

    @TableField("hlw_tran_type")
    private String hlwTranType;

    @TableField("tran_date")
    private String tranDate;

    @TableField("tran_time")
    private String tranTime;

    @TableField("tran_amt")
    private BigDecimal tranAmt;

    @TableField("current_status")
    private String currentStatus;

    @TableField("score_num")
    private BigDecimal scoreNum;

    @TableField("pay_channel")
    private String payChannel;

    private String uid;

    @TableField("legal_name")
    private String legalName;

    @TableField("etl_dt")
    private String etlDt;


}
