package cn.huaxiaerp.huaxia_erp.datasource.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 平台参数
* @TableName jsh_platform_config
*/
@Data
public class JshPlatformConfig implements Serializable {

    /**
    * 
    */
    @NotNull(message="[]不能为空")
    @ApiModelProperty("")
    private Long id;
    /**
    * 关键词
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("关键词")
    @Length(max= 100,message="编码长度不能超过100")
    private String platformKey;
    /**
    * 关键词名称
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("关键词名称")
    @Length(max= 100,message="编码长度不能超过100")
    private String platformKeyInfo;
    /**
    * 值
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("值")
    @Length(max= 200,message="编码长度不能超过200")
    private String platformValue;

    /**
    * 
    */
    private void setId(Long id){
    this.id = id;
    }

    /**
    * 关键词
    */
    private void setPlatformKey(String platformKey){
    this.platformKey = platformKey;
    }

    /**
    * 关键词名称
    */
    private void setPlatformKeyInfo(String platformKeyInfo){
    this.platformKeyInfo = platformKeyInfo;
    }

    /**
    * 值
    */
    private void setPlatformValue(String platformValue){
    this.platformValue = platformValue;
    }


    /**
    * 
    */
    private Long getId(){
    return this.id;
    }

    /**
    * 关键词
    */
    private String getPlatformKey(){
    return this.platformKey;
    }

    /**
    * 关键词名称
    */
    private String getPlatformKeyInfo(){
    return this.platformKeyInfo;
    }

    /**
    * 值
    */
    private String getPlatformValue(){
    return this.platformValue;
    }

}
