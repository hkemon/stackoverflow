package com.hkemon.so.qac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = "com.hkemon.so.*")
public class QacApplication {
    public static void main(String[] args) {
        SpringApplication.run(QacApplication.class, args);
    }

}
