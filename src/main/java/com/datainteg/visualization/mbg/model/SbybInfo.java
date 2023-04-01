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
 * sbyb_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.sbyb_info")
public class SbybInfo implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField("cust_name")
    private String custName;

    @TableField("tran_date")
    private String tranDate;

    @TableField("tran_sts")
    private String tranSts;

    @TableField("tran_org")
    private String tranOrg;

    @TableField("tran_teller_no")
    private String tranTellerNo;

    @TableField("tran_amt_fen")
    private BigDecimal tranAmtFen;

    @TableField("tran_type")
    private String tranType;

    @TableField("return_msg")
    private String returnMsg;

    @TableField("etl_dt")
    private String etlDt;


}
