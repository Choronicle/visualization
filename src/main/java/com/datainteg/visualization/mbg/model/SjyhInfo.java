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
 * sjyh_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.sjyh_info")
public class SjyhInfo implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField("mch_channel")
    private String mchChannel;

    @TableField("login_type")
    private String loginType;

    @TableField("ebank_cust_no")
    private String ebankCustNo;

    @TableField("tran_date")
    private String tranDate;

    @TableField("tran_time")
    private String tranTime;

    @TableField("tran_code")
    private String tranCode;

    @TableField("tran_sts")
    private String tranSts;

    @TableField("return_code")
    private String returnCode;

    @TableField("return_msg")
    private String returnMsg;

    @TableField("sys_type")
    private String sysType;

    @TableField("payer_acct_no")
    private String payerAcctNo;

    @TableField("payer_acct_name")
    private String payerAcctName;

    @TableField("payee_acct_no")
    private String payeeAcctNo;

    @TableField("payee_acct_name")
    private String payeeAcctName;

    @TableField("tran_amt")
    private BigDecimal tranAmt;

    @TableField("etl_dt")
    private String etlDt;


}
