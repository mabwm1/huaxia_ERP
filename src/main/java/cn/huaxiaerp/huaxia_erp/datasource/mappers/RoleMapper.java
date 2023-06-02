package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Role;
import cn.huaxiaerp.huaxia_erp.datasource.po.RoleExample;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface RoleMapper extends BaseMapper<Role> {


    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);
    Role selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
