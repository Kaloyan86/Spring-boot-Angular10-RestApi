package com.restapi;

import com.restapi.models.User;
import com.restapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }


    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Kaloyan","Kostadinov","kaloqn_kostadinow@abv.bg"));
        this.userRepository.save(new User("Ivo","Ivanov","ivo@abv.bg"));
        this.userRepository.save(new User("Peter","Petrov","pesho@abv.bg"));
    }
}
