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
 * gzdf_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.gzdf_info")
public class GzdfInfo implements Serializable {


    @TableId(value = "belong_org", type = IdType.AUTO)
    private String belongOrg;

    @TableField("ent_acct")
    private String entAcct;

    @TableField("ent_name")
    private String entName;

    @TableField("eng_cert_no")
    private String engCertNo;

    @TableField("acct_no")
    private String acctNo;

    @TableField("cust_name")
    private String custName;

    private String uid;

    @TableField("tran_date")
    private String tranDate;

    @TableField("tran_amt")
    private BigDecimal tranAmt;

    @TableField("tran_log_no")
    private String tranLogNo;

    @TableField("is_secu_card")
    private String isSecuCard;

    @TableField("trna_channel")
    private String trnaChannel;

    @TableField("batch_no")
    private String batchNo;

    @TableField("etl_dt")
    private String etlDt;


}
