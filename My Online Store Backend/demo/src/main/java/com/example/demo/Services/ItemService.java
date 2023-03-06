package com.example.demo.Services;

import com.example.demo.Models.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    public List<Item> getAllItems(){
        return List.of(
                new Item(
                        1L,
                        "Shirt",
                        20.5,
                        5
                ),
                new Item(
                        2L,
                        "Jeans",
                        35.5,
                        8
                )
        );
    }
}
