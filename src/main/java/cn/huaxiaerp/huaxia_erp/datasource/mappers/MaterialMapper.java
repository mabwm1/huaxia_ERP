package cn.huaxiaerp.huaxia_erp.datasource.mappers;


import cn.huaxiaerp.huaxia_erp.datasource.po.Material;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Material record);

    int insertSelective(Material record);


    Material selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKey(Material record);
}