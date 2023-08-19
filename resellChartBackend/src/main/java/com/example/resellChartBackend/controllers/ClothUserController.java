package com.example.resellChartBackend.controllers;

import com.example.resellChartBackend.domains.ClothUser;
import com.example.resellChartBackend.services.ClothUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/user")
public class ClothUserController {

    private final ClothUserService userService;

    @Autowired
    public ClothUserController(ClothUserService userService){
        this.userService = userService;
    }
    @GetMapping
    public List<ClothUser> getUsers(){
       return userService.getClothUsers();
    }

}
