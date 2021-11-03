package com.york.spring.sample.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author by: zhouyang
 * @name: TestProperties
 * @Description: TODO
 * @Date: 2021/10/17 8:32 下午
 */
@Data
@Component
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:Test.properties")
public class TestProperties {

    private int id;

    private String name;

}
