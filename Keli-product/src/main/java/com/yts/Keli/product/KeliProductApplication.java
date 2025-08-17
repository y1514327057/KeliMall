package com.yts.Keli.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.yts.Keli.product.dao")
@SpringBootApplication(scanBasePackages = {"com.yts.Keli.product"})
public class KeliProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeliProductApplication.class, args);
    }

}
