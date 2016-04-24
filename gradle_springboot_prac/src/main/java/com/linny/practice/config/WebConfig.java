package com.linny.practice.config;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * Created by russelll on 4/24/16.
 */
@Configuration
public class WebConfig {
    @Bean
    ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new org.h2.server.web.WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}
