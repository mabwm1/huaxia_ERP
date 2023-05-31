package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);


    Role selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}