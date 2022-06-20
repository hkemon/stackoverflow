package com.hkemon.so.common;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

import java.net.URI;

@Component
public class URLComponent {
    private final DiscoveryClient client;

    public URLComponent(DiscoveryClient client) {
        this.client = client;
    }

    public URI getURI(String serviceName, String path) {
        return client.getInstances(serviceName).stream()
                .findFirst().map(instance -> URI.create(instance.getUri().toString() + path))
                .orElseThrow(RuntimeException::new);
    }

}
