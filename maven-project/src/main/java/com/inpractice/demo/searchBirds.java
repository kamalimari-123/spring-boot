package com.inpractice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class searchBirds {
    @Autowired
    private InterfaceExample interfaceExample;
    public searchBirds(InterfaceExample interfaceExample) {
        super();
        this.interfaceExample = interfaceExample;
    }

    public String search() {
        String bird = interfaceExample.bird();
        return bird;
    }
}
