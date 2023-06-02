package cn.huaxiaerp.huaxia_erp.controller;

import cn.huaxiaerp.huaxia_erp.datasource.po.Supplier;
import cn.huaxiaerp.huaxia_erp.service.impl.SupplierServiceImpl;
import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(value = "/supplier")
@Api(tags = {"商家管理"})
public class SupplierController {
    @Resource
    private SupplierServiceImpl supplierServiceImpl;

    @PostMapping(value = "/findBySelect_retail")
    @ApiOperation(value = "查找会员信息")
    public List<Supplier> findBySelectRetail(HttpServletRequest request)throws Exception {
        return supplierServiceImpl.findBySelectRetail("会员");
    }

}
