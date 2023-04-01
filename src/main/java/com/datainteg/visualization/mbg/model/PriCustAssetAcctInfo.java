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
 * pri_cust_asset_acct_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.pri_cust_asset_acct_info")
public class PriCustAssetAcctInfo implements Serializable {


    @TableId(value = "cust_no", type = IdType.AUTO)
    private String custNo;

    @TableField("cust_name")
    private String custName;

    private String uid;

    @TableField("acct_no")
    private String acctNo;

    @TableField("card_no")
    private String cardNo;

    @TableField("curr_type")
    private String currType;

    @TableField("subject_no")
    private String subjectNo;

    @TableField("prod_type")
    private String prodType;

    private String term;

    private BigDecimal rate;

    @TableField("auto_dp_flg")
    private String autoDpFlg;

    @TableField("belong_org")
    private String belongOrg;

    @TableField("exam_org")
    private String examOrg;

    @TableField("open_org")
    private String openOrg;

    @TableField("open_date")
    private String openDate;

    @TableField("open_teller_no")
    private String openTellerNo;

    @TableField("matu_date")
    private String matuDate;

    @TableField("acct_char")
    private String acctChar;

    @TableField("deps_type")
    private String depsType;

    @TableField("prod_code")
    private String prodCode;

    @TableField("clsd_org")
    private String clsdOrg;

    @TableField("clsd_date")
    private String clsdDate;

    @TableField("clsd_teller_no")
    private String clsdTellerNo;

    @TableField("is_secu_card")
    private String isSecuCard;

    @TableField("acct_sts")
    private String acctSts;

    @TableField("frz_sts")
    private String frzSts;

    @TableField("stp_sts")
    private String stpSts;

    @TableField("acct_bal")
    private BigDecimal acctBal;

    private BigDecimal bal;

    @TableField("avg_mth")
    private BigDecimal avgMth;

    @TableField("avg_qur")
    private BigDecimal avgQur;

    @TableField("avg_year")
    private BigDecimal avgYear;

    @TableField("etl_dt")
    private String etlDt;


}
