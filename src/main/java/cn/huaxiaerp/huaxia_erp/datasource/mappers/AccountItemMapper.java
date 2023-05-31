package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.AccountItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountItemMapper {


    int deleteByPrimaryKey(Long id);

    int insert(AccountItem record);

    int insertSelective(AccountItem record);

    AccountItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccountItem record);

    int updateByPrimaryKey(AccountItem record);
}