package com.example.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class E {

    @Autowired
    private ApplicationContext context;

    private F f;

    public String getName() {
        return "bean E";
    }

    @PostConstruct
    public void init() {
        this.f = context.getBean(F.class);
        System.out.println(f.getName());
    }
}
