package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 产品当前库存
* @TableName jsh_material_current_stock
*/
@Data
public class JshMaterialCurrentStock implements Serializable {

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
    * 当前库存数量
    */
    @ApiModelProperty("当前库存数量")
    private BigDecimal currentNumber;
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
    * 当前库存数量
    */
    private void setCurrentNumber(BigDecimal currentNumber){
    this.currentNumber = currentNumber;
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
    * 当前库存数量
    */
    private BigDecimal getCurrentNumber(){
    return this.currentNumber;
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
