package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Log record);

    int insertSelective(Log record);


    Log selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}