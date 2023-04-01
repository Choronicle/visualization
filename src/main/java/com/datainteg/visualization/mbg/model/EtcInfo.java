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
 * etc_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.etc_info")
public class EtcInfo implements Serializable {

    //证件账号
    @TableField("uid")
    private String uid;
    //ETC账号
    @TableField("etc_acct")
    private String etcAcct;
    //卡号
    @TableField("card_no")
    private String cardNo;
    //车牌号
    @TableField("car_no")
    private String carNo;
    //客户名称
    @TableField("cust_name")
    private String custName;
    //交易日期
    @TableField("tran_date")
    private String tranDate;
    //交易时间
    @TableField("tran_time")
    private String tranTime;
    //交易金额
    @TableField("tran_amt_fen")
    private BigDecimal tranAmtFen;
    //实收金额
    @TableField("real_amt")
    private BigDecimal realAmt;
    //优惠金额
    @TableField("conces_amt")
    private BigDecimal concesAmt;
    //通行路程
    @TableField("tran_place")
    private String tranPlace;
    //手机号码
    @TableField("mob_phone")
    private String mobPhone;
    //数据日期
    @TableField("etl_dt")
    private String etlDt;


}
