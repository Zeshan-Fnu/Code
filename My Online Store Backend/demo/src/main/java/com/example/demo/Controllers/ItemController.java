package com.example.demo.Controllers;

import com.example.demo.Models.Item;
import com.example.demo.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "Items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    } 

    @GetMapping(path = "getAllItems")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }
}
