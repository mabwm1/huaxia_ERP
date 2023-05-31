package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {


    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);


    User selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}