package com.company.controller;

import com.company.model.Product;
import com.company.service.product.ProductServiceIMPL;

import java.util.List;

public class ProductController {
    ProductServiceIMPL productServiceIMPL= new ProductServiceIMPL();
    public List<Product> showListProductPortfolio(){
        return productServiceIMPL.findAll();
    }
    public void createProduct( Product product){
        productServiceIMPL.save(product);
    }
}
