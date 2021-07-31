package com.example.trainning.repository;

import com.example.trainning.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {

}
