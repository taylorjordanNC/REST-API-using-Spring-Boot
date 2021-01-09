package com.example.multimodule;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FindGoodServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FindGoodServiceApplication.class, args);
    }

    @Override
    public void run(String... args) { }
}

