package com.example.resellChartBackend.services;

import com.example.resellChartBackend.domains.ClothItem;
import com.example.resellChartBackend.repositories.ClothItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothItemService {

    private final ClothItemRepository clothItemRepository;

    @Autowired
    public ClothItemService(ClothItemRepository clothItemRepository){
        this.clothItemRepository = clothItemRepository;
    }

    public List<ClothItem> getClothItems(){
        return clothItemRepository.findAll();
    }

}
