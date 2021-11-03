package com.york.spring.sample.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author by: zhouyang
 * @name: ParamReq
 * @Description: TODO
 * @Date: 2021/10/17 8:48 下午
 */
@Data
@Component
@ConfigurationProperties("param")
@PropertySource("classpath:param.properties")
public class ParamReq {
    private String id;

    private String name;
}
