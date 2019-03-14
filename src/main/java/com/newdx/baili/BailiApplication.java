package com.newdx.baili;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2  //启用Swagger 生成接口描述
@EnableTransactionManagement  //启用事务
@MapperScan("com.newdx.baili.dao")
public class BailiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BailiApplication.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(BailiApplication.class);
    }
}
