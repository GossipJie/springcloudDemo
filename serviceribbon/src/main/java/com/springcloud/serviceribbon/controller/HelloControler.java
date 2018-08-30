package com.springcloud.serviceribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springcloud.serviceribbon.service.HelloService;

/**
 * @author jiezhou81
 * @version $$Id: HelloControler, v 0.1 2018/8/30 16:23 jiezhou81 Exp $$
 */
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }


}
