package com.example.demo.Config;

import com.example.demo.Models.Item;
import com.example.demo.Repositories.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ItemConfig {

    @Bean
    CommandLineRunner commandLineRunner(ItemRepository itemRepository ){
        return args -> {
            Item Shirt = new Item(
                    "Shirt",
                    20.5,
                    5
            );
            Item Jeans = new Item(
                    "Jeans",
                    35.5,
                    8
            );
            itemRepository.saveAll(
                    List.of( Shirt, Jeans)
            );
        };
    }
}
