package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.AccountHead;


public interface AccountHeadMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccountHead record);

    int insertSelective(AccountHead record);

    AccountHead selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccountHead record);

    int updateByPrimaryKey(AccountHead record);
}