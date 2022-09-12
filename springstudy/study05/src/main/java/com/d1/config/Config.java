package com.d1.config;

import com.d1.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public User getUser(){
        return new User();

    }

}
