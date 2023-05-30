package cn.huaxiaerp.huaxia_erp.datasource.mappers;

import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SupplierMapper extends BaseMapper<Supplier> {

    /**
     * 动态sql获取供应商信息
     * @param supplier 供应商名称
     * @param telephone 手机号码
     * @param phoneNum 联系电话
     * @return
     */
    List<Supplier> getSupplierLikeSupplierOrTelephoneOrPhoneNumber(String supplier,String telephone,String phoneNum);
    List<Supplier> getAll();

}