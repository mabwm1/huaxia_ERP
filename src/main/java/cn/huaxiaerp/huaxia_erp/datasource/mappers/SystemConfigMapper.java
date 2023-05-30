package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.SystemConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemConfigMapper {


    int deleteByPrimaryKey(Long id);

    int insert(SystemConfig record);

    int insertSelective(SystemConfig record);


    SystemConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemConfig record);

    int updateByPrimaryKey(SystemConfig record);
}