package com.example.trainning.controller;


import com.example.trainning.Service.PrdService;
import com.example.trainning.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class SearchController {
    @Autowired
    PrdService prdService;

    @GetMapping({"/", "index"})
    public String findAll(Model model) {
        List<ProductEntity> ps = prdService.findAllProduct();
        model.addAttribute("ps", ps);
        return "index";
    }

    @PostMapping(value = "/search")
    public String addEmp(@ModelAttribute ProductEntity p){
        prdService.searchProduct(p);
        return "search";
    }
}