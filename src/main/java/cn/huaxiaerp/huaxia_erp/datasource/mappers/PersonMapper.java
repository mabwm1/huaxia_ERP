package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);



    Person selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}