package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.PlatformConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlatformConfigMapper {


    int deleteByPrimaryKey(Long id);

    int insert(PlatformConfig record);

    int insertSelective(PlatformConfig record);


    PlatformConfig selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(PlatformConfig record);

    int updateByPrimaryKey(PlatformConfig record);
}