package com.keith.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author keith
 * @version 1.0
 * @date 2019/7/18
 */
@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello "+name+"，this is producer send first messge";
    }
}
