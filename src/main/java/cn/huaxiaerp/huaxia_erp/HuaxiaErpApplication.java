package cn.huaxiaerp.huaxia_erp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.huaxiaerp.huaxia_erp.datasource.mappers")
public class HuaxiaErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuaxiaErpApplication.class, args);
    }

}
