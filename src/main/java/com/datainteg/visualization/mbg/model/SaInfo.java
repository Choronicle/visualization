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
 * sa_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.sa_info")
public class SaInfo implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField("card_no")
    private String cardNo;

    @TableField("cust_name")
    private String custName;

    @TableField("acct_no")
    private String acctNo;

    @TableField("det_n")
    private Integer detN;

    @TableField("curr_type")
    private String currType;

    @TableField("tran_teller_no")
    private String tranTellerNo;

    @TableField("cr_amt")
    private BigDecimal crAmt;

    private BigDecimal bal;

    @TableField("tran_amt")
    private BigDecimal tranAmt;

    @TableField("tran_card_no")
    private String tranCardNo;

    @TableField("tran_type")
    private String tranType;

    @TableField("tran_log_no")
    private String tranLogNo;

    @TableField("dr_amt")
    private BigDecimal drAmt;

    @TableField("open_org")
    private String openOrg;

    @TableField("dscrp_code")
    private String dscrpCode;

    private String remark;

    @TableField("tran_time")
    private String tranTime;

    @TableField("tran_date")
    private String tranDate;

    @TableField("sys_date")
    private String sysDate;

    @TableField("tran_code")
    private String tranCode;

    @TableField("remark_1")
    private String remark1;

    @TableField("oppo_cust_name")
    private String oppoCustName;

    @TableField("agt_cert_type")
    private String agtCertType;

    @TableField("agt_cert_no")
    private String agtCertNo;

    @TableField("agt_cust_name")
    private String agtCustName;

    @TableField("channel_flag")
    private String channelFlag;

    @TableField("oppo_acct_no")
    private String oppoAcctNo;

    @TableField("oppo_bank_no")
    private String oppoBankNo;

    @TableField("src_dt")
    private String srcDt;

    @TableField("etl_dt")
    private String etlDt;


}
