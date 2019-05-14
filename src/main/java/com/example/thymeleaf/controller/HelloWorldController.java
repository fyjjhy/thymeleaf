package com.example.thymeleaf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <Description> <br>
 * @RestController
 * controller里面的方法都以json格式输出，不用再写jack json配置了
 * @author 付永杰<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2019年04月20日 <br>
 * @see com.example.thymeleaf.controller <br>
 * @since V1.0 <br>
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String getDemo() {
        System.out.println("hello world");
        return "Hello world";
    }
}
