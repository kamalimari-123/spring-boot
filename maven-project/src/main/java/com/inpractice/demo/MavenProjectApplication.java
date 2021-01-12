package com.inpractice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MavenProjectApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(MavenProjectApplication.class, args);
        CheckWhetherIsAString checkWhetherIsAString = applicationContext.getBean(CheckWhetherIsAString.class,args);
        Boolean result = checkWhetherIsAString.isAString("5");
        searchBirds searchBirds = new searchBirds(new interfaceExamplePeacock());
        String typeOfBird = searchBirds.search();
        System.out.println(typeOfBird);

        System.out.println(result);


    }

}
