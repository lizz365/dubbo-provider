package com.lizz.dubbo.center;

import com.lizz.dubbo.api.HelloService;
import com.lizz.dubbo.center.service.impl.HelloServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
//@DubboComponentScan(basePackages = "com.lizz.dubbo.center.service.impl")
public class DubboCenterApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DubboCenterApplication.class, args);
		ServiceConfig<HelloService> serviceConfig = new ServiceConfig<HelloService>();
		serviceConfig.setApplication(new ApplicationConfig("first-dubbo-provider"));
		serviceConfig.setRegistry(new RegistryConfig("multicast://239.255.255.255:1234?unicast=false"));
		serviceConfig.setInterface(HelloService.class);
		serviceConfig.setRef(new HelloServiceImpl());
		serviceConfig.export();
		System.out.println("DubboProviderApplication started");
		System.in.read();
		System.out.println("DubboProviderApplication started");
	}

}
