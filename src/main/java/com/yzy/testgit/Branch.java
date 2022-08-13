package com.yzy.testgit;

import lombok.Data;

@Data
public class Branch {
    private String name;
    private Integer age;
    public Branch(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}
