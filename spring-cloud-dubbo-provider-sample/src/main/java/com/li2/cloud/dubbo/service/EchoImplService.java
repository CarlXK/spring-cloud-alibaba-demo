package com.li2.cloud.dubbo.service;


import org.apache.dubbo.config.annotation.Service;

/**
 * Dubbo Spring Cloud
 */
@Service
public class EchoImplService implements EchoService {

    @Override
    public String echo(String message) {
        return "[echo] Hello, " + message;
    }
}
