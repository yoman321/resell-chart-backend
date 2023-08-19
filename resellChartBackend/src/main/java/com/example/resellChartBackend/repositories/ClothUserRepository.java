package com.example.resellChartBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.resellChartBackend.domains.ClothUser;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothUserRepository extends JpaRepository<ClothUser, Long> {
}
