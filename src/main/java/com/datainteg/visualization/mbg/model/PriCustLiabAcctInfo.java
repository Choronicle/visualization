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
 * pri_cust_liab_acct_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.pri_cust_liab_acct_info")
public class PriCustLiabAcctInfo implements Serializable {


    @TableField("loan_cust_no")
    private String loanCustNo;

    @TableId(value = "acct_no", type = IdType.AUTO)
    private String acctNo;

    @TableField("belong_org")
    private String belongOrg;

    @TableField("exam_org")
    private String examOrg;

    @TableField("cust_no")
    private String custNo;

    @TableField("cust_name")
    private String custName;

    private String uid;

    @TableField("begin_date")
    private String beginDate;

    @TableField("matu_date")
    private String matuDate;

    @TableField("settle_date")
    private String settleDate;

    @TableField("subject_no")
    private String subjectNo;

    @TableField("prod_type")
    private String prodType;

    @TableField("buss_type")
    private String bussType;

    @TableField("buss_type_name")
    private String bussTypeName;

    @TableField("loan_type")
    private String loanType;

    @TableField("float_tpename")
    private String floatTpename;

    @TableField("loan_amt")
    private BigDecimal loanAmt;

    @TableField("loan_bal")
    private BigDecimal loanBal;

    @TableField("loan_mgr_no")
    private String loanMgrNo;

    @TableField("loan_mgr_name")
    private String loanMgrName;

    @TableField("mgr_phone")
    private String mgrPhone;

    @TableField("vouch_type")
    private String vouchType;

    @TableField("putout_channel")
    private String putoutChannel;

    @TableField("next_repay_date")
    private String nextRepayDate;

    @TableField("is_mortgage")
    private String isMortgage;

    @TableField("is_online")
    private String isOnline;

    @TableField("is_extend")
    private String isExtend;

    @TableField("extend_date")
    private String extendDate;

    @TableField("ext_matu_date")
    private String extMatuDate;

    @TableField("repay_type")
    private String repayType;

    @TableField("term_mth")
    private String termMth;

    @TableField("five_class")
    private String fiveClass;

    @TableField("overdue_class")
    private String overdueClass;

    @TableField("overdue_flag")
    private String overdueFlag;

    @TableField("owed_int_flag")
    private String owedIntFlag;

    @TableField("contract_no")
    private String contractNo;

    @TableField("credit_amt")
    private BigDecimal creditAmt;

    @TableField("credit_begin_date")
    private String creditBeginDate;

    @TableField("credit_matu_date")
    private String creditMatuDate;

    @TableField("frst_intr")
    private BigDecimal frstIntr;

    @TableField("actu_intr")
    private BigDecimal actuIntr;

    @TableField("loan_mob_phone")
    private String loanMobPhone;

    @TableField("loan_use")
    private String loanUse;

    @TableField("inte_settle_type")
    private String inteSettleType;

    private String bankacct;

    @TableField("defect_type")
    private String defectType;

    @TableField("owed_int_in")
    private BigDecimal owedIntIn;

    @TableField("owed_int_out")
    private BigDecimal owedIntOut;

    @TableField("delay_bal")
    private BigDecimal delayBal;

    @TableField("industr_type")
    private String industrType;

    @TableField("industr_type_name")
    private String industrTypeName;

    @TableField("acct_sts")
    private String acctSts;

    @TableField("arti_ctrt_no")
    private String artiCtrtNo;

    @TableField("ext_ctrt_no")
    private String extCtrtNo;

    @TableField("flst_teller_no")
    private String flstTellerNo;

    @TableField("attract_no")
    private String attractNo;

    @TableField("attract_name")
    private String attractName;

    @TableField("loan_use_add")
    private String loanUseAdd;

    @TableField("putout_acct")
    private String putoutAcct;

    @TableField("is_book_acct")
    private String isBookAcct;

    @TableField("book_acct_buss")
    private String bookAcctBuss;

    @TableField("book_acct_amt")
    private String bookAcctAmt;

    @TableField("sub_buss_type")
    private String subBussType;

    @TableField("pro_char")
    private String proChar;

    @TableField("pro_char_ori")
    private String proCharOri;

    @TableField("pay_type")
    private String payType;

    @TableField("grntr_name")
    private String grntrName;

    @TableField("grntr_cert_no")
    private String grntrCertNo;

    @TableField("guar_no")
    private String guarNo;

    @TableField("guar_right_no")
    private String guarRightNo;

    @TableField("guar_name")
    private String guarName;

    @TableField("guar_amount")
    private BigDecimal guarAmount;

    @TableField("guar_add")
    private String guarAdd;

    @TableField("guar_eva_value")
    private BigDecimal guarEvaValue;

    @TableField("guar_con_value")
    private BigDecimal guarConValue;

    @TableField("guar_reg_date")
    private String guarRegDate;

    @TableField("guar_matu_date")
    private String guarMatuDate;

    @TableField("etl_dt")
    private String etlDt;


}
