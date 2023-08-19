package com.example.resellChartBackend.services;

import com.example.resellChartBackend.domains.ClothUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothUserService {

    public List<ClothUser> getClothUsers(){
        return List.of(
                new ClothUser(
                        1,
                    "someemail@gmail.com"
                ),
                 new ClothUser(2,
                         "notanemail@gmail.com")
        );
    }
}
