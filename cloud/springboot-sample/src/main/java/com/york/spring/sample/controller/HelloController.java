package com.york.spring.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by: zhouyang
 * @name: HelloController
 * @Description: TODO
 * @Date: 2021/10/15 9:02 下午
 */
@RestController
public class HelloController {

    /**
     *  request -> getHello
     * @return
     */
    @RequestMapping("/hello")
    public String getHello() {
        return "hello spring boot !";
    }


}
