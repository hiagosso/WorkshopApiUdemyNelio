package com.hiagodev.course.config;

import com.hiagodev.course.entities.User;
import com.hiagodev.course.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("maria","maria@gmail.com","1191919111","122");
        User u2 = new User("mario","mario@gmail.com","11999111","133");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
