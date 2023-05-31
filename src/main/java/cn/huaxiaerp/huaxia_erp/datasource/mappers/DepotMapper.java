package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Depot;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepotMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Depot record);

    int insertSelective(Depot record);

    Depot selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Depot record);

    int updateByPrimaryKey(Depot record);
}