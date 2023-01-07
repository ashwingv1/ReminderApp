package com.example.remindmeapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


public class SwaggerConfig {
    public Docket api()
    {
//creating constructor of Docket class that accepts parameter DocumentationType
        return new Docket(DocumentationType.SWAGGER_2);
    }
}