package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 财务子表
* @TableName jsh_account_item
*/
@Data
public class AccountItem implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 表头Id
    */
    @NotNull(message="[表头Id]不能为空")
    @ApiModelProperty("表头Id")
    private Long headerId;
    /**
    * 账户Id
    */
    @ApiModelProperty("账户Id")
    private Long accountId;
    /**
    * 收支项目Id
    */
    @ApiModelProperty("收支项目Id")
    private Long inOutItemId;
    /**
    * 单据id
    */
    @ApiModelProperty("单据id")
    private Long billId;
    /**
    * 应收欠款
    */
    @ApiModelProperty("应收欠款")
    private BigDecimal needDebt;
    /**
    * 已收欠款
    */
    @ApiModelProperty("已收欠款")
    private BigDecimal finishDebt;
    /**
    * 单项金额
    */
    @ApiModelProperty("单项金额")
    private BigDecimal eachAmount;
    /**
    * 单据备注
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("单据备注")
    @Length(max= 100,message="编码长度不能超过100")
    private String remark;
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
    * 表头Id
    */
    private void setHeaderId(Long headerId){
    this.headerId = headerId;
    }

    /**
    * 账户Id
    */
    private void setAccountId(Long accountId){
    this.accountId = accountId;
    }

    /**
    * 收支项目Id
    */
    private void setInOutItemId(Long inOutItemId){
    this.inOutItemId = inOutItemId;
    }

    /**
    * 单据id
    */
    private void setBillId(Long billId){
    this.billId = billId;
    }

    /**
    * 应收欠款
    */
    private void setNeedDebt(BigDecimal needDebt){
    this.needDebt = needDebt;
    }

    /**
    * 已收欠款
    */
    private void setFinishDebt(BigDecimal finishDebt){
    this.finishDebt = finishDebt;
    }

    /**
    * 单项金额
    */
    private void setEachAmount(BigDecimal eachAmount){
    this.eachAmount = eachAmount;
    }

    /**
    * 单据备注
    */
    private void setRemark(String remark){
    this.remark = remark;
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
    * 表头Id
    */
    private Long getHeaderId(){
    return this.headerId;
    }

    /**
    * 账户Id
    */
    private Long getAccountId(){
    return this.accountId;
    }

    /**
    * 收支项目Id
    */
    private Long getInOutItemId(){
    return this.inOutItemId;
    }

    /**
    * 单据id
    */
    private Long getBillId(){
    return this.billId;
    }

    /**
    * 应收欠款
    */
    private BigDecimal getNeedDebt(){
    return this.needDebt;
    }

    /**
    * 已收欠款
    */
    private BigDecimal getFinishDebt(){
    return this.finishDebt;
    }

    /**
    * 单项金额
    */
    private BigDecimal getEachAmount(){
    return this.eachAmount;
    }

    /**
    * 单据备注
    */
    private String getRemark(){
    return this.remark;
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
