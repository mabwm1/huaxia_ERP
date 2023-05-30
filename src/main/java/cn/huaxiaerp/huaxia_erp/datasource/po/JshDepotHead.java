package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 单据主表
* @TableName jsh_depot_head
*/
@Data
public class JshDepotHead implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 类型(出库/入库)
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("类型(出库/入库)")
    @Length(max= 50,message="编码长度不能超过50")
    private String type;
    /**
    * 出入库分类
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("出入库分类")
    @Length(max= 50,message="编码长度不能超过50")
    private String subType;
    /**
    * 初始票据号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("初始票据号")
    @Length(max= 50,message="编码长度不能超过50")
    private String defaultNumber;
    /**
    * 票据号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("票据号")
    @Length(max= 50,message="编码长度不能超过50")
    private String number;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 出入库时间
    */
    @ApiModelProperty("出入库时间")
    private Date operTime;
    /**
    * 供应商id
    */
    @ApiModelProperty("供应商id")
    private Long organId;
    /**
    * 操作员
    */
    @ApiModelProperty("操作员")
    private Long creator;
    /**
    * 账户id
    */
    @ApiModelProperty("账户id")
    private Long accountId;
    /**
    * 变动金额(收款/付款)
    */
    @ApiModelProperty("变动金额(收款/付款)")
    private BigDecimal changeAmount;
    /**
    * 找零金额
    */
    @ApiModelProperty("找零金额")
    private BigDecimal backAmount;
    /**
    * 合计金额
    */
    @ApiModelProperty("合计金额")
    private BigDecimal totalPrice;
    /**
    * 付款类型(现金、记账等)
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("付款类型(现金、记账等)")
    @Length(max= 50,message="编码长度不能超过50")
    private String payType;
    /**
    * 单据类型
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("单据类型")
    @Length(max= 50,message="编码长度不能超过50")
    private String billType;
    /**
    * 备注
    */
    @Size(max= 1000,message="编码长度不能超过1000")
    @ApiModelProperty("备注")
    @Length(max= 1000,message="编码长度不能超过1,000")
    private String remark;
    /**
    * 附件名称
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("附件名称")
    @Length(max= 500,message="编码长度不能超过500")
    private String fileName;
    /**
    * 业务员（可以多个）
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("业务员（可以多个）")
    @Length(max= 50,message="编码长度不能超过50")
    private String salesMan;
    /**
    * 多账户ID列表
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("多账户ID列表")
    @Length(max= 50,message="编码长度不能超过50")
    private String accountIdList;
    /**
    * 多账户金额列表
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("多账户金额列表")
    @Length(max= 200,message="编码长度不能超过200")
    private String accountMoneyList;
    /**
    * 优惠率
    */
    @ApiModelProperty("优惠率")
    private BigDecimal discount;
    /**
    * 优惠金额
    */
    @ApiModelProperty("优惠金额")
    private BigDecimal discountMoney;
    /**
    * 优惠后金额
    */
    @ApiModelProperty("优惠后金额")
    private BigDecimal discountLastMoney;
    /**
    * 销售或采购费用合计
    */
    @ApiModelProperty("销售或采购费用合计")
    private BigDecimal otherMoney;
    /**
    * 订金
    */
    @ApiModelProperty("订金")
    private BigDecimal deposit;
    /**
    * 状态，0未审核、1已审核、2完成采购|销售、3部分采购|销售、9审核中
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("状态，0未审核、1已审核、2完成采购|销售、3部分采购|销售、9审核中")
    @Length(max= 1,message="编码长度不能超过1")
    private String status;
    /**
    * 采购状态，0未采购、2完成采购、3部分采购
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("采购状态，0未采购、2完成采购、3部分采购")
    @Length(max= 1,message="编码长度不能超过1")
    private String purchaseStatus;
    /**
    * 单据来源，0-pc，1-手机
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("单据来源，0-pc，1-手机")
    @Length(max= 1,message="编码长度不能超过1")
    private String source;
    /**
    * 关联订单号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("关联订单号")
    @Length(max= 50,message="编码长度不能超过50")
    private String linkNumber;
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
    * 类型(出库/入库)
    */
    private void setType(String type){
    this.type = type;
    }

    /**
    * 出入库分类
    */
    private void setSubType(String subType){
    this.subType = subType;
    }

    /**
    * 初始票据号
    */
    private void setDefaultNumber(String defaultNumber){
    this.defaultNumber = defaultNumber;
    }

    /**
    * 票据号
    */
    private void setNumber(String number){
    this.number = number;
    }

    /**
    * 创建时间
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 出入库时间
    */
    private void setOperTime(Date operTime){
    this.operTime = operTime;
    }

    /**
    * 供应商id
    */
    private void setOrganId(Long organId){
    this.organId = organId;
    }

    /**
    * 操作员
    */
    private void setCreator(Long creator){
    this.creator = creator;
    }

    /**
    * 账户id
    */
    private void setAccountId(Long accountId){
    this.accountId = accountId;
    }

    /**
    * 变动金额(收款/付款)
    */
    private void setChangeAmount(BigDecimal changeAmount){
    this.changeAmount = changeAmount;
    }

    /**
    * 找零金额
    */
    private void setBackAmount(BigDecimal backAmount){
    this.backAmount = backAmount;
    }

    /**
    * 合计金额
    */
    private void setTotalPrice(BigDecimal totalPrice){
    this.totalPrice = totalPrice;
    }

    /**
    * 付款类型(现金、记账等)
    */
    private void setPayType(String payType){
    this.payType = payType;
    }

    /**
    * 单据类型
    */
    private void setBillType(String billType){
    this.billType = billType;
    }

    /**
    * 备注
    */
    private void setRemark(String remark){
    this.remark = remark;
    }

    /**
    * 附件名称
    */
    private void setFileName(String fileName){
    this.fileName = fileName;
    }

    /**
    * 业务员（可以多个）
    */
    private void setSalesMan(String salesMan){
    this.salesMan = salesMan;
    }

    /**
    * 多账户ID列表
    */
    private void setAccountIdList(String accountIdList){
    this.accountIdList = accountIdList;
    }

    /**
    * 多账户金额列表
    */
    private void setAccountMoneyList(String accountMoneyList){
    this.accountMoneyList = accountMoneyList;
    }

    /**
    * 优惠率
    */
    private void setDiscount(BigDecimal discount){
    this.discount = discount;
    }

    /**
    * 优惠金额
    */
    private void setDiscountMoney(BigDecimal discountMoney){
    this.discountMoney = discountMoney;
    }

    /**
    * 优惠后金额
    */
    private void setDiscountLastMoney(BigDecimal discountLastMoney){
    this.discountLastMoney = discountLastMoney;
    }

    /**
    * 销售或采购费用合计
    */
    private void setOtherMoney(BigDecimal otherMoney){
    this.otherMoney = otherMoney;
    }

    /**
    * 订金
    */
    private void setDeposit(BigDecimal deposit){
    this.deposit = deposit;
    }

    /**
    * 状态，0未审核、1已审核、2完成采购|销售、3部分采购|销售、9审核中
    */
    private void setStatus(String status){
    this.status = status;
    }

    /**
    * 采购状态，0未采购、2完成采购、3部分采购
    */
    private void setPurchaseStatus(String purchaseStatus){
    this.purchaseStatus = purchaseStatus;
    }

    /**
    * 单据来源，0-pc，1-手机
    */
    private void setSource(String source){
    this.source = source;
    }

    /**
    * 关联订单号
    */
    private void setLinkNumber(String linkNumber){
    this.linkNumber = linkNumber;
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
    * 类型(出库/入库)
    */
    private String getType(){
    return this.type;
    }

    /**
    * 出入库分类
    */
    private String getSubType(){
    return this.subType;
    }

    /**
    * 初始票据号
    */
    private String getDefaultNumber(){
    return this.defaultNumber;
    }

    /**
    * 票据号
    */
    private String getNumber(){
    return this.number;
    }

    /**
    * 创建时间
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 出入库时间
    */
    private Date getOperTime(){
    return this.operTime;
    }

    /**
    * 供应商id
    */
    private Long getOrganId(){
    return this.organId;
    }

    /**
    * 操作员
    */
    private Long getCreator(){
    return this.creator;
    }

    /**
    * 账户id
    */
    private Long getAccountId(){
    return this.accountId;
    }

    /**
    * 变动金额(收款/付款)
    */
    private BigDecimal getChangeAmount(){
    return this.changeAmount;
    }

    /**
    * 找零金额
    */
    private BigDecimal getBackAmount(){
    return this.backAmount;
    }

    /**
    * 合计金额
    */
    private BigDecimal getTotalPrice(){
    return this.totalPrice;
    }

    /**
    * 付款类型(现金、记账等)
    */
    private String getPayType(){
    return this.payType;
    }

    /**
    * 单据类型
    */
    private String getBillType(){
    return this.billType;
    }

    /**
    * 备注
    */
    private String getRemark(){
    return this.remark;
    }

    /**
    * 附件名称
    */
    private String getFileName(){
    return this.fileName;
    }

    /**
    * 业务员（可以多个）
    */
    private String getSalesMan(){
    return this.salesMan;
    }

    /**
    * 多账户ID列表
    */
    private String getAccountIdList(){
    return this.accountIdList;
    }

    /**
    * 多账户金额列表
    */
    private String getAccountMoneyList(){
    return this.accountMoneyList;
    }

    /**
    * 优惠率
    */
    private BigDecimal getDiscount(){
    return this.discount;
    }

    /**
    * 优惠金额
    */
    private BigDecimal getDiscountMoney(){
    return this.discountMoney;
    }

    /**
    * 优惠后金额
    */
    private BigDecimal getDiscountLastMoney(){
    return this.discountLastMoney;
    }

    /**
    * 销售或采购费用合计
    */
    private BigDecimal getOtherMoney(){
    return this.otherMoney;
    }

    /**
    * 订金
    */
    private BigDecimal getDeposit(){
    return this.deposit;
    }

    /**
    * 状态，0未审核、1已审核、2完成采购|销售、3部分采购|销售、9审核中
    */
    private String getStatus(){
    return this.status;
    }

    /**
    * 采购状态，0未采购、2完成采购、3部分采购
    */
    private String getPurchaseStatus(){
    return this.purchaseStatus;
    }

    /**
    * 单据来源，0-pc，1-手机
    */
    private String getSource(){
    return this.source;
    }

    /**
    * 关联订单号
    */
    private String getLinkNumber(){
    return this.linkNumber;
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
