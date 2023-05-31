package cn.huaxiaerp.huaxia_erp.datasource.mappers;


import cn.huaxiaerp.huaxia_erp.datasource.po.Msg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MsgMapper {


    int deleteByPrimaryKey(Long id);

    int insert(Msg record);

    int insertSelective(Msg record);


    Msg selectByPrimaryKey(Long id);



    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
}