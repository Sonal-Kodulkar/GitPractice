package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Configuration
@RestController
public class HelloWorldController {

    @Autowired
    private ResourceBundleMessageSource resourceBundleMessageSource;

    @RequestMapping(method = RequestMethod.GET,path ="/hello-world")
    public String helloWorld()
    {
        return "Hello world";
    }

    // Create a bean
    @GetMapping(path="/hello=world-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hello world");
    }

    // Create a path variable
    @GetMapping(path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldParameter(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello world, %s",name));
    }

    //Internationalization
    @GetMapping(path="/hello-world-internationalization")
    public String helloWorldInternationalization(@RequestHeader(name = "Accept-language",required = false) Locale locale)
    {
        return resourceBundleMessageSource.getMessage("good.morning.message",null,locale);
    }


    }

