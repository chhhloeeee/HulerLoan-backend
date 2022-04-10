package com.example.loan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
 
@SpringBootApplication
public class application {
 
    public static void main(String[] args) {
        SpringApplication.run(application.class, args);
    }

    @Bean(name=“entityManagerFactory”)
        public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        return sessionFactory;
    }
 
}