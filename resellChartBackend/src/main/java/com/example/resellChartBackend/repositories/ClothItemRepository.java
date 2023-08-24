package com.example.resellChartBackend.repositories;

import com.example.resellChartBackend.domains.ClothItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothItemRepository extends JpaRepository<ClothItem, Long> {
}
