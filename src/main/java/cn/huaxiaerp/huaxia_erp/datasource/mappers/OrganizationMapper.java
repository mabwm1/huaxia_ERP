package cn.huaxiaerp.huaxia_erp.datasource.mappers;


import cn.huaxiaerp.huaxia_erp.datasource.po.Organization;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrganizationMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Organization record);

    int insertSelective(Organization record);



    Organization selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}