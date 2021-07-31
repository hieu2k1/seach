package com.example.trainning.Service;

import com.example.trainning.entity.ProductEntity;

import java.util.List;

public interface PrdService {
    List<ProductEntity> findAllProduct();

    ProductEntity searchProduct(ProductEntity p);
}
