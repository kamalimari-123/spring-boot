package com.inpractice.demo;

import org.springframework.stereotype.Component;

@Component
public class CheckWhetherIsAString {
    public Boolean isAString(String value) {
        Boolean whetherItIsAString = value instanceof String;
        return whetherItIsAString;
    }
}
