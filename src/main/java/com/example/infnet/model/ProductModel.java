package com.example.infnet.model;

import java.util.List;

import com.example.infnet.dto.ProductDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8081/products", name = "productModel")
public interface ProductModel {

    @GetMapping
    public List<ProductDTO> get();

}
