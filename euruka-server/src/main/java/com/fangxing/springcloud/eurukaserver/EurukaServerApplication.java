package com.fangxing.springcloud.eurukaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 开启Eureka的注册中心，只需要添加这个注解即可
 */
@EnableEurekaServer
@SpringBootApplication
public class EurukaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurukaServerApplication.class, args);
	}
}
