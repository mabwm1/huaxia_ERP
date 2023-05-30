package cn.huaxiaerp.huaxia_erp.datasource.mappers;


import cn.huaxiaerp.huaxia_erp.datasource.po.MaterialProperty;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialPropertyMapper {


    int deleteByPrimaryKey(Long id);

    int insert(MaterialProperty record);

    int insertSelective(MaterialProperty record);


    MaterialProperty selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(MaterialProperty record);

    int updateByPrimaryKey(MaterialProperty record);
}