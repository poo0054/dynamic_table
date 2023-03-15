package cn.dian1.dynamic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhangZhi
 * @version 1.0
 * @since 2022/10/8 18:15
 */
@RestController
@RequestMapping("/tbale")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "我是test";
    }
}
