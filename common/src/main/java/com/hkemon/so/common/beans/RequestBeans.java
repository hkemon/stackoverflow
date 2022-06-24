package com.hkemon.so.common.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class RequestBeans {
    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }
}
