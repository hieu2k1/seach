package com.example.trainning.Service;

import com.example.trainning.entity.ProductEntity;
import com.example.trainning.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrdServiceImpl implements PrdService{
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductEntity> findAllProduct() {
        return productRepo.findAll();
    }
    @Override
    public ProductEntity searchProduct(ProductEntity p){
        return productRepo.save(p);
    }
}
