package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 用户/角色/模块关系表
* @TableName jsh_user_business
*/
@Data
public class UserBusiness implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 类别
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("类别")
    @Length(max= 50,message="编码长度不能超过50")
    private String type;
    /**
    * 主id
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("主id")
    @Length(max= 50,message="编码长度不能超过50")
    private String keyId;
    /**
    * 值
    */
    @Size(max= 10000,message="编码长度不能超过10000")
    @ApiModelProperty("值")
    @Length(max= 10000,message="编码长度不能超过10,000")
    private String value;
    /**
    * 按钮权限
    */
    @Size(max= 2000,message="编码长度不能超过2000")
    @ApiModelProperty("按钮权限")
    @Length(max= 2000,message="编码长度不能超过2,000")
    private String btnStr;
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
    * 类别
    */
    private void setType(String type){
    this.type = type;
    }

    /**
    * 主id
    */
    private void setKeyId(String keyId){
    this.keyId = keyId;
    }

    /**
    * 值
    */
    private void setValue(String value){
    this.value = value;
    }

    /**
    * 按钮权限
    */
    private void setBtnStr(String btnStr){
    this.btnStr = btnStr;
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
    * 类别
    */
    private String getType(){
    return this.type;
    }

    /**
    * 主id
    */
    private String getKeyId(){
    return this.keyId;
    }

    /**
    * 值
    */
    private String getValue(){
    return this.value;
    }

    /**
    * 按钮权限
    */
    private String getBtnStr(){
    return this.btnStr;
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
