package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 产品扩展字段表
* @TableName jsh_material_property
*/
@Data
public class JshMaterialProperty implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 原始名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("原始名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String nativeName;
    /**
    * 是否启用
    */
    @ApiModelProperty("是否启用")
    private Boolean enabled;
    /**
    * 排序
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("排序")
    @Length(max= 10,message="编码长度不能超过10")
    private String sort;
    /**
    * 别名
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("别名")
    @Length(max= 50,message="编码长度不能超过50")
    private String anotherName;
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
    * 原始名称
    */
    private void setNativeName(String nativeName){
    this.nativeName = nativeName;
    }

    /**
    * 是否启用
    */
    private void setEnabled(Boolean enabled){
    this.enabled = enabled;
    }

    /**
    * 排序
    */
    private void setSort(String sort){
    this.sort = sort;
    }

    /**
    * 别名
    */
    private void setAnotherName(String anotherName){
    this.anotherName = anotherName;
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
    * 原始名称
    */
    private String getNativeName(){
    return this.nativeName;
    }

    /**
    * 是否启用
    */
    private Boolean getEnabled(){
    return this.enabled;
    }

    /**
    * 排序
    */
    private String getSort(){
    return this.sort;
    }

    /**
    * 别名
    */
    private String getAnotherName(){
    return this.anotherName;
    }

    /**
    * 删除标记，0未删除，1删除
    */
    private String getDeleteFlag(){
    return this.deleteFlag;
    }

}
