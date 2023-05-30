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
* 产品价格扩展
* @TableName jsh_material_extend
*/
@Data
public class MaterialExtend implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 商品id
    */
    @ApiModelProperty("商品id")
    private Long materialId;
    /**
    * 商品条码
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("商品条码")
    @Length(max= 50,message="编码长度不能超过50")
    private String barCode;
    /**
    * 商品单位
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("商品单位")
    @Length(max= 50,message="编码长度不能超过50")
    private String commodityUnit;
    /**
    * 多属性
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("多属性")
    @Length(max= 50,message="编码长度不能超过50")
    private String sku;
    /**
    * 采购价格
    */
    @ApiModelProperty("采购价格")
    private BigDecimal purchaseDecimal;
    /**
    * 零售价格
    */
    @ApiModelProperty("零售价格")
    private BigDecimal commodityDecimal;
    /**
    * 销售价格
    */
    @ApiModelProperty("销售价格")
    private BigDecimal wholesaleDecimal;
    /**
    * 最低售价
    */
    @ApiModelProperty("最低售价")
    private BigDecimal lowDecimal;
    /**
    * 是否为默认单位，1是，0否
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("是否为默认单位，1是，0否")
    @Length(max= 1,message="编码长度不能超过1")
    private String defaultFlag;
    /**
    * 创建日期
    */
    @ApiModelProperty("创建日期")
    private Date createTime;
    /**
    * 创建人编码
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("创建人编码")
    @Length(max= 50,message="编码长度不能超过50")
    private String createSerial;
    /**
    * 更新人编码
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("更新人编码")
    @Length(max= 50,message="编码长度不能超过50")
    private String updateSerial;
    /**
    * 更新时间戳
    */
    @ApiModelProperty("更新时间戳")
    private Long updateTime;
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
    * 商品id
    */
    private void setMaterialId(Long materialId){
    this.materialId = materialId;
    }

    /**
    * 商品条码
    */
    private void setBarCode(String barCode){
    this.barCode = barCode;
    }

    /**
    * 商品单位
    */
    private void setCommodityUnit(String commodityUnit){
    this.commodityUnit = commodityUnit;
    }

    /**
    * 多属性
    */
    private void setSku(String sku){
    this.sku = sku;
    }

    /**
    * 采购价格
    */
    private void setPurchaseDecimal(BigDecimal purchaseDecimal){
    this.purchaseDecimal = purchaseDecimal;
    }

    /**
    * 零售价格
    */
    private void setCommodityDecimal(BigDecimal commodityDecimal){
    this.commodityDecimal = commodityDecimal;
    }

    /**
    * 销售价格
    */
    private void setWholesaleDecimal(BigDecimal wholesaleDecimal){
    this.wholesaleDecimal = wholesaleDecimal;
    }

    /**
    * 最低售价
    */
    private void setLowDecimal(BigDecimal lowDecimal){
    this.lowDecimal = lowDecimal;
    }

    /**
    * 是否为默认单位，1是，0否
    */
    private void setDefaultFlag(String defaultFlag){
    this.defaultFlag = defaultFlag;
    }

    /**
    * 创建日期
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 创建人编码
    */
    private void setCreateSerial(String createSerial){
    this.createSerial = createSerial;
    }

    /**
    * 更新人编码
    */
    private void setUpdateSerial(String updateSerial){
    this.updateSerial = updateSerial;
    }

    /**
    * 更新时间戳
    */
    private void setUpdateTime(Long updateTime){
    this.updateTime = updateTime;
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
    * 商品id
    */
    private Long getMaterialId(){
    return this.materialId;
    }

    /**
    * 商品条码
    */
    private String getBarCode(){
    return this.barCode;
    }

    /**
    * 商品单位
    */
    private String getCommodityUnit(){
    return this.commodityUnit;
    }

    /**
    * 多属性
    */
    private String getSku(){
    return this.sku;
    }

    /**
    * 采购价格
    */
    private BigDecimal getPurchaseDecimal(){
    return this.purchaseDecimal;
    }

    /**
    * 零售价格
    */
    private BigDecimal getCommodityDecimal(){
    return this.commodityDecimal;
    }

    /**
    * 销售价格
    */
    private BigDecimal getWholesaleDecimal(){
    return this.wholesaleDecimal;
    }

    /**
    * 最低售价
    */
    private BigDecimal getLowDecimal(){
    return this.lowDecimal;
    }

    /**
    * 是否为默认单位，1是，0否
    */
    private String getDefaultFlag(){
    return this.defaultFlag;
    }

    /**
    * 创建日期
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 创建人编码
    */
    private String getCreateSerial(){
    return this.createSerial;
    }

    /**
    * 更新人编码
    */
    private String getUpdateSerial(){
    return this.updateSerial;
    }

    /**
    * 更新时间戳
    */
    private Long getUpdateTime(){
    return this.updateTime;
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
