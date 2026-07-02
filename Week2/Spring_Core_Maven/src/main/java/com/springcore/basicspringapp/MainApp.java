package com.springcore.basicspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld hello = context.getBean("helloBean", HelloWorld.class);

        hello.display();
    }
}