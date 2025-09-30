package org.example.myproject; // 必须有这个包声明，对应文件夹结构

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 是一个“组合注解”，它告诉 Spring Boot：“这是我的主程序，启动吧！”
@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        // SpringApplication.run() 方法会启动整个 Spring Boot 应用。
        SpringApplication.run(MyApplication.class, args);
    }

}