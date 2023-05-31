package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.MaterialCurrentStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MaterialCurrentStockMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MaterialCurrentStock record);

    int insertSelective(MaterialCurrentStock record);


    MaterialCurrentStock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaterialCurrentStock record);

    int updateByPrimaryKey(MaterialCurrentStock record);
}