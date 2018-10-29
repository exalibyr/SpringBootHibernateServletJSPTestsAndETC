package com.excalibur.firstWEBMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = "com.excalibur.firstWEBMVC.controller")
//@ComponentScan(basePackageClasses = GreetingController.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
