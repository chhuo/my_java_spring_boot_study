package org.example.myproject; // 同样，必须有这个包声明

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController 注解告诉 Spring：
// 1. 这是一个控制器，用来处理 Web 请求。
// 2. 这个控制器里所有方法的返回值，都直接作为文本发送给浏览器（而不是去渲染一个页面）。
@RestController
public class HelloController {

    // @GetMapping("/") 注解表示：当浏览器访问根路径 (http://localhost:8080/) 时，执行下面这个方法。
    @GetMapping("/")
    public String sayHello() {
        // 这个方法很简单，直接返回一个字符串。
        // 因为有 @RestController 注解，这个字符串 "Hello, Spring Boot!" 就会直接显示在浏览器上。
        return "Hello, Spring Boot! 你好，世界！";
    }
}