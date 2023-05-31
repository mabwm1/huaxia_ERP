package cn.huaxiaerp.huaxia_erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.huaxiaerp.huaxia_erp.datasource.mappers")
public class HuaxiaErpApplication {

    public static void main(String[] args) {
        System.out.println("springboot启动成功");
        SpringApplication.run(HuaxiaErpApplication.class, args);
    }

}
