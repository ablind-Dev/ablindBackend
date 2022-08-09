package com.example.demo.repository.shop;

import com.example.demo.entity.shop.ItemOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemOptionRepository extends JpaRepository<ItemOption, Long> {
}
