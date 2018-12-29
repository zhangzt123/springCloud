package com.hystrix.basic.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class basicController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("Hystrixtest")
    @HystrixCommand(fallbackMethod = "Hystrixcallback")
    String Hystrixtest()
    {
    return  restTemplate.getForEntity("http://springbootservice/basic/helloworld",String.class).getBody();
    }



    String Hystrixcallback()
    {
     return "熔断逻辑";
    }


}
