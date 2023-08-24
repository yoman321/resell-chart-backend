package com.example.resellChartBackend.controllers;

import com.example.resellChartBackend.domains.ClothItem;
import com.example.resellChartBackend.services.ClothItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
