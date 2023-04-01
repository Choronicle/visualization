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
 * huanb_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.huanb_info")
public class HuanbInfo implements Serializable {


    @TableId(value = "tran_flag", type = IdType.AUTO)
    private String tranFlag;

    private String uid;

    @TableField("cust_name")
    private String custName;

    @TableField("acct_no")
    private String acctNo;

    @TableField("tran_date")
    private String tranDate;

    @TableField("tran_time")
    private String tranTime;

    @TableField("tran_amt")
    private BigDecimal tranAmt;

    private BigDecimal bal;

    @TableField("tran_code")
    private String tranCode;

    @TableField("dr_cr_code")
    private String drCrCode;

    @TableField("pay_term")
    private Integer payTerm;

    @TableField("tran_teller_no")
    private String tranTellerNo;

    @TableField("pprd_rfn_amt")
    private BigDecimal pprdRfnAmt;

    @TableField("pprd_amotz_intr")
    private BigDecimal pprdAmotzIntr;

    @TableField("tran_log_no")
    private String tranLogNo;

    @TableField("tran_type")
    private String tranType;

    @TableField("dscrp_code")
    private String dscrpCode;

    private String remark;

    @TableField("etl_dt")
    private String etlDt;


}
