package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierMapper {

    /**
     * 动态sql获取供应商信息
     * @param supplier 供应商名称
     * @param telephone 手机号码
     * @param phoneNumber 联系电话
     * @return
     */
    List<Supplier> getSupplierLikeSupplierOrTelephoneOrPhoneNumber(String supplier,String telephone,String phoneNumber);
    int deleteByPrimaryKey(Long id);

    int insert(Supplier record);

    int insertSelective(Supplier record);



    Supplier selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}