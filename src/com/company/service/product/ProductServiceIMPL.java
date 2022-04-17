package com.company.service.product;

import com.company.config.ConfigReadAndWrite;
import com.company.model.Product;

import java.util.List;

public class ProductServiceIMPL implements IProductService{
    public static String PATH= "/Users/mac/IdeaProjects/md2khoitaouser/src/com/company/data/product.txt";
    public static List<Product> productList= new ConfigReadAndWrite<Product>().readFromFile(PATH);

    @Override
    public List<Product> findAll() {
        new ConfigReadAndWrite<Product>().writeToFile(PATH,productList);
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
