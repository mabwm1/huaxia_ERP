package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.SerialNumber;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SerialNumberMapper {


    int deleteByPrimaryKey(Long id);

    int insert(SerialNumber record);

    int insertSelective(SerialNumber record);


    SerialNumber selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SerialNumber record);

    int updateByPrimaryKey(SerialNumber record);
}