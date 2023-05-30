package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 收支项目
* @TableName jsh_in_out_item
*/
@Data
public class JshInOutItem implements Serializable {

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
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("类型")
    @Length(max= 20,message="编码长度不能超过20")
    private String type;
    /**
    * 备注
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("备注")
    @Length(max= 100,message="编码长度不能超过100")
    private String remark;
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
    * 备注
    */
    private void setRemark(String remark){
    this.remark = remark;
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
    * 备注
    */
    private String getRemark(){
    return this.remark;
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
