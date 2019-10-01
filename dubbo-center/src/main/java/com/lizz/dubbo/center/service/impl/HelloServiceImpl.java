package com.lizz.dubbo.center.service.impl;

import com.lizz.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * HeeloServiceImpl
 *
 * @author lizz365
 * @date 19/3/19
 */
@Service(timeout = 3000)
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello(String name) {
        System.out.println("Hello name:"+name);
        return "Hello " + name;
    }

    @Override
    public String getBye(String name) {
        System.out.println("Bye name:"+name);
        return "Bye " + name;
    }


}
