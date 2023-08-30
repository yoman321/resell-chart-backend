package com.example.resellChartBackend.repositories;

import com.example.resellChartBackend.domains.ClothItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClothItemRepository extends JpaRepository<ClothItem, Long> {

    Optional<ClothItem> findClothItemByClothItemNameAndClothItemSize(String name, int clothItemSize);

}
