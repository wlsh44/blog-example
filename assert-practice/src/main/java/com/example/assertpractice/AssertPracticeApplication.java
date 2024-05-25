package com.example.assertpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssertPracticeApplication {

    public static void main(String[] args) {
        assert false;
        SpringApplication.run(AssertPracticeApplication.class, args);
    }

}
