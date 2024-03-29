package com.keith.dashboard.controller;

import com.keith.dashboard.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keith
 * @version 1.0
 * @date 2019/7/24
 */
@RestController
public class HelloController {

    private final HelloWorldService helloWorldService;

    public HelloController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return helloWorldService.hello( name );
    }
}
