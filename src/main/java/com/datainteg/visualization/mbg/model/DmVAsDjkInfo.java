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
 * dm_v_as_djk_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.dm_v_as_djk_info")
public class DmVAsDjkInfo implements Serializable {


    @TableId(value = "acct_no", type = IdType.AUTO)
    private String acctNo;

    @TableField("card_no")
    private String cardNo;

    @TableField("cust_name")
    private String custName;

    @TableField("prod_code")
    private String prodCode;

    @TableField("prod_name")
    private String prodName;

    private String uid;

    @TableField("entp_name")
    private String entpName;

    @TableField("open_date")
    private String openDate;

    @TableField("card_sts")
    private String cardSts;

    @TableField("card_sts_name")
    private String cardStsName;

    @TableField("card_sts_date")
    private String cardStsDate;

    @TableField("is_withdrw")
    private String isWithdrw;

    @TableField("is_transfer")
    private String isTransfer;

    @TableField("is_deposit")
    private String isDeposit;

    @TableField("is_purchse")
    private String isPurchse;

    @TableField("cred_limit")
    private BigDecimal credLimit;

    @TableField("mob_phone")
    private String mobPhone;

    private BigDecimal deposit;

    @TableField("over_draft")
    private BigDecimal overDraft;

    @TableField("dlay_amt")
    private BigDecimal dlayAmt;

    @TableField("five_class")
    private String fiveClass;

    private String bankacct;

    @TableField("bankacct_date")
    private String bankacctDate;

    @TableField("bankacct_bal")
    private BigDecimal bankacctBal;

    @TableField("is_mob_bank")
    private String isMobBank;

    @TableField("mob_bank_date")
    private String mobBankDate;

    @TableField("is_etc")
    private String isEtc;

    @TableField("etc_date")
    private String etcDate;

    @TableField("issue_mode")
    private String issueMode;

    @TableField("issue_mode_name")
    private String issueModeName;

    private BigDecimal bal;

    @TableField("active_date")
    private String activeDate;

    @TableField("clsd_date")
    private String clsdDate;

    @TableField("dlay_mths")
    private Integer dlayMths;

    @TableField("mgr_no")
    private String mgrNo;

    @TableField("mgr_name")
    private String mgrName;

    @TableField("recom_name")
    private String recomName;

    @TableField("mge_org")
    private String mgeOrg;

    @TableField("mge_org_name")
    private String mgeOrgName;

    @TableField("etl_dt")
    private String etlDt;


}
