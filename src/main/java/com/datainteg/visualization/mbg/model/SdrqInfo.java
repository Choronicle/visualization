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
 * sdrq_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.sdrq_info")
public class SdrqInfo implements Serializable {


    @TableId(value = "hosehld_no", type = IdType.AUTO)
    private String hosehldNo;

    @TableField("acct_no")
    private String acctNo;

    @TableField("cust_name")
    private String custName;

    @TableField("tran_type")
    private String tranType;

    @TableField("tran_date")
    private String tranDate;

    @TableField("tran_amt_fen")
    private BigDecimal tranAmtFen;

    @TableField("channel_flg")
    private String channelFlg;

    @TableField("tran_org")
    private String tranOrg;

    @TableField("tran_teller_no")
    private String tranTellerNo;

    @TableField("tran_log_no")
    private String tranLogNo;

    @TableField("batch_no")
    private String batchNo;

    @TableField("tran_sts")
    private String tranSts;

    @TableField("return_msg")
    private String returnMsg;

    @TableField("etl_dt")
    private String etlDt;

    private String uid;


}
