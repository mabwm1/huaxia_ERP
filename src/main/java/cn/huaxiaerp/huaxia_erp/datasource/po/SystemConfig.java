package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 系统参数
* @TableName jsh_system_config
*/
@Data
public class SystemConfig implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 公司名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("公司名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String companyName;
    /**
    * 公司联系人
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("公司联系人")
    @Length(max= 20,message="编码长度不能超过20")
    private String companyContacts;
    /**
    * 公司地址
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("公司地址")
    @Length(max= 50,message="编码长度不能超过50")
    private String companyAddress;
    /**
    * 公司电话
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("公司电话")
    @Length(max= 20,message="编码长度不能超过20")
    private String companyTel;
    /**
    * 公司传真
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("公司传真")
    @Length(max= 20,message="编码长度不能超过20")
    private String companyFax;
    /**
    * 公司邮编
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("公司邮编")
    @Length(max= 20,message="编码长度不能超过20")
    private String companyPostCode;
    /**
    * 销售协议
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("销售协议")
    @Length(max= 500,message="编码长度不能超过500")
    private String saleAgreement;
    /**
    * 仓库启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("仓库启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String depotFlag;
    /**
    * 客户启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("客户启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String customerFlag;
    /**
    * 负库存启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("负库存启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String minusStockFlag;
    /**
    * 以销定购启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("以销定购启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String purchaseBySaleFlag;
    /**
    * 多级审核启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("多级审核启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String multiLevelApprovalFlag;
    /**
    * 流程类型，可多选
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("流程类型，可多选")
    @Length(max= 200,message="编码长度不能超过200")
    private String multiBillType;
    /**
    * 强审核启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("强审核启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String forceApprovalFlag;
    /**
    * 更新单价启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("更新单价启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String updateUnitPriceFlag;
    /**
    * 超出关联单据启用标记，0未启用，1启用
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("超出关联单据启用标记，0未启用，1启用")
    @Length(max= 1,message="编码长度不能超过1")
    private String overLinkBillFlag;
    /**
    * 租户id
    */
    @ApiModelProperty("租户id")
    private Long tenantId;
    /**
    * 删除标记，0未删除，1删除
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("删除标记，0未删除，1删除")
    @Length(max= 1,message="编码长度不能超过1")
    private String deleteFlag;

    /**
    * 主键
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 公司名称
    */
    private void setCompanyName(String companyName){
    this.companyName = companyName;
    }

    /**
    * 公司联系人
    */
    private void setCompanyContacts(String companyContacts){
    this.companyContacts = companyContacts;
    }

    /**
    * 公司地址
    */
    private void setCompanyAddress(String companyAddress){
    this.companyAddress = companyAddress;
    }

    /**
    * 公司电话
    */
    private void setCompanyTel(String companyTel){
    this.companyTel = companyTel;
    }

    /**
    * 公司传真
    */
    private void setCompanyFax(String companyFax){
    this.companyFax = companyFax;
    }

    /**
    * 公司邮编
    */
    private void setCompanyPostCode(String companyPostCode){
    this.companyPostCode = companyPostCode;
    }

    /**
    * 销售协议
    */
    private void setSaleAgreement(String saleAgreement){
    this.saleAgreement = saleAgreement;
    }

    /**
    * 仓库启用标记，0未启用，1启用
    */
    private void setDepotFlag(String depotFlag){
    this.depotFlag = depotFlag;
    }

    /**
    * 客户启用标记，0未启用，1启用
    */
    private void setCustomerFlag(String customerFlag){
    this.customerFlag = customerFlag;
    }

    /**
    * 负库存启用标记，0未启用，1启用
    */
    private void setMinusStockFlag(String minusStockFlag){
    this.minusStockFlag = minusStockFlag;
    }

    /**
    * 以销定购启用标记，0未启用，1启用
    */
    private void setPurchaseBySaleFlag(String purchaseBySaleFlag){
    this.purchaseBySaleFlag = purchaseBySaleFlag;
    }

    /**
    * 多级审核启用标记，0未启用，1启用
    */
    private void setMultiLevelApprovalFlag(String multiLevelApprovalFlag){
    this.multiLevelApprovalFlag = multiLevelApprovalFlag;
    }

    /**
    * 流程类型，可多选
    */
    private void setMultiBillType(String multiBillType){
    this.multiBillType = multiBillType;
    }

    /**
    * 强审核启用标记，0未启用，1启用
    */
    private void setForceApprovalFlag(String forceApprovalFlag){
    this.forceApprovalFlag = forceApprovalFlag;
    }

    /**
    * 更新单价启用标记，0未启用，1启用
    */
    private void setUpdateUnitPriceFlag(String updateUnitPriceFlag){
    this.updateUnitPriceFlag = updateUnitPriceFlag;
    }

    /**
    * 超出关联单据启用标记，0未启用，1启用
    */
    private void setOverLinkBillFlag(String overLinkBillFlag){
    this.overLinkBillFlag = overLinkBillFlag;
    }

    /**
    * 租户id
    */
    private void setTenantId(Long tenantId){
    this.tenantId = tenantId;
    }

    /**
    * 删除标记，0未删除，1删除
    */
    private void setDeleteFlag(String deleteFlag){
    this.deleteFlag = deleteFlag;
    }


    /**
    * 主键
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 公司名称
    */
    private String getCompanyName(){
    return this.companyName;
    }

    /**
    * 公司联系人
    */
    private String getCompanyContacts(){
    return this.companyContacts;
    }

    /**
    * 公司地址
    */
    private String getCompanyAddress(){
    return this.companyAddress;
    }

    /**
    * 公司电话
    */
    private String getCompanyTel(){
    return this.companyTel;
    }

    /**
    * 公司传真
    */
    private String getCompanyFax(){
    return this.companyFax;
    }

    /**
    * 公司邮编
    */
    private String getCompanyPostCode(){
    return this.companyPostCode;
    }

    /**
    * 销售协议
    */
    private String getSaleAgreement(){
    return this.saleAgreement;
    }

    /**
    * 仓库启用标记，0未启用，1启用
    */
    private String getDepotFlag(){
    return this.depotFlag;
    }

    /**
    * 客户启用标记，0未启用，1启用
    */
    private String getCustomerFlag(){
    return this.customerFlag;
    }

    /**
    * 负库存启用标记，0未启用，1启用
    */
    private String getMinusStockFlag(){
    return this.minusStockFlag;
    }

    /**
    * 以销定购启用标记，0未启用，1启用
    */
    private String getPurchaseBySaleFlag(){
    return this.purchaseBySaleFlag;
    }

    /**
    * 多级审核启用标记，0未启用，1启用
    */
    private String getMultiLevelApprovalFlag(){
    return this.multiLevelApprovalFlag;
    }

    /**
    * 流程类型，可多选
    */
    private String getMultiBillType(){
    return this.multiBillType;
    }

    /**
    * 强审核启用标记，0未启用，1启用
    */
    private String getForceApprovalFlag(){
    return this.forceApprovalFlag;
    }

    /**
    * 更新单价启用标记，0未启用，1启用
    */
    private String getUpdateUnitPriceFlag(){
    return this.updateUnitPriceFlag;
    }

    /**
    * 超出关联单据启用标记，0未启用，1启用
    */
    private String getOverLinkBillFlag(){
    return this.overLinkBillFlag;
    }

    /**
    * 租户id
    */
    private Long getTenantId(){
    return this.tenantId;
    }

    /**
    * 删除标记，0未删除，1删除
    */
    private String getDeleteFlag(){
    return this.deleteFlag;
    }

}
