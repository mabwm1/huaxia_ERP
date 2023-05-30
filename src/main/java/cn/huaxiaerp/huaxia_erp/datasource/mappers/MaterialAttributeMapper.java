package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.MaterialAttribute;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialAttributeMapper {


    int deleteByPrimaryKey(Long id);

    int insert(MaterialAttribute record);

    int insertSelective(MaterialAttribute record);

    MaterialAttribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaterialAttribute record);

    int updateByPrimaryKey(MaterialAttribute record);
}