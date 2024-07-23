package com.mendes.spring_boot_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mendes.spring_boot_jpa.model.User;
import com.mendes.spring_boot_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
        // User user = new User();
        // user.setName("André");
        // user.setUsername("Karma");
        // user.setPassword("senha");

        // userRepository.save(user);

        // for (User u: userRepository.findAll()){
        //     System.out.println(u);
        // }


    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userRepository.filterByName("André");
        users.stream().forEach(System.out::println);

        List<User> users2 = userRepository.findByNameContaining("André");
        users2.stream().forEach(System.out::println);

        User uName = userRepository.findByName("André");
        System.out.println(uName);
    }
}
