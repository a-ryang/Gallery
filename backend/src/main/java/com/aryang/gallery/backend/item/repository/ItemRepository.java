package com.aryang.gallery.backend.item.repository;

import com.aryang.gallery.backend.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
