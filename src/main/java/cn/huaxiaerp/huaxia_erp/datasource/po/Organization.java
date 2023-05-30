package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 机构表
* @TableName jsh_organization
*/
@Data
public class Organization implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 机构编号
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("机构编号")
    @Length(max= 20,message="编码长度不能超过20")
    private String orgNo;
    /**
    * 机构简称
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("机构简称")
    @Length(max= 20,message="编码长度不能超过20")
    private String orgAbr;
    /**
    * 父机构id
    */
    @ApiModelProperty("父机构id")
    private Long parentId;
    /**
    * 机构显示顺序
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("机构显示顺序")
    @Length(max= 20,message="编码长度不能超过20")
    private String sort;
    /**
    * 备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("备注")
    @Length(max= 500,message="编码长度不能超过500")
    private String remark;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private Date updateTime;
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
    * 机构编号
    */
    private void setOrgNo(String orgNo){
    this.orgNo = orgNo;
    }

    /**
    * 机构简称
    */
    private void setOrgAbr(String orgAbr){
    this.orgAbr = orgAbr;
    }

    /**
    * 父机构id
    */
    private void setParentId(Long parentId){
    this.parentId = parentId;
    }

    /**
    * 机构显示顺序
    */
    private void setSort(String sort){
    this.sort = sort;
    }

    /**
    * 备注
    */
    private void setRemark(String remark){
    this.remark = remark;
    }

    /**
    * 创建时间
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 更新时间
    */
    private void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
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
    * 机构编号
    */
    private String getOrgNo(){
    return this.orgNo;
    }

    /**
    * 机构简称
    */
    private String getOrgAbr(){
    return this.orgAbr;
    }

    /**
    * 父机构id
    */
    private Long getParentId(){
    return this.parentId;
    }

    /**
    * 机构显示顺序
    */
    private String getSort(){
    return this.sort;
    }

    /**
    * 备注
    */
    private String getRemark(){
    return this.remark;
    }

    /**
    * 创建时间
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 更新时间
    */
    private Date getUpdateTime(){
    return this.updateTime;
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
