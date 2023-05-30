package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 租户
* @TableName jsh_tenant
*/
@Data
public class JshTenant implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long tenantId;
    /**
    * 登录名
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("登录名")
    @Length(max= 255,message="编码长度不能超过255")
    private String loginName;
    /**
    * 用户数量限制
    */
    @ApiModelProperty("用户数量限制")
    private Integer userNumLimit;
    /**
    * 租户类型，0免费租户，1付费租户
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("租户类型，0免费租户，1付费租户")
    @Length(max= 1,message="编码长度不能超过1")
    private String type;
    /**
    * 启用 0-禁用  1-启用
    */
    @ApiModelProperty("启用 0-禁用  1-启用")
    private Boolean enabled;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 到期时间
    */
    @ApiModelProperty("到期时间")
    private Date expireTime;
    /**
    * 备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("备注")
    @Length(max= 500,message="编码长度不能超过500")
    private String remark;

    /**
    * 主键
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 用户id
    */
    private void setTenantId(Long tenantId){
    this.tenantId = tenantId;
    }

    /**
    * 登录名
    */
    private void setLoginName(String loginName){
    this.loginName = loginName;
    }

    /**
    * 用户数量限制
    */
    private void setUserNumLimit(Integer userNumLimit){
    this.userNumLimit = userNumLimit;
    }

    /**
    * 租户类型，0免费租户，1付费租户
    */
    private void setType(String type){
    this.type = type;
    }

    /**
    * 启用 0-禁用  1-启用
    */
    private void setEnabled(Boolean enabled){
    this.enabled = enabled;
    }

    /**
    * 创建时间
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 到期时间
    */
    private void setExpireTime(Date expireTime){
    this.expireTime = expireTime;
    }

    /**
    * 备注
    */
    private void setRemark(String remark){
    this.remark = remark;
    }


    /**
    * 主键
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 用户id
    */
    private Long getTenantId(){
    return this.tenantId;
    }

    /**
    * 登录名
    */
    private String getLoginName(){
    return this.loginName;
    }

    /**
    * 用户数量限制
    */
    private Integer getUserNumLimit(){
    return this.userNumLimit;
    }

    /**
    * 租户类型，0免费租户，1付费租户
    */
    private String getType(){
    return this.type;
    }

    /**
    * 启用 0-禁用  1-启用
    */
    private Boolean getEnabled(){
    return this.enabled;
    }

    /**
    * 创建时间
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 到期时间
    */
    private Date getExpireTime(){
    return this.expireTime;
    }

    /**
    * 备注
    */
    private String getRemark(){
    return this.remark;
    }

}
