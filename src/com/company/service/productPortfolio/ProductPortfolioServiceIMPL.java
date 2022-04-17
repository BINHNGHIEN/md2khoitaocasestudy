package com.company.service.productPortfolio;

import com.company.config.ConfigReadAndWrite;
import com.company.model.ProductPortfolio;

import java.util.List;

public class ProductPortfolioServiceIMPL implements IProductPortfolioService{
    public static String PATH = "/Users/mac/IdeaProjects/md2khoitaouser/src/com/company/data/productPortfolio.txt";
    public static List<ProductPortfolio> productPortfolioList=  new ConfigReadAndWrite<ProductPortfolio>().readFromFile(PATH);

    @Override
    public List<ProductPortfolio> findAll() {
        new ConfigReadAndWrite<ProductPortfolio>().writeToFile(PATH,productPortfolioList);
        return productPortfolioList;
    }

    @Override
    public void save(ProductPortfolio productPortfolio) {
        productPortfolioList.add(productPortfolio);

    }

    @Override
    public ProductPortfolio findById(int id) {
        for ( int i=0;i<productPortfolioList.size();i++)
            if(id==productPortfolioList.get(i).getId()){
                return productPortfolioList.get(i);
            }
        return null;
    }
}
