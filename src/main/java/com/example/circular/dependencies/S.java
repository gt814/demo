package com.example.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class S {

    public S s;

    @Autowired
    public S(@Lazy S s) {
        this.s = s;
    }

    public String getName() {
        return "bean S";
    }

    @PostConstruct
    public void init() {
        System.out.println(s.getName());
    }
}
