package com.example.infnet.controllers;

import com.example.infnet.dto.ProductDTO;
import com.example.infnet.model.ProductModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private ProductModel productModel;

    @PostMapping
    public void buy(@RequestBody ProductDTO product) {
        System.out.println("Buying.. " + productModel.get() );
    }


}