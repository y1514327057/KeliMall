package com.yts.keligateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.DataSourceBuilder;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class KeliGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeliGatewayApplication.class, args);
    }

}
