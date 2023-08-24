package com.example.resellChartBackend.configs;

import com.example.resellChartBackend.domains.ClothUser;
import com.example.resellChartBackend.repositories.ClothUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClothUserConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClothUserRepository repository){
        return args -> {
            ClothUser Philip = new ClothUser(
                    1L,
                    "someemail@gmail.com",
                    "somepass"
            );
            ClothUser Kevin = new ClothUser(
                    2L,
                    "notanemail@gmail.com",
                    "nopass"
            );
            repository.saveAll(List.of(Philip, Kevin));
        };
    }

}
