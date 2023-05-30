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
* 序列号表
* @TableName jsh_serial_number
*/
@Data
public class JshSerialNumber implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 产品表id
    */
    @ApiModelProperty("产品表id")
    private Long materialId;
    /**
    * 仓库id
    */
    @ApiModelProperty("仓库id")
    private Long depotId;
    /**
    * 序列号
    */
    @Size(max= 64,message="编码长度不能超过64")
    @ApiModelProperty("序列号")
    @Length(max= 64,message="编码长度不能超过64")
    private String serialNumber;
    /**
    * 是否卖出，0未卖出，1卖出
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("是否卖出，0未卖出，1卖出")
    @Length(max= 1,message="编码长度不能超过1")
    private String isSell;
    /**
    * 备注
    */
    @Size(max= 1024,message="编码长度不能超过1024")
    @ApiModelProperty("备注")
    @Length(max= 1024,message="编码长度不能超过1,024")
    private String remark;
    /**
    * 删除标记，0未删除，1删除
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("删除标记，0未删除，1删除")
    @Length(max= 1,message="编码长度不能超过1")
    private String deleteFlag;
    /**
    * 创建时间
    */
    @ApiModelProperty("创建时间")
    private Date createTime;
    /**
    * 创建人
    */
    @ApiModelProperty("创建人")
    private Long creator;
    /**
    * 更新时间
    */
    @ApiModelProperty("更新时间")
    private Date updateTime;
    /**
    * 更新人
    */
    @ApiModelProperty("更新人")
    private Long updater;
    /**
    * 入库单号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("入库单号")
    @Length(max= 50,message="编码长度不能超过50")
    private String inBillNo;
    /**
    * 出库单号
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("出库单号")
    @Length(max= 50,message="编码长度不能超过50")
    private String outBillNo;
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
    * 产品表id
    */
    private void setMaterialId(Long materialId){
    this.materialId = materialId;
    }

    /**
    * 仓库id
    */
    private void setDepotId(Long depotId){
    this.depotId = depotId;
    }

    /**
    * 序列号
    */
    private void setSerialNumber(String serialNumber){
    this.serialNumber = serialNumber;
    }

    /**
    * 是否卖出，0未卖出，1卖出
    */
    private void setIsSell(String isSell){
    this.isSell = isSell;
    }

    /**
    * 备注
    */
    private void setRemark(String remark){
    this.remark = remark;
    }

    /**
    * 删除标记，0未删除，1删除
    */
    private void setDeleteFlag(String deleteFlag){
    this.deleteFlag = deleteFlag;
    }

    /**
    * 创建时间
    */
    private void setCreateTime(Date createTime){
    this.createTime = createTime;
    }

    /**
    * 创建人
    */
    private void setCreator(Long creator){
    this.creator = creator;
    }

    /**
    * 更新时间
    */
    private void setUpdateTime(Date updateTime){
    this.updateTime = updateTime;
    }

    /**
    * 更新人
    */
    private void setUpdater(Long updater){
    this.updater = updater;
    }

    /**
    * 入库单号
    */
    private void setInBillNo(String inBillNo){
    this.inBillNo = inBillNo;
    }

    /**
    * 出库单号
    */
    private void setOutBillNo(String outBillNo){
    this.outBillNo = outBillNo;
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
    * 产品表id
    */
    private Long getMaterialId(){
    return this.materialId;
    }

    /**
    * 仓库id
    */
    private Long getDepotId(){
    return this.depotId;
    }

    /**
    * 序列号
    */
    private String getSerialNumber(){
    return this.serialNumber;
    }

    /**
    * 是否卖出，0未卖出，1卖出
    */
    private String getIsSell(){
    return this.isSell;
    }

    /**
    * 备注
    */
    private String getRemark(){
    return this.remark;
    }

    /**
    * 删除标记，0未删除，1删除
    */
    private String getDeleteFlag(){
    return this.deleteFlag;
    }

    /**
    * 创建时间
    */
    private Date getCreateTime(){
    return this.createTime;
    }

    /**
    * 创建人
    */
    private Long getCreator(){
    return this.creator;
    }

    /**
    * 更新时间
    */
    private Date getUpdateTime(){
    return this.updateTime;
    }

    /**
    * 更新人
    */
    private Long getUpdater(){
    return this.updater;
    }

    /**
    * 入库单号
    */
    private String getInBillNo(){
    return this.inBillNo;
    }

    /**
    * 出库单号
    */
    private String getOutBillNo(){
    return this.outBillNo;
    }

    /**
    * 租户id
    */
    private Long getTenantId(){
    return this.tenantId;
    }

}
