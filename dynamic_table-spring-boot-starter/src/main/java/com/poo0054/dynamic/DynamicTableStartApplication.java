package com.poo0054.dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author ZhangZhi
 * @version 1.0
 * @since 2022/10/8 15:10
 */
@MapperScan("com.poo0054.**.mapper")
@SpringBootApplication
public class DynamicTableStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicTableStartApplication.class, args);
    }
}
