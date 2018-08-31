package com.springcloud.consumerhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiezhou81
 * @version $$Id: HelloController, v 0.1 2018/8/31 14:38 jiezhou81 Exp $$
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return restTemplate.getForEntity("http://SERVICE-HI/hi", String.class).getBody();
    }
}

