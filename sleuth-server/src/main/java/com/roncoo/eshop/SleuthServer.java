package com.roncoo.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthServer {

    public static void main(String[] args) {
        SpringApplication.run(SleuthServer.class, args);
    }
//、调用接口，查看http://localhost:8780
//    2、在say-hello-service和greeting-service中加入sleuth支持
//
//（1）pom.xml
//
//            <dependency>
//	<groupId>org.springframework.cloud</groupId>
//	<artifactId>spring-cloud-starter-zipkin</artifactId>
//</dependency>
//
//            （2）application.yml
//
//    spring.zipkin.base-url=http://localhost:9411
}