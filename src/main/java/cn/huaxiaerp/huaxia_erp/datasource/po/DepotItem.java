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
* 单据子表
* @TableName jsh_depot_item
*/
@Data
public class DepotItem implements Serializable {

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
    * 商品Id
    */
    @NotNull(message="[商品Id]不能为空")
    @ApiModelProperty("商品Id")
    private Long materialId;
    /**
    * 商品扩展id
    */
    @ApiModelProperty("商品扩展id")
    private Long materialExtendId;
    /**
    * 商品计量单位
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("商品计量单位")
    @Length(max= 20,message="编码长度不能超过20")
    private String materialUnit;
    /**
    * 多属性
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("多属性")
    @Length(max= 50,message="编码长度不能超过50")
    private String sku;
    /**
    * 数量
    */
    @ApiModelProperty("数量")
    private BigDecimal operNumber;
    /**
    * 基础数量，如kg、瓶
    */
    @ApiModelProperty("基础数量，如kg、瓶")
    private BigDecimal basicNumber;
    /**
    * 单价
    */
    @ApiModelProperty("单价")
    private BigDecimal unitPrice;
    /**
    * 采购单价
    */
    @ApiModelProperty("采购单价")
    private BigDecimal purchaseUnitPrice;
    /**
    * 含税单价
    */
    @ApiModelProperty("含税单价")
    private BigDecimal taxUnitPrice;
    /**
    * 金额
    */
    @ApiModelProperty("金额")
    private BigDecimal allPrice;
    /**
    * 备注
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("备注")
    @Length(max= 200,message="编码长度不能超过200")
    private String remark;
    /**
    * 仓库ID
    */
    @ApiModelProperty("仓库ID")
    private Long depotId;
    /**
    * 调拨时，对方仓库Id
    */
    @ApiModelProperty("调拨时，对方仓库Id")
    private Long anotherDepotId;
    /**
    * 税率
    */
    @ApiModelProperty("税率")
    private BigDecimal taxRate;
    /**
    * 税额
    */
    @ApiModelProperty("税额")
    private BigDecimal taxMoney;
    /**
    * 价税合计
    */
    @ApiModelProperty("价税合计")
    private BigDecimal taxLastMoney;
    /**
    * 商品类型
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("商品类型")
    @Length(max= 20,message="编码长度不能超过20")
    private String materialType;
    /**
    * 序列号列表
    */
    @Size(max= 2000,message="编码长度不能超过2000")
    @ApiModelProperty("序列号列表")
    @Length(max= 2000,message="编码长度不能超过2,000")
    private String snList;
    /**
    * 批号
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("批号")
    @Length(max= 100,message="编码长度不能超过100")
    private String batchNumber;
    /**
    * 有效日期
    */
    @ApiModelProperty("有效日期")
    private Date expirationDate;
    /**
    * 关联明细id
    */
    @ApiModelProperty("关联明细id")
    private Long linkId;
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
    * 商品Id
    */
    private void setMaterialId(Long materialId){
    this.materialId = materialId;
    }

    /**
    * 商品扩展id
    */
    private void setMaterialExtendId(Long materialExtendId){
    this.materialExtendId = materialExtendId;
    }

    /**
    * 商品计量单位
    */
    private void setMaterialUnit(String materialUnit){
    this.materialUnit = materialUnit;
    }

    /**
    * 多属性
    */
    private void setSku(String sku){
    this.sku = sku;
    }

    /**
    * 数量
    */
    private void setOperNumber(BigDecimal operNumber){
    this.operNumber = operNumber;
    }

    /**
    * 基础数量，如kg、瓶
    */
    private void setBasicNumber(BigDecimal basicNumber){
    this.basicNumber = basicNumber;
    }

    /**
    * 单价
    */
    private void setUnitPrice(BigDecimal unitPrice){
    this.unitPrice = unitPrice;
    }

    /**
    * 采购单价
    */
    private void setPurchaseUnitPrice(BigDecimal purchaseUnitPrice){
    this.purchaseUnitPrice = purchaseUnitPrice;
    }

    /**
    * 含税单价
    */
    private void setTaxUnitPrice(BigDecimal taxUnitPrice){
    this.taxUnitPrice = taxUnitPrice;
    }

    /**
    * 金额
    */
    private void setAllPrice(BigDecimal allPrice){
    this.allPrice = allPrice;
    }

    /**
    * 备注
    */
    private void setRemark(String remark){
    this.remark = remark;
    }

    /**
    * 仓库ID
    */
    private void setDepotId(Long depotId){
    this.depotId = depotId;
    }

    /**
    * 调拨时，对方仓库Id
    */
    private void setAnotherDepotId(Long anotherDepotId){
    this.anotherDepotId = anotherDepotId;
    }

    /**
    * 税率
    */
    private void setTaxRate(BigDecimal taxRate){
    this.taxRate = taxRate;
    }

    /**
    * 税额
    */
    private void setTaxMoney(BigDecimal taxMoney){
    this.taxMoney = taxMoney;
    }

    /**
    * 价税合计
    */
    private void setTaxLastMoney(BigDecimal taxLastMoney){
    this.taxLastMoney = taxLastMoney;
    }

    /**
    * 商品类型
    */
    private void setMaterialType(String materialType){
    this.materialType = materialType;
    }

    /**
    * 序列号列表
    */
    private void setSnList(String snList){
    this.snList = snList;
    }

    /**
    * 批号
    */
    private void setBatchNumber(String batchNumber){
    this.batchNumber = batchNumber;
    }

    /**
    * 有效日期
    */
    private void setExpirationDate(Date expirationDate){
    this.expirationDate = expirationDate;
    }

    /**
    * 关联明细id
    */
    private void setLinkId(Long linkId){
    this.linkId = linkId;
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
    * 商品Id
    */
    private Long getMaterialId(){
    return this.materialId;
    }

    /**
    * 商品扩展id
    */
    private Long getMaterialExtendId(){
    return this.materialExtendId;
    }

    /**
    * 商品计量单位
    */
    private String getMaterialUnit(){
    return this.materialUnit;
    }

    /**
    * 多属性
    */
    private String getSku(){
    return this.sku;
    }

    /**
    * 数量
    */
    private BigDecimal getOperNumber(){
    return this.operNumber;
    }

    /**
    * 基础数量，如kg、瓶
    */
    private BigDecimal getBasicNumber(){
    return this.basicNumber;
    }

    /**
    * 单价
    */
    private BigDecimal getUnitPrice(){
    return this.unitPrice;
    }

    /**
    * 采购单价
    */
    private BigDecimal getPurchaseUnitPrice(){
    return this.purchaseUnitPrice;
    }

    /**
    * 含税单价
    */
    private BigDecimal getTaxUnitPrice(){
    return this.taxUnitPrice;
    }

    /**
    * 金额
    */
    private BigDecimal getAllPrice(){
    return this.allPrice;
    }

    /**
    * 备注
    */
    private String getRemark(){
    return this.remark;
    }

    /**
    * 仓库ID
    */
    private Long getDepotId(){
    return this.depotId;
    }

    /**
    * 调拨时，对方仓库Id
    */
    private Long getAnotherDepotId(){
    return this.anotherDepotId;
    }

    /**
    * 税率
    */
    private BigDecimal getTaxRate(){
    return this.taxRate;
    }

    /**
    * 税额
    */
    private BigDecimal getTaxMoney(){
    return this.taxMoney;
    }

    /**
    * 价税合计
    */
    private BigDecimal getTaxLastMoney(){
    return this.taxLastMoney;
    }

    /**
    * 商品类型
    */
    private String getMaterialType(){
    return this.materialType;
    }

    /**
    * 序列号列表
    */
    private String getSnList(){
    return this.snList;
    }

    /**
    * 批号
    */
    private String getBatchNumber(){
    return this.batchNumber;
    }

    /**
    * 有效日期
    */
    private Date getExpirationDate(){
    return this.expirationDate;
    }

    /**
    * 关联明细id
    */
    private Long getLinkId(){
    return this.linkId;
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
