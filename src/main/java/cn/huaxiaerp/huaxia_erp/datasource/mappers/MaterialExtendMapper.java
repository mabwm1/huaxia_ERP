package cn.huaxiaerp.huaxia_erp.datasource.mappers;


import cn.huaxiaerp.huaxia_erp.datasource.po.MaterialExtend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialExtendMapper {


    int deleteByPrimaryKey(Long id);

    int insert(MaterialExtend record);

    int insertSelective(MaterialExtend record);


    MaterialExtend selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(MaterialExtend record);

    int updateByPrimaryKey(MaterialExtend record);
}