package com.hkemon.so.qac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class QacApplication {
    public static void main(String[] args) {
        SpringApplication.run(QacApplication.class, args);
    }

}
