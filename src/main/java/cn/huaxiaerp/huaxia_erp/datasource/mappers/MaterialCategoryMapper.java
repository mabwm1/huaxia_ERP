package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.MaterialCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialCategoryMapper {


    int deleteByPrimaryKey(Long id);

    int insert(MaterialCategory record);

    int insertSelective(MaterialCategory record);

    MaterialCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaterialCategory record);

    int updateByPrimaryKey(MaterialCategory record);
}