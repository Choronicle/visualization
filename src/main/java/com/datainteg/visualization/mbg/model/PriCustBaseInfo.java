package com.datainteg.visualization.mbg.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * pri_cust_base_info
 * </p>
 *
 * @author generator
 * @since 2023-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("dm.pri_cust_base_info")
public class PriCustBaseInfo implements Serializable {


    @TableId(value = "uid", type = IdType.AUTO)
    private String uid;

    @TableField("cert_type")
    private String certType;

    @TableField("cust_no")
    private String custNo;

    @TableField("cust_name")
    private String custName;

    private String sex;

    private String birthday;

    @TableField("cer_expd_date")
    private String cerExpdDate;

    private String marrige;

    private String education;

    private String phone;

    @TableField("home_add")
    private String homeAdd;

    @TableField("reg_add")
    private String regAdd;

    private String career;

    @TableField("prof_titl")
    private String profTitl;

    private String country;

    @TableField("is_employee")
    private String isEmployee;

    @TableField("is_shareholder")
    private String isShareholder;

    @TableField("is_black")
    private String isBlack;

    @TableField("is_contact")
    private String isContact;

    @TableField("mgr_name")
    private String mgrName;

    @TableField("mgr_no")
    private String mgrNo;

    @TableField("mge_org_name")
    private String mgeOrgName;

    @TableField("mge_org")
    private String mgeOrg;

    @TableField("create_date")
    private String createDate;

    @TableField("open_org")
    private String openOrg;

    @TableField("open_teller_no")
    private String openTellerNo;

    @TableField("update_date")
    private String updateDate;

    @TableField("update_org")
    private String updateOrg;

    @TableField("update_teller_no")
    private String updateTellerNo;

    @TableField("etl_dt")
    private String etlDt;

    @TableField("is_mgr_dep")
    private String isMgrDep;


}
