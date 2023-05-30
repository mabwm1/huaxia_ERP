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
* 操作日志
* @TableName jsh_log
*/
@Data
public class JshLog implements Serializable {

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
    private Long userId;
    /**
    * 操作模块名称
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("操作模块名称")
    @Length(max= 500,message="编码长度不能超过500")
    private String operation;
    /**
    * 客户端IP
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("客户端IP")
    @Length(max= 200,message="编码长度不能超过200")
    private String clientIp;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 操作状态 0==成功，1==失败
    */
    @ApiModelProperty("操作状态 0==成功，1==失败")
    private Integer status;
    /**
    * 详情
    */
    @Size(max= 5000,message="编码长度不能超过5000")
    @ApiModelProperty("详情")
    @Length(max= 5000,message="编码长度不能超过5,000")
    private String content;
    /**
    * 租户id
    */
    @ApiModelProperty("租户id")
    private Long tenantId;

    /**
    * 主键
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 用户id
    */
    private void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 操作模块名称
    */
    private void setOperation(String operation){
    this.operation = operation;
    }

    /**
    * 客户端IP
    */
    private void setClientIp(String clientIp){
    this.clientIp = clientIp;
    }

    /**
    * 创建时间
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 操作状态 0==成功，1==失败
    */
    private void setStatus(Integer status){
    this.status = status;
    }

    /**
    * 详情
    */
    private void setContent(String content){
    this.content = content;
    }

    /**
    * 租户id
    */
    private void setTenantId(Long tenantId){
    this.tenantId = tenantId;
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
    private Long getUserId(){
    return this.userId;
    }

    /**
    * 操作模块名称
    */
    private String getOperation(){
    return this.operation;
    }

    /**
    * 客户端IP
    */
    private String getClientIp(){
    return this.clientIp;
    }

    /**
    * 创建时间
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 操作状态 0==成功，1==失败
    */
    private Integer getStatus(){
    return this.status;
    }

    /**
    * 详情
    */
    private String getContent(){
    return this.content;
    }

    /**
    * 租户id
    */
    private Long getTenantId(){
    return this.tenantId;
    }

}
