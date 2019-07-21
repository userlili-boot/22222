package org.free.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayStarter {

    public static void main(String[] args) {
        System.out.println("------------------spring boot start ---------------------");
        SpringApplication.run(GatewayStarter.class, args);
        System.out.println("------------------spring boot end ---------------------");
    }

}
