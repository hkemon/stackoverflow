package com.hkemon.so.common;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class CommonApplication {
    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }
}
