package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.MaterialInitialStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialInitialStockMapper {


    int deleteByPrimaryKey(Long id);

    int insert(MaterialInitialStock record);

    int insertSelective(MaterialInitialStock record);


    MaterialInitialStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaterialInitialStock record);

    int updateByPrimaryKey(MaterialInitialStock record);
}