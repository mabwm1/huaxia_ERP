package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
* 产品表
* @TableName jsh_material
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Material implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 产品类型id
    */
    @ApiModelProperty("产品类型id")
    private Long categoryId;
    /**
    * 名称
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("名称")
    @Length(max= 100,message="编码长度不能超过100")
    private String name;
    /**
    * 制造商
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("制造商")
    @Length(max= 50,message="编码长度不能超过50")
    private String mfrs;
    /**
    * 型号
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("型号")
    @Length(max= 100,message="编码长度不能超过100")
    private String model;
    /**
    * 规格
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("规格")
    @Length(max= 100,message="编码长度不能超过100")
    private String standard;
    /**
    * 颜色
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("颜色")
    @Length(max= 50,message="编码长度不能超过50")
    private String color;
    /**
    * 单位-单个
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("单位-单个")
    @Length(max= 50,message="编码长度不能超过50")
    private String unit;
    /**
    * 备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("备注")
    @Length(max= 500,message="编码长度不能超过500")
    private String remark;
    /**
    * 图片名称
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("图片名称")
    @Length(max= 500,message="编码长度不能超过500")
    private String imgName;
    /**
    * 计量单位Id
    */
    @ApiModelProperty("计量单位Id")
    private Long unitId;
    /**
    * 保质期天数
    */
    @ApiModelProperty("保质期天数")
    private Integer expiryNum;
    /**
    * 基础重量(kg)
    */
    @ApiModelProperty("基础重量(kg)")
    private BigDecimal weight;
    /**
    * 启用 0-禁用  1-启用
    */
    @ApiModelProperty("启用 0-禁用  1-启用")
    private Boolean enabled;
    /**
    * 自定义1
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("自定义1")
    @Length(max= 50,message="编码长度不能超过50")
    private String otherField1;
    /**
    * 自定义2
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("自定义2")
    @Length(max= 50,message="编码长度不能超过50")
    private String otherField2;
    /**
    * 自定义3
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("自定义3")
    @Length(max= 50,message="编码长度不能超过50")
    private String otherField3;
    /**
    * 是否开启序列号，0否，1是
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("是否开启序列号，0否，1是")
    @Length(max= 1,message="编码长度不能超过1")
    private String enableSerialNumber;
    /**
    * 是否开启批号，0否，1是
    */
    @Size(max= 1,message="编码长度不能超过1")
    @ApiModelProperty("是否开启批号，0否，1是")
    @Length(max= 1,message="编码长度不能超过1")
    private String enableBatchNumber;
    /**
    * 仓位货架
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("仓位货架")
    @Length(max= 100,message="编码长度不能超过100")
    private String position;
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

}
