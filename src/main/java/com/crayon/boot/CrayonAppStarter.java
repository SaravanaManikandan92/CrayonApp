package com.crayon.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan({"com.crayon"})
@PropertySource(ignoreResourceNotFound = true,value={"classpath:application.properties"})
public class CrayonAppStarter  {
    public static void main(String[] args){
        SpringApplication.run(CrayonAppStarter.class,args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}
