package com.hkemon.so.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UsersApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class, args);
    }

}
