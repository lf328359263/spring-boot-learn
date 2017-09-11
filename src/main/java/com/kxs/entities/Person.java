package com.kxs.entities;

/**
 * Created by kongxiangshuai on 2017/8/21.
 */
public class Person {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
        super();
    }

    public Person(String name, Integer age) {
        this();
        this.name = name;
        this.age = age;
    }
}
