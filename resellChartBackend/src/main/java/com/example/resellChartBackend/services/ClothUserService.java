package com.example.resellChartBackend.services;

import com.example.resellChartBackend.domains.ClothUser;
import com.example.resellChartBackend.repositories.ClothUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothUserService {

    private final ClothUserRepository clothUserRepository;

    @Autowired
    public ClothUserService(ClothUserRepository clothUserRepository){
        this.clothUserRepository = clothUserRepository;
    }

    public List<ClothUser> getClothUsers(){
        return clothUserRepository.findAll();
    }
}
