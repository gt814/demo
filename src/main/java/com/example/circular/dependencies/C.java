package com.example.circular.dependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class C {

    private D d;

    @Autowired
    public C(@Lazy D d) {
        this.d = d;
    }

    public String getName() {
        return "bean C";
    }

    @PostConstruct
    public void init() {
        System.out.println(d.getName());
    }
}
