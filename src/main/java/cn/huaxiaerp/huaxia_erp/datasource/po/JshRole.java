package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 角色表
* @TableName jsh_role
*/
@Data
public class JshRole implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String name;
    /**
    * 类型
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("类型")
    @Length(max= 50,message="编码长度不能超过50")
    private String type;
    /**
    * 价格屏蔽 1-屏蔽采购价 2-屏蔽零售价 3-屏蔽销售价
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("价格屏蔽 1-屏蔽采购价 2-屏蔽零售价 3-屏蔽销售价")
    @Length(max= 50,message="编码长度不能超过50")
    private String priceLimit;
    /**
    * 值
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("值")
    @Length(max= 200,message="编码长度不能超过200")
    private String value;
    /**
    * 描述
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("描述")
    @Length(max= 100,message="编码长度不能超过100")
    private String description;
    /**
    * 启用
    */
    @ApiModelProperty("启用")
    private Boolean enabled;
    /**
    * 排序
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("排序")
    @Length(max= 10,message="编码长度不能超过10")
    private String sort;
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
    * 名称
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 类型
    */
    private void setType(String type){
    this.type = type;
    }

    /**
    * 价格屏蔽 1-屏蔽采购价 2-屏蔽零售价 3-屏蔽销售价
    */
    private void setPriceLimit(String priceLimit){
    this.priceLimit = priceLimit;
    }

    /**
    * 值
    */
    private void setValue(String value){
    this.value = value;
    }

    /**
    * 描述
    */
    private void setDescription(String description){
    this.description = description;
    }

    /**
    * 启用
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
    * 名称
    */
    private String getName(){
    return this.name;
    }

    /**
    * 类型
    */
    private String getType(){
    return this.type;
    }

    /**
    * 价格屏蔽 1-屏蔽采购价 2-屏蔽零售价 3-屏蔽销售价
    */
    private String getPriceLimit(){
    return this.priceLimit;
    }

    /**
    * 值
    */
    private String getValue(){
    return this.value;
    }

    /**
    * 描述
    */
    private String getDescription(){
    return this.description;
    }

    /**
    * 启用
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
