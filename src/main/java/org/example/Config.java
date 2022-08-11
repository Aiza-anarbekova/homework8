package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource("classpath:application.properties")
public class Config {
    @Bean
    public Horse horse(){
        return new Horse();
    }
    @Bean
    public Bunny bunny(){
        return new Bunny();

    }
    @Bean
    public Person person(){
        return new Person(horse(),bunny());
    }


}
