package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.DepotItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepotItemMapper {

    int deleteByPrimaryKey(Long id);

    int insert(DepotItem record);

    int insertSelective(DepotItem record);

    DepotItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DepotItem record);

    int updateByPrimaryKey(DepotItem record);
}