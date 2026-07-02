package com.springcore.mavenproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MavenApp app = context.getBean("mavenApp", MavenApp.class);

        app.showMessage();
    }
}