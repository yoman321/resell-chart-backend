package com.example.resellChartBackend.services;

import com.example.resellChartBackend.ClothItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothItemService {

    public List<ClothItem> getClothItems(){
        return List.of(
                new ClothItem(1L,
                        "Shoe",
                        "Airforce 1",
                        11
                ),
                new ClothItem(2L,
                        "Shoe",
                        "Airforce 2",
                        12)
        );
    }

}
