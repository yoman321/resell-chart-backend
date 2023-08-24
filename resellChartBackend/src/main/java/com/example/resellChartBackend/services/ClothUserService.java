package com.example.resellChartBackend.services;

import com.example.resellChartBackend.domains.ClothUser;
import com.example.resellChartBackend.repositories.ClothUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void addNewClothUser(ClothUser clothUser) {
        Optional<ClothUser> userOptional = clothUserRepository.findClothUserByEmail(clothUser.getEmail());
        if (userOptional.isPresent()){
            throw new IllegalStateException("email is taken");
        }
        clothUserRepository.save(clothUser);
    }

    public void deleteClothUser(Long id) {
        boolean exist = clothUserRepository.existsById(id);

        if (!exist) {
            throw new IllegalStateException("Cloth user with id " + id + " does not exist");
        }
        clothUserRepository.deleteById(id);
    }
}
