package com.example.resellChartBackend.controllers;

import com.example.resellChartBackend.domains.ClothItem;
import com.example.resellChartBackend.services.ClothItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/clothItem")
public class ClothItemController {

    private final ClothItemService clothItemService;

    @Autowired
    public ClothItemController(ClothItemService clothItemService){
        this.clothItemService = clothItemService;
    }
    @GetMapping
    public List<ClothItem> getClothItems(){
        return clothItemService.getClothItems();
    }
    @PostMapping
    public void registerNewClothItem(@RequestBody ClothItem item){
        clothItemService.addNewClothItem(item);
    }
}
