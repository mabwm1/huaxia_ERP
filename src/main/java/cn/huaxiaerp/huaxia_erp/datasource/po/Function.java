package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 功能模块表
* @TableName jsh_function
*/
@Data
public class Function implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 编号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("编号")
    @Length(max= 50,message="编码长度不能超过50")
    private String number;
    /**
    * 名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String name;
    /**
    * 上级编号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("上级编号")
    @Length(max= 50,message="编码长度不能超过50")
    private String parentNumber;
    /**
    * 链接
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("链接")
    @Length(max= 100,message="编码长度不能超过100")
    private String url;
    /**
    * 组件
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("组件")
    @Length(max= 100,message="编码长度不能超过100")
    private String component;
    /**
    * 收缩
    */
    @ApiModelProperty("收缩")
    private Boolean state;
    /**
    * 排序
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("排序")
    @Length(max= 50,message="编码长度不能超过50")
    private String sort;
    /**
    * 启用
    */
    @ApiModelProperty("启用")
    private Boolean enabled;
    /**
    * 类型
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("类型")
    @Length(max= 50,message="编码长度不能超过50")
    private String type;
    /**
    * 功能按钮
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("功能按钮")
    @Length(max= 50,message="编码长度不能超过50")
    private String pushBtn;
    /**
    * 图标
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("图标")
    @Length(max= 50,message="编码长度不能超过50")
    private String icon;
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
    * 编号
    */
    private void setNumber(String number){
    this.number = number;
    }

    /**
    * 名称
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 上级编号
    */
    private void setParentNumber(String parentNumber){
    this.parentNumber = parentNumber;
    }

    /**
    * 链接
    */
    private void setUrl(String url){
    this.url = url;
    }

    /**
    * 组件
    */
    private void setComponent(String component){
    this.component = component;
    }

    /**
    * 收缩
    */
    private void setState(Boolean state){
    this.state = state;
    }

    /**
    * 排序
    */
    private void setSort(String sort){
    this.sort = sort;
    }

    /**
    * 启用
    */
    private void setEnabled(Boolean enabled){
    this.enabled = enabled;
    }

    /**
    * 类型
    */
    private void setType(String type){
    this.type = type;
    }

    /**
    * 功能按钮
    */
    private void setPushBtn(String pushBtn){
    this.pushBtn = pushBtn;
    }

    /**
    * 图标
    */
    private void setIcon(String icon){
    this.icon = icon;
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
    * 编号
    */
    private String getNumber(){
    return this.number;
    }

    /**
    * 名称
    */
    private String getName(){
    return this.name;
    }

    /**
    * 上级编号
    */
    private String getParentNumber(){
    return this.parentNumber;
    }

    /**
    * 链接
    */
    private String getUrl(){
    return this.url;
    }

    /**
    * 组件
    */
    private String getComponent(){
    return this.component;
    }

    /**
    * 收缩
    */
    private Boolean getState(){
    return this.state;
    }

    /**
    * 排序
    */
    private String getSort(){
    return this.sort;
    }

    /**
    * 启用
    */
    private Boolean getEnabled(){
    return this.enabled;
    }

    /**
    * 类型
    */
    private String getType(){
    return this.type;
    }

    /**
    * 功能按钮
    */
    private String getPushBtn(){
    return this.pushBtn;
    }

    /**
    * 图标
    */
    private String getIcon(){
    return this.icon;
    }

    /**
    * 删除标记，0未删除，1删除
    */
    private String getDeleteFlag(){
    return this.deleteFlag;
    }

}
