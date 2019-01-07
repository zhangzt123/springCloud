package com.feign.feignService;

import com.feign.feignEntity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "springbootservice")
public interface HelloFeign {
    @GetMapping( value = "/basic/helloworld")
    String gethelloworld();
    @GetMapping( value = "/basic/helloworldforfeign")
    String gethelloworldparam(  @RequestParam("param")  String param);
//    String gethelloworldparam(@RequestBody User user);
//    String gethelloworldparam( @RequestHeader  String param);
}
