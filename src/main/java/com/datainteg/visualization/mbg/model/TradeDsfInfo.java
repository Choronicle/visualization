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
 * trade_dsf_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.trade_dsf_info")
public class TradeDsfInfo implements Serializable {


    @TableId(value = "tran_date", type = IdType.AUTO)
    private String tranDate;

    @TableField("tran_log_no")
    private String tranLogNo;

    @TableField("tran_code")
    private String tranCode;

    @TableField("channel_flg")
    private String channelFlg;

    @TableField("tran_org")
    private String tranOrg;

    @TableField("tran_teller_no")
    private String tranTellerNo;

    @TableField("dc_flag")
    private String dcFlag;

    @TableField("tran_amt")
    private BigDecimal tranAmt;

    @TableField("send_bank")
    private String sendBank;

    @TableField("payer_open_bank")
    private String payerOpenBank;

    @TableField("payer_acct_no")
    private String payerAcctNo;

    @TableField("payer_name")
    private String payerName;

    @TableField("payee_open_bank")
    private String payeeOpenBank;

    @TableField("payee_acct_no")
    private String payeeAcctNo;

    @TableField("payee_name")
    private String payeeName;

    @TableField("tran_sts")
    private String tranSts;

    @TableField("busi_type")
    private String busiType;

    @TableField("busi_sub_type")
    private String busiSubType;

    @TableField("etl_dt")
    private String etlDt;

    private String uid;


}
