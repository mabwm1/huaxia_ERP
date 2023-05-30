package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 财务主表
* @TableName jsh_account_head
*/
@Data
public class AccountHead implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 类型(支出/收入/收款/付款/转账)
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("类型(支出/收入/收款/付款/转账)")
    @Length(max= 50,message="编码长度不能超过50")
    private String type;
    /**
    * 单位Id(收款/付款单位)
    */
    @ApiModelProperty("单位Id(收款/付款单位)")
    private Long organId;
    /**
    * 经手人id
    */
    @ApiModelProperty("经手人id")
    private Long handsPersonId;
    /**
    * 操作员
    */
    @ApiModelProperty("操作员")
    private Long creator;
    /**
    * 变动金额(优惠/收款/付款/实付)
    */
    @ApiModelProperty("变动金额(优惠/收款/付款/实付)")
    private BigDecimal changeAmount;
    /**
    * 优惠金额
    */
    @ApiModelProperty("优惠金额")
    private BigDecimal discountMoney;
    /**
    * 合计金额
    */
    @ApiModelProperty("合计金额")
    private BigDecimal totalPrice;
    /**
    * 账户(收款/付款)
    */
    @ApiModelProperty("账户(收款/付款)")
    private Long accountId;
    /**
    * 单据编号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("单据编号")
    @Length(max= 50,message="编码长度不能超过50")
    private String billNo;
    /**
    * 单据日期
    */
    @ApiModelProperty("单据日期")
    private Date billTime;
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
    * 状态，0未审核、1已审核、9审核中
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("状态，0未审核、1已审核、9审核中")
    @Length(max= 1,message="编码长度不能超过1")
    private String status;
    /**
    * 单据来源，0-pc，1-手机
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("单据来源，0-pc，1-手机")
    @Length(max= 1,message="编码长度不能超过1")
    private String source;
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
    * 类型(支出/收入/收款/付款/转账)
    */
    private void setType(String type){
    this.type = type;
    }

    /**
    * 单位Id(收款/付款单位)
    */
    private void setOrganId(Long organId){
    this.organId = organId;
    }

    /**
    * 经手人id
    */
    private void setHandsPersonId(Long handsPersonId){
    this.handsPersonId = handsPersonId;
    }

    /**
    * 操作员
    */
    private void setCreator(Long creator){
    this.creator = creator;
    }

    /**
    * 变动金额(优惠/收款/付款/实付)
    */
    private void setChangeAmount(BigDecimal changeAmount){
    this.changeAmount = changeAmount;
    }

    /**
    * 优惠金额
    */
    private void setDiscountMoney(BigDecimal discountMoney){
    this.discountMoney = discountMoney;
    }

    /**
    * 合计金额
    */
    private void setTotalPrice(BigDecimal totalPrice){
    this.totalPrice = totalPrice;
    }

    /**
    * 账户(收款/付款)
    */
    private void setAccountId(Long accountId){
    this.accountId = accountId;
    }

    /**
    * 单据编号
    */
    private void setBillNo(String billNo){
    this.billNo = billNo;
    }

    /**
    * 单据日期
    */
    private void setBillTime(Date billTime){
    this.billTime = billTime;
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
    * 状态，0未审核、1已审核、9审核中
    */
    private void setStatus(String status){
    this.status = status;
    }

    /**
    * 单据来源，0-pc，1-手机
    */
    private void setSource(String source){
    this.source = source;
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
    * 类型(支出/收入/收款/付款/转账)
    */
    private String getType(){
    return this.type;
    }

    /**
    * 单位Id(收款/付款单位)
    */
    private Long getOrganId(){
    return this.organId;
    }

    /**
    * 经手人id
    */
    private Long getHandsPersonId(){
    return this.handsPersonId;
    }

    /**
    * 操作员
    */
    private Long getCreator(){
    return this.creator;
    }

    /**
    * 变动金额(优惠/收款/付款/实付)
    */
    private BigDecimal getChangeAmount(){
    return this.changeAmount;
    }

    /**
    * 优惠金额
    */
    private BigDecimal getDiscountMoney(){
    return this.discountMoney;
    }

    /**
    * 合计金额
    */
    private BigDecimal getTotalPrice(){
    return this.totalPrice;
    }

    /**
    * 账户(收款/付款)
    */
    private Long getAccountId(){
    return this.accountId;
    }

    /**
    * 单据编号
    */
    private String getBillNo(){
    return this.billNo;
    }

    /**
    * 单据日期
    */
    private Date getBillTime(){
    return this.billTime;
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
    * 状态，0未审核、1已审核、9审核中
    */
    private String getStatus(){
    return this.status;
    }

    /**
    * 单据来源，0-pc，1-手机
    */
    private String getSource(){
    return this.source;
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
