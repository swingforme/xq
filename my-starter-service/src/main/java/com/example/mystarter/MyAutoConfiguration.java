package com.example.mystarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyStarterProperties.class)
//@ConditionalOnWebApplication
public class MyAutoConfiguration {

    @Autowired
    MyStarterProperties myStarterProperties;


    @Bean
    public MyStarterService myStarterService(){
        MyStarterService myStarterService = new MyStarterService();
        myStarterService.setMyStarterProperties(myStarterProperties);
        return myStarterService;
    }
}

