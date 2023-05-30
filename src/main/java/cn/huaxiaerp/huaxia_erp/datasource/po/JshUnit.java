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
* 多单位表
* @TableName jsh_unit
*/
@Data
public class JshUnit implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 名称，支持多单位
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("名称，支持多单位")
    @Length(max= 50,message="编码长度不能超过50")
    private String name;
    /**
    * 基础单位
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("基础单位")
    @Length(max= 50,message="编码长度不能超过50")
    private String basicUnit;
    /**
    * 副单位
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("副单位")
    @Length(max= 50,message="编码长度不能超过50")
    private String otherUnit;
    /**
    * 副单位2
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("副单位2")
    @Length(max= 50,message="编码长度不能超过50")
    private String otherUnitTwo;
    /**
    * 副单位3
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("副单位3")
    @Length(max= 50,message="编码长度不能超过50")
    private String otherUnitThree;
    /**
    * 比例
    */
    @ApiModelProperty("比例")
    private BigDecimal ratio;
    /**
    * 比例2
    */
    @ApiModelProperty("比例2")
    private BigDecimal ratioTwo;
    /**
    * 比例3
    */
    @ApiModelProperty("比例3")
    private BigDecimal ratioThree;
    /**
    * 启用
    */
    @ApiModelProperty("启用")
    private Boolean enabled;
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
    * 名称，支持多单位
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 基础单位
    */
    private void setBasicUnit(String basicUnit){
    this.basicUnit = basicUnit;
    }

    /**
    * 副单位
    */
    private void setOtherUnit(String otherUnit){
    this.otherUnit = otherUnit;
    }

    /**
    * 副单位2
    */
    private void setOtherUnitTwo(String otherUnitTwo){
    this.otherUnitTwo = otherUnitTwo;
    }

    /**
    * 副单位3
    */
    private void setOtherUnitThree(String otherUnitThree){
    this.otherUnitThree = otherUnitThree;
    }

    /**
    * 比例
    */
    private void setRatio(BigDecimal ratio){
    this.ratio = ratio;
    }

    /**
    * 比例2
    */
    private void setRatioTwo(BigDecimal ratioTwo){
    this.ratioTwo = ratioTwo;
    }

    /**
    * 比例3
    */
    private void setRatioThree(BigDecimal ratioThree){
    this.ratioThree = ratioThree;
    }

    /**
    * 启用
    */
    private void setEnabled(Boolean enabled){
    this.enabled = enabled;
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
    * 名称，支持多单位
    */
    private String getName(){
    return this.name;
    }

    /**
    * 基础单位
    */
    private String getBasicUnit(){
    return this.basicUnit;
    }

    /**
    * 副单位
    */
    private String getOtherUnit(){
    return this.otherUnit;
    }

    /**
    * 副单位2
    */
    private String getOtherUnitTwo(){
    return this.otherUnitTwo;
    }

    /**
    * 副单位3
    */
    private String getOtherUnitThree(){
    return this.otherUnitThree;
    }

    /**
    * 比例
    */
    private BigDecimal getRatio(){
    return this.ratio;
    }

    /**
    * 比例2
    */
    private BigDecimal getRatioTwo(){
    return this.ratioTwo;
    }

    /**
    * 比例3
    */
    private BigDecimal getRatioThree(){
    return this.ratioThree;
    }

    /**
    * 启用
    */
    private Boolean getEnabled(){
    return this.enabled;
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
