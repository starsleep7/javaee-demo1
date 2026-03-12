package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        System.out.println("Hello, Git and Maven!");
        System.out.println("This is my first version-controlled project.");
        System.out.println("This line was added on GitHub.");
        System.out.println("This line was added locally after pull.");
        System.out.println("Another line from GitHub after local commit.");
    }

}
