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
 * duebill_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.duebill_info")
public class DuebillInfo implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField("acct_no")
    private String acctNo;

    @TableField("receipt_no")
    private String receiptNo;

    @TableField("contract_no")
    private String contractNo;

    @TableField("subject_no")
    private String subjectNo;

    @TableField("cust_no")
    private String custNo;

    @TableField("loan_cust_no")
    private String loanCustNo;

    @TableField("cust_name")
    private String custName;

    @TableField("buss_type")
    private String bussType;

    @TableField("curr_type")
    private String currType;

    @TableField("buss_amt")
    private BigDecimal bussAmt;

    @TableField("putout_date")
    private String putoutDate;

    @TableField("matu_date")
    private String matuDate;

    @TableField("actu_matu_date")
    private String actuMatuDate;

    @TableField("buss_rate")
    private BigDecimal bussRate;

    @TableField("actu_buss_rate")
    private BigDecimal actuBussRate;

    @TableField("intr_type")
    private String intrType;

    @TableField("intr_cyc")
    private String intrCyc;

    @TableField("pay_times")
    private Integer payTimes;

    @TableField("pay_cyc")
    private String payCyc;

    @TableField("extend_times")
    private Integer extendTimes;

    private BigDecimal bal;

    @TableField("norm_bal")
    private BigDecimal normBal;

    @TableField("dlay_amt")
    private BigDecimal dlayAmt;

    @TableField("dull_amt")
    private BigDecimal dullAmt;

    @TableField("bad_debt_amt")
    private BigDecimal badDebtAmt;

    @TableField("owed_int_in")
    private BigDecimal owedIntIn;

    @TableField("owed_int_out")
    private BigDecimal owedIntOut;

    @TableField("fine_pr_int")
    private BigDecimal finePrInt;

    @TableField("fine_intr_int")
    private BigDecimal fineIntrInt;

    @TableField("dlay_days")
    private Integer dlayDays;

    @TableField("pay_acct")
    private String payAcct;

    @TableField("putout_acct")
    private String putoutAcct;

    @TableField("pay_back_acct")
    private String payBackAcct;

    @TableField("due_intr_days")
    private Integer dueIntrDays;

    @TableField("operate_org")
    private String operateOrg;

    private String operator;

    @TableField("reg_org")
    private String regOrg;

    private String register;

    @TableField("occur_date")
    private String occurDate;

    @TableField("loan_use")
    private String loanUse;

    @TableField("pay_type")
    private String payType;

    @TableField("pay_freq")
    private String payFreq;

    @TableField("vouch_type")
    private String vouchType;

    @TableField("mgr_no")
    private String mgrNo;

    @TableField("mge_org")
    private String mgeOrg;

    @TableField("loan_channel")
    private String loanChannel;

    @TableField("ten_class")
    private String tenClass;

    @TableField("src_dt")
    private String srcDt;

    @TableField("etl_dt")
    private String etlDt;


}
