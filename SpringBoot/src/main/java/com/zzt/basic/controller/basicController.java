package com.zzt.basic.controller;

import com.zzt.basic.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("basic")
public class basicController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private BasicService basicService;
    public void setBasicService(BasicService basicService) {
        this.basicService = basicService;
    }
    @RequestMapping("helloworld")
    @ResponseBody
    public String helloworld()
    {
        return "helloworld";
    }



    @RequestMapping("euerkaservicelist")
    @ResponseBody
    public String euerkaservicelist()
    {
        List<String> list= discoveryClient.getServices();
        for(String s :list)
        {
            System.out.println(s);
        }
        return "";
    }
}
