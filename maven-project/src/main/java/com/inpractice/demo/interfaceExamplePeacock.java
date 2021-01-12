package com.inpractice.demo;

import org.springframework.stereotype.Component;

@Component
public class interfaceExamplePeacock implements InterfaceExample {

    public String bird() {
        return "peacock";
    }
}
