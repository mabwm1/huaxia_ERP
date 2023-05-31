package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.DepotHead;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepotHeadMapper {

    int deleteByPrimaryKey(Long id);

    int insert(DepotHead record);

    int insertSelective(DepotHead record);


    DepotHead selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(DepotHead record);

    int updateByPrimaryKey(DepotHead record);
}