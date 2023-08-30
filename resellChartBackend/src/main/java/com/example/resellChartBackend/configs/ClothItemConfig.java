package com.example.resellChartBackend.configs;

import com.example.resellChartBackend.domains.ClothItem;
import com.example.resellChartBackend.repositories.ClothItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClothItemConfig {

    @Bean
    CommandLineRunner secondCommandLineRunner(ClothItemRepository repository){
        return args -> {
            ClothItem item1 = new ClothItem(
                    1L,
                    "someemail@gmail.com",
                    "shoes",
                    "Jordan 1",
                    12,
                    2
            );
            ClothItem item2 = new ClothItem(
                    2L,
                    "notanemail@gmail.com",
                    "shoes",
                    "Jordan 1",
                    7,
                    1
            );
            repository.saveAll(List.of(item1, item2));
        };
    }
}
