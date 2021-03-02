package com.ewallet.services.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean");
    }
}
