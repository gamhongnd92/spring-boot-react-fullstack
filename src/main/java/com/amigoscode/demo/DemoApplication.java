package com.amigoscode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        printMessage();
    }

    private static void printMessage() {
        String message = "Hello Gam, How are you?";
        System.out.println(message);
    }
}
