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
 * pri_cust_asset_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.pri_cust_asset_info")
public class PriCustAssetInfo implements Serializable {


    @TableId(value = "cust_no", type = IdType.AUTO)
    private String custNo;

    @TableField("cust_name")
    private String custName;

    private String uid;

    @TableField("belong_org")
    private String belongOrg;

    @TableField("exam_org")
    private String examOrg;

    @TableField("all_bal")
    private BigDecimal allBal;

    @TableField("avg_mth")
    private BigDecimal avgMth;

    @TableField("avg_qur")
    private BigDecimal avgQur;

    @TableField("avg_year")
    private BigDecimal avgYear;

    @TableField("sa_bal")
    private BigDecimal saBal;

    @TableField("td_bal")
    private BigDecimal tdBal;

    @TableField("fin_bal")
    private BigDecimal finBal;

    @TableField("sa_crd_bal")
    private BigDecimal saCrdBal;

    @TableField("td_crd_bal")
    private BigDecimal tdCrdBal;

    @TableField("sa_td_bal")
    private BigDecimal saTdBal;

    @TableField("ntc_bal")
    private BigDecimal ntcBal;

    @TableField("td_3m_bal")
    private BigDecimal td3mBal;

    @TableField("td_6m_bal")
    private BigDecimal td6mBal;

    @TableField("td_1y_bal")
    private BigDecimal td1yBal;

    @TableField("td_2y_bal")
    private BigDecimal td2yBal;

    @TableField("td_3y_bal")
    private BigDecimal td3yBal;

    @TableField("td_5y_bal")
    private BigDecimal td5yBal;

    @TableField("oth_td_bal")
    private BigDecimal othTdBal;

    @TableField("cd_bal")
    private BigDecimal cdBal;

    @TableField("etl_dt")
    private String etlDt;


}
