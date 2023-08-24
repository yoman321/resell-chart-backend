package com.example.resellChartBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.resellChartBackend.domains.ClothUser;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClothUserRepository extends JpaRepository<ClothUser, Long> {

    Optional<ClothUser> findClothUserByEmail(String email);
}
