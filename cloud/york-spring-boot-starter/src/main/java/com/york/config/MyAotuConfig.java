package com.york.config;

import com.york.pojo.SimpleBean;
import lombok.extern.log4j.Log4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by: zhouyang
 * @name: MyAotuConfig
 * @Description: TODO
 * @Date: 2021/10/17 10:03 下午
 */
@Log4j
@Configuration
@ConditionalOnClass
public class MyAotuConfig {

    static {
        System.out.println("MyAotuConfig   init ...");
    }

    @Bean
    public SimpleBean getSimpleBean() {
        return new SimpleBean();
    }

}
