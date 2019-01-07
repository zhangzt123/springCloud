package com.feign.feignController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.feign.feignService.HelloFeign;
@RestController
public class FeignController {

    @Autowired
    HelloFeign helloFeign;

    @GetMapping("/hellodemo")
    String gethelloworld()
    {
       String demo= helloFeign.gethelloworld();
        return demo;
    }
    @GetMapping("/hellodemoparam/{param}")
    String gethelloworldparam(@PathVariable String param)
    {
        String demo= helloFeign.gethelloworldparam(param);
        return demo;
    }
}
