package com.yts.Keli.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class KeliCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeliCouponApplication.class, args);
    }

}
