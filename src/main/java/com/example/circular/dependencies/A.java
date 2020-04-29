package com.example.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class A {

    @Autowired
    private B b;

    public String getName() {
        return "bean A";
    }

    @PostConstruct
    public void init() {
        System.out.println(b.getName());
    }
}
