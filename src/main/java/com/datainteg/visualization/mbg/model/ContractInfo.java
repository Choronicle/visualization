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
 * contract_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.contract_info")
public class ContractInfo implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField("contract_no")
    private String contractNo;

    @TableField("apply_no")
    private String applyNo;

    @TableField("artificial_no")
    private String artificialNo;

    @TableField("occur_date")
    private String occurDate;

    @TableField("loan_cust_no")
    private String loanCustNo;

    @TableField("cust_name")
    private String custName;

    @TableField("buss_type")
    private String bussType;

    @TableField("occur_type")
    private String occurType;

    @TableField("is_credit_cyc")
    private String isCreditCyc;

    @TableField("curr_type")
    private String currType;

    @TableField("buss_amt")
    private BigDecimal bussAmt;

    @TableField("loan_pert")
    private BigDecimal loanPert;

    @TableField("term_year")
    private Integer termYear;

    @TableField("term_mth")
    private Integer termMth;

    @TableField("term_day")
    private Integer termDay;

    @TableField("base_rate_type")
    private String baseRateType;

    @TableField("base_rate")
    private BigDecimal baseRate;

    @TableField("float_type")
    private String floatType;

    @TableField("rate_float")
    private BigDecimal rateFloat;

    private BigDecimal rate;

    @TableField("pay_times")
    private Integer payTimes;

    @TableField("pay_type")
    private String payType;

    private String direction;

    @TableField("loan_use")
    private String loanUse;

    @TableField("pay_source")
    private String paySource;

    @TableField("putout_date")
    private String putoutDate;

    @TableField("matu_date")
    private String matuDate;

    @TableField("vouch_type")
    private String vouchType;

    @TableField("apply_type")
    private String applyType;

    @TableField("extend_times")
    private Integer extendTimes;

    @TableField("actu_out_amt")
    private BigDecimal actuOutAmt;

    private BigDecimal bal;

    @TableField("norm_bal")
    private BigDecimal normBal;

    @TableField("dlay_bal")
    private BigDecimal dlayBal;

    @TableField("dull_bal")
    private BigDecimal dullBal;

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

    @TableField("five_class")
    private String fiveClass;

    @TableField("class_date")
    private String classDate;

    @TableField("mge_org")
    private String mgeOrg;

    @TableField("mgr_no")
    private String mgrNo;

    @TableField("operate_org")
    private String operateOrg;

    private String operator;

    @TableField("operate_date")
    private String operateDate;

    @TableField("reg_org")
    private String regOrg;

    private String register;

    @TableField("reg_date")
    private String regDate;

    @TableField("inte_settle_type")
    private String inteSettleType;

    @TableField("is_bad")
    private String isBad;

    @TableField("frz_amt")
    private BigDecimal frzAmt;

    @TableField("con_crl_type")
    private String conCrlType;

    @TableField("shift_type")
    private String shiftType;

    @TableField("due_intr_days")
    private Integer dueIntrDays;

    @TableField("reson_type")
    private String resonType;

    @TableField("shift_bal")
    private BigDecimal shiftBal;

    @TableField("is_vc_vouch")
    private String isVcVouch;

    @TableField("loan_use_add")
    private String loanUseAdd;

    @TableField("finsh_type")
    private String finshType;

    @TableField("finsh_date")
    private String finshDate;

    @TableField("sts_flag")
    private String stsFlag;

    @TableField("src_dt")
    private String srcDt;

    @TableField("etl_dt")
    private String etlDt;


}
