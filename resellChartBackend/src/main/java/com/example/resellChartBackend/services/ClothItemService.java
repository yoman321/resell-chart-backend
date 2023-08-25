package com.example.resellChartBackend.services;

import com.example.resellChartBackend.domains.ClothItem;
import com.example.resellChartBackend.repositories.ClothItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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

    public void addNewClothItem(ClothItem item) {

        Example<ClothItem> exampleItem = Example.of(item);
        List<ClothItem> optionalItem = clothItemRepository.findAll(exampleItem);

        if (!optionalItem.isEmpty()){
            throw new IllegalStateException("Item already exist in your inventory");
        }
        clothItemRepository.save(item);
    }

    public void removeClothItem(ClothItem item) {

        Example<ClothItem> exampleItem = Example.of(item);
        List<ClothItem> optionalItem = clothItemRepository.findAll(exampleItem);

        if (optionalItem.isEmpty()){
            throw new IllegalStateException("item does not exist in your inventory");
        }
        clothItemRepository.deleteAll(optionalItem);
    }
}
