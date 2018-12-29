package com.ribbon.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "getrestTemplate",method = RequestMethod.GET)
    String getrestTemplate() throws Exception
    {
        return restTemplate.getForEntity("http://springbootservice/basic/helloworld",String.class).getBody();
    }

}
