package com.company.controller;

import com.company.model.ProductPortfolio;
import com.company.service.productPortfolio.ProductPortfolioServiceIMPL;

import java.util.List;

public class ProductPortfolioController {
    ProductPortfolioServiceIMPL productPortfolioServiceIMPL= new ProductPortfolioServiceIMPL();
    public List<ProductPortfolio> showListProductPortfolio(){
        return productPortfolioServiceIMPL.findAll();
    }
    public void createProductPortfolio( ProductPortfolio productPortfolio){
        productPortfolioServiceIMPL.save(productPortfolio);
    }

    public  ProductPortfolio findById( int id){
        return productPortfolioServiceIMPL.findById(id);
    }
}
