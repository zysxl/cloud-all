package com.york.spring.sample.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author by: zhouyang
 * @name: Person
 * @Description: TODO
 * @Date: 2021/10/15 9:30 下午
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private int id;

    private String name;

    private String[] fames;

    private List list;

    private Map map;

    private Pet pet;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fames=" + Arrays.toString(fames) +
                ", list=" + list +
                ", map=" + map +
                ", pet=" + pet +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getFames() {
        return fames;
    }

    public void setFames(String[] fames) {
        this.fames = fames;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
