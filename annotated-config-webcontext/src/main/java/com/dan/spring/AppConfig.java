package com.dan.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.client.core.WebServiceTemplate;

// This class defines bean definitions for root application context (parent application context)
@Configuration

// (4) Specifies locations to scan for user defined spring beans
@ComponentScan(basePackages = { "com.dan.spring.dao" })
public class AppConfig {

    // (5) Bean definitions from the springframework classes
    @Bean
    public WebServiceTemplate getWebserviceTemplate() {
        WebServiceTemplate template = new WebServiceTemplate();
        return template;
    }

}
