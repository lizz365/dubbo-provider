package com.lizz.dubbo.center;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "com.lizz.dubbo.center.service.impl")
public class DubboCenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboCenterApplication.class, args);
	}

}
