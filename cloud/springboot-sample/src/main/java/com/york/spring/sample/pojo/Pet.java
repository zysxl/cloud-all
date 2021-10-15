package com.york.spring.sample.pojo;

/**
 * @author by: zhouyang
 * @name: Pet
 * @Description: TODO
 * @Date: 2021/10/15 9:28 下午
 */
public class Pet {

    private String type;

    private String name;

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
