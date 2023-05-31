package cn.huaxiaerp.huaxia_erp.datasource.mappers;


import cn.huaxiaerp.huaxia_erp.datasource.po.Tenant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenantMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Tenant record);

    int insertSelective(Tenant record);


    Tenant selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Tenant record);

    int updateByPrimaryKey(Tenant record);
}