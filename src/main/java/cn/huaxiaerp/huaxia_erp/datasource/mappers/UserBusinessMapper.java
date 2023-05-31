package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.UserBusiness;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserBusinessMapper {


    int deleteByPrimaryKey(Long id);

    int insert(UserBusiness record);

    int insertSelective(UserBusiness record);


    UserBusiness selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(UserBusiness record);

    int updateByPrimaryKey(UserBusiness record);
}