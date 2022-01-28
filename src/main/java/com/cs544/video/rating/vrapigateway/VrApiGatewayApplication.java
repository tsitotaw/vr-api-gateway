package com.cs544.video.rating.vrapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class VrApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(VrApiGatewayApplication.class, args);
    }

}
