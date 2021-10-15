package com.york.spring.sample;

import com.york.spring.sample.controller.HelloController;
import com.york.spring.sample.pojo.Person;
import com.york.spring.sample.pojo.Student;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@Data
@SpringBootTest
class SpringbootSampleApplicationTests {

    @Autowired
    private HelloController helloController;
    @Autowired
    private Person person;
    @Autowired
    private Student student;

    @Test
    void contextLoads() {
        String hello = helloController.getHello();
        log.info(hello);
    }

    @Test
    void contextPerson(){
        log.info(person.toString());
    }



    @Test
    void contextStudent(){
        log.info(student.toString());
    }
}
