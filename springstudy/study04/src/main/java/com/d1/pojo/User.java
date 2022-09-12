package com.d1.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    public String name;
    //相当于<property name="name" value="小明"/>
    @Value("小明")
    public void setName(String name) {
        this.name = name;
    }
}
