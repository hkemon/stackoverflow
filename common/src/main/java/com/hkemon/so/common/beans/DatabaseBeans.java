package com.hkemon.so.common.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DatabaseBeans {
    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
