package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Function;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FunctionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Function record);

    int insertSelective(Function record);


    Function selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);
}