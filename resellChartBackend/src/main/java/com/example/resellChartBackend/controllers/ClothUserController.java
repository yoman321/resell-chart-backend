package com.example.resellChartBackend.controllers;

import com.example.resellChartBackend.domains.ClothUser;
import com.example.resellChartBackend.services.ClothUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/clothUser")
public class ClothUserController {

    private final ClothUserService clothUserService;

    @Autowired
    public ClothUserController(ClothUserService clothUserService){
        this.clothUserService = clothUserService;
    }
    @GetMapping
    public List<ClothUser> getClothUsers(){
       return clothUserService.getClothUsers();
    }
    @PostMapping
    public void registerNewClothUser(@RequestBody ClothUser clothUser){
        clothUserService.addNewClothUser(clothUser);
    }
    @DeleteMapping(path = "{userId}")
    public void deleteClothUser(@PathVariable("userId") Long id){
        clothUserService.deleteClothUser(id);
    }

}
