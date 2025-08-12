package com.yts.Keli.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.yts.Keli.member.fegin")
public class KeliMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeliMemberApplication.class, args);
    }

}
