package com.test.ThymeleafTest.Configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean<CSPFilter> cspFilterRegistrationBean() {
        FilterRegistrationBean<CSPFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CSPFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
