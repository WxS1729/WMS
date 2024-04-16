package com.wxs.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"com.wxs.generator"}
)
@MapperScan("com.wxs.generator.mapper")
public class SpringAppTest {
    public static void main(String[] args) {
        SpringApplication.run(SpringAppTest.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  WMS启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
