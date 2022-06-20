package com.hkemon.so.admin;

import com.hkemon.so.common.URLComponent;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.hkemon.so.*")
@RestController
@AllArgsConstructor
public class AdminApplication {
    private final URLComponent urlComponent;
    private final RestTemplate template;

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return template.getForEntity(urlComponent.getURI("users", "/demo2"), String.class);
    }
}
