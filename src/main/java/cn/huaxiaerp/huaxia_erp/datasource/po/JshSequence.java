package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 单据编号表
* @TableName jsh_sequence
*/
@Data
public class JshSequence implements Serializable {

    /**
    * 序列名称
    */
    @NotBlank(message="[序列名称]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("序列名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String seqName;
    /**
    * 最小值
    */
    @NotNull(message="[最小值]不能为空")
    @ApiModelProperty("最小值")
    private Long minValue;
    /**
    * 最大值
    */
    @NotNull(message="[最大值]不能为空")
    @ApiModelProperty("最大值")
    private Long maxValue;
    /**
    * 当前值
    */
    @NotNull(message="[当前值]不能为空")
    @ApiModelProperty("当前值")
    private Long currentVal;
    /**
    * 增长步数
    */
    @NotNull(message="[增长步数]不能为空")
    @ApiModelProperty("增长步数")
    private Integer incrementVal;
    /**
    * 备注
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("备注")
    @Length(max= 500,message="编码长度不能超过500")
    private String remark;

    /**
    * 序列名称
    */
    private void setSeqName(String seqName){
    this.seqName = seqName;
    }

    /**
    * 最小值
    */
    private void setMinValue(Long minValue){
    this.minValue = minValue;
    }

    /**
    * 最大值
    */
    private void setMaxValue(Long maxValue){
    this.maxValue = maxValue;
    }

    /**
    * 当前值
    */
    private void setCurrentVal(Long currentVal){
    this.currentVal = currentVal;
    }

    /**
    * 增长步数
    */
    private void setIncrementVal(Integer incrementVal){
    this.incrementVal = incrementVal;
    }

    /**
    * 备注
    */
    private void setRemark(String remark){
    this.remark = remark;
    }


    /**
    * 序列名称
    */
    private String getSeqName(){
    return this.seqName;
    }

    /**
    * 最小值
    */
    private Long getMinValue(){
    return this.minValue;
    }

    /**
    * 最大值
    */
    private Long getMaxValue(){
    return this.maxValue;
    }

    /**
    * 当前值
    */
    private Long getCurrentVal(){
    return this.currentVal;
    }

    /**
    * 增长步数
    */
    private Integer getIncrementVal(){
    return this.incrementVal;
    }

    /**
    * 备注
    */
    private String getRemark(){
    return this.remark;
    }

}
