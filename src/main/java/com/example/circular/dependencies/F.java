package com.example.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class F {

    @Autowired
    private ApplicationContext context;

    private E e;

    public String getName() {
        return "bean F";
    }

    @PostConstruct
    public void init() {
        this.e = context.getBean(E.class);
        System.out.println(e.getName());
    }
}
