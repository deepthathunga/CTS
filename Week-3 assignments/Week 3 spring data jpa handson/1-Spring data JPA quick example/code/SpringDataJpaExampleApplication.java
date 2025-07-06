package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {
            repository.save(new User("John"));
            repository.save(new User("Jane"));
            System.out.println("All users:");
            repository.findAll().forEach(user -> System.out.println(user.getId() + ": " + user.getName()));
        };
    }
}
