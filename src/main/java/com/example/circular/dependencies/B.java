package com.example.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class B {

    @Autowired
    private A a;

    public String getName() {
        return "bean B";
    }

    @PostConstruct
    private void init() {
        System.out.println(a.getName());
    }
}
