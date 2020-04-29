package com.example.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class D {

    private C c;

    @Autowired
    public D(@Lazy C c) {
        this.c = c;
    }

    public String getName() {
        return "bean D";
    }

    @PostConstruct
    private void init() {
        System.out.println(c.getName());
    }
}
