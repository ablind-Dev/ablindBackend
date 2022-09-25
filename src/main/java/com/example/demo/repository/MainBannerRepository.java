package com.example.demo.repository;

import com.example.demo.entity.MainBanner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MainBannerRepository extends JpaRepository<MainBanner, Long> {
}
