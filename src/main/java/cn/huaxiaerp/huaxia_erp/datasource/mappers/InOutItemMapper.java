package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.InOutItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InOutItemMapper {

    int deleteByPrimaryKey(Long id);

    int insert(InOutItem record);

    int insertSelective(InOutItem record);


    InOutItem selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(InOutItem record);

    int updateByPrimaryKey(InOutItem record);
}