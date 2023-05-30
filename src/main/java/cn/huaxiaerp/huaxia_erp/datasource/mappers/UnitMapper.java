package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Unit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnitMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Unit record);

    int insertSelective(Unit record);



    Unit selectByPrimaryKey(Long id);



    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}