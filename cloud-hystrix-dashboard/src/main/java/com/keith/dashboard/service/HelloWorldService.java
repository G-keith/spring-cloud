package com.keith.dashboard.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author keith
 * @version 1.0
 * @date 2019/7/24
 */
@Service
public class HelloWorldService {

    private final RestTemplate restTemplate;

    public HelloWorldService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "error")
    public String hello(String name) {
        return restTemplate.getForObject("http://cloud-procedure/hello?name="+name, String.class);
    }

    public String error(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
