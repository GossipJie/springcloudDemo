package com.springcloud.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 写一个测试类HelloService，
 * 通过之前注入ioc容器的restTemplate来消费service-hi服务的“/hi”接口，
 * 在这里我们直接用的程序名替代了具体的url地址，
 * 在ribbon中它会根据服务名来选择具体的服务实例，
 * 根据服务实例在请求的时候会用具体的url替换掉服务名
 * @author jiezhou81
 * @version $$Id: HelloService, v 0.1 2018/8/30 16:23 jiezhou81 Exp $$
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;
    
    public String hiService(String name) {
       return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiTest(String name) {
        return restTemplate.getForObject("http://localhost:8762/hi?name="+name,String.class);
    }
}