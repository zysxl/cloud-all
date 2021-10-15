package com.york.spring.sample.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author by: zhouyang
 * @name: Student
 * @Description: TODO
 * @Date: 2021/10/15 10:25 下午
 */
@Component
@Data
public class Student {

    @Value("${person.id}")
    private int id;

    @Value("${person.name}")
    private String name;
}
