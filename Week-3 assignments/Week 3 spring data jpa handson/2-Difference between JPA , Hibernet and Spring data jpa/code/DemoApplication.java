package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a new user
        User user = new User();
        user.setName("John Doe");
        userRepository.save(user);

        // Fetch user
        userRepository.findAll().forEach(u -> System.out.println("User: " + u.getName()));
    }
}