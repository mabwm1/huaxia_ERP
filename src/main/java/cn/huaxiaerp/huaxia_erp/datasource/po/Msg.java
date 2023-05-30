package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 消息表
* @TableName jsh_msg
*/
@Data
public class Msg implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 消息标题
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("消息标题")
    @Length(max= 100,message="编码长度不能超过100")
    private String msgTitle;
    /**
    * 消息内容
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("消息内容")
    @Length(max= 500,message="编码长度不能超过500")
    private String msgContent;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 消息类型
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("消息类型")
    @Length(max= 20,message="编码长度不能超过20")
    private String type;
    /**
    * 接收人id
    */
    @ApiModelProperty("接收人id")
    private Long userId;
    /**
    * 状态，1未读 2已读
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("状态，1未读 2已读")
    @Length(max= 1,message="编码长度不能超过1")
    private String status;
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
    * 消息标题
    */
    private void setMsgTitle(String msgTitle){
    this.msgTitle = msgTitle;
    }

    /**
    * 消息内容
    */
    private void setMsgContent(String msgContent){
    this.msgContent = msgContent;
    }

    /**
    * 创建时间
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 消息类型
    */
    private void setType(String type){
    this.type = type;
    }

    /**
    * 接收人id
    */
    private void setUserId(Long userId){
    this.userId = userId;
    }

    /**
    * 状态，1未读 2已读
    */
    private void setStatus(String status){
    this.status = status;
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
    * 消息标题
    */
    private String getMsgTitle(){
    return this.msgTitle;
    }

    /**
    * 消息内容
    */
    private String getMsgContent(){
    return this.msgContent;
    }

    /**
    * 创建时间
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 消息类型
    */
    private String getType(){
    return this.type;
    }

    /**
    * 接收人id
    */
    private Long getUserId(){
    return this.userId;
    }

    /**
    * 状态，1未读 2已读
    */
    private String getStatus(){
    return this.status;
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
