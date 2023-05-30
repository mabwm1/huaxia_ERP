package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 产品初始库存
* @TableName jsh_material_initial_stock
*/
@Data
public class MaterialInitialStock implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 产品id
    */
    @ApiModelProperty("产品id")
    private Long materialId;
    /**
    * 仓库id
    */
    @ApiModelProperty("仓库id")
    private Long depotId;
    /**
    * 初始库存数量
    */
    @ApiModelProperty("初始库存数量")
    private BigDecimal number;
    /**
    * 最低库存数量
    */
    @ApiModelProperty("最低库存数量")
    private BigDecimal lowSafeStock;
    /**
    * 最高库存数量
    */
    @ApiModelProperty("最高库存数量")
    private BigDecimal highSafeStock;
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
    * 产品id
    */
    private void setMaterialId(Long materialId){
    this.materialId = materialId;
    }

    /**
    * 仓库id
    */
    private void setDepotId(Long depotId){
    this.depotId = depotId;
    }

    /**
    * 初始库存数量
    */
    private void setNumber(BigDecimal number){
    this.number = number;
    }

    /**
    * 最低库存数量
    */
    private void setLowSafeStock(BigDecimal lowSafeStock){
    this.lowSafeStock = lowSafeStock;
    }

    /**
    * 最高库存数量
    */
    private void setHighSafeStock(BigDecimal highSafeStock){
    this.highSafeStock = highSafeStock;
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
    * 产品id
    */
    private Long getMaterialId(){
    return this.materialId;
    }

    /**
    * 仓库id
    */
    private Long getDepotId(){
    return this.depotId;
    }

    /**
    * 初始库存数量
    */
    private BigDecimal getNumber(){
    return this.number;
    }

    /**
    * 最低库存数量
    */
    private BigDecimal getLowSafeStock(){
    return this.lowSafeStock;
    }

    /**
    * 最高库存数量
    */
    private BigDecimal getHighSafeStock(){
    return this.highSafeStock;
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
