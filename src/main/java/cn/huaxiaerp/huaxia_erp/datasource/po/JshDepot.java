package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 仓库表
* @TableName jsh_depot
*/
@Data
public class JshDepot implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 仓库名称
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("仓库名称")
    @Length(max= 20,message="编码长度不能超过20")
    private String name;
    /**
    * 仓库地址
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("仓库地址")
    @Length(max= 50,message="编码长度不能超过50")
    private String address;
    /**
    * 仓储费
    */
    @ApiModelProperty("仓储费")
    private BigDecimal warehousing;
    /**
    * 搬运费
    */
    @ApiModelProperty("搬运费")
    private BigDecimal truckage;
    /**
    * 类型
    */
    @ApiModelProperty("类型")
    private Integer type;
    /**
    * 排序
    */
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("排序")
    @Length(max= 10,message="编码长度不能超过10")
    private String sort;
    /**
    * 描述
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("描述")
    @Length(max= 100,message="编码长度不能超过100")
    private String remark;
    /**
    * 负责人
    */
    @ApiModelProperty("负责人")
    private Long principal;
    /**
    * 启用
    */
    @ApiModelProperty("启用")
    private Boolean enabled;
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
    * 是否默认
    */
    @ApiModelProperty("是否默认")
    private Boolean isDefault;

    /**
    * 主键
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 仓库名称
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 仓库地址
    */
    private void setAddress(String address){
    this.address = address;
    }

    /**
    * 仓储费
    */
    private void setWarehousing(BigDecimal warehousing){
    this.warehousing = warehousing;
    }

    /**
    * 搬运费
    */
    private void setTruckage(BigDecimal truckage){
    this.truckage = truckage;
    }

    /**
    * 类型
    */
    private void setType(Integer type){
    this.type = type;
    }

    /**
    * 排序
    */
    private void setSort(String sort){
    this.sort = sort;
    }

    /**
    * 描述
    */
    private void setRemark(String remark){
    this.remark = remark;
    }

    /**
    * 负责人
    */
    private void setPrincipal(Long principal){
    this.principal = principal;
    }

    /**
    * 启用
    */
    private void setEnabled(Boolean enabled){
    this.enabled = enabled;
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
    * 是否默认
    */
    private void setIsDefault(Boolean isDefault){
    this.isDefault = isDefault;
    }


    /**
    * 主键
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 仓库名称
    */
    private String getName(){
    return this.name;
    }

    /**
    * 仓库地址
    */
    private String getAddress(){
    return this.address;
    }

    /**
    * 仓储费
    */
    private BigDecimal getWarehousing(){
    return this.warehousing;
    }

    /**
    * 搬运费
    */
    private BigDecimal getTruckage(){
    return this.truckage;
    }

    /**
    * 类型
    */
    private Integer getType(){
    return this.type;
    }

    /**
    * 排序
    */
    private String getSort(){
    return this.sort;
    }

    /**
    * 描述
    */
    private String getRemark(){
    return this.remark;
    }

    /**
    * 负责人
    */
    private Long getPrincipal(){
    return this.principal;
    }

    /**
    * 启用
    */
    private Boolean getEnabled(){
    return this.enabled;
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

    /**
    * 是否默认
    */
    private Boolean getIsDefault(){
    return this.isDefault;
    }

}
