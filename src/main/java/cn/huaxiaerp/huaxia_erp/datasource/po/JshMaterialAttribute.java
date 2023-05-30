package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 产品属性表
* @TableName jsh_material_attribute
*/
@Data
public class JshMaterialAttribute implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long id;
    /**
    * 属性名
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("属性名")
    @Length(max= 50,message="编码长度不能超过50")
    private String attributeName;
    /**
    * 属性值
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("属性值")
    @Length(max= 500,message="编码长度不能超过500")
    private String attributeValue;
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
    * 
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 属性名
    */
    private void setAttributeName(String attributeName){
    this.attributeName = attributeName;
    }

    /**
    * 属性值
    */
    private void setAttributeValue(String attributeValue){
    this.attributeValue = attributeValue;
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
    * 
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 属性名
    */
    private String getAttributeName(){
    return this.attributeName;
    }

    /**
    * 属性值
    */
    private String getAttributeValue(){
    return this.attributeValue;
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
