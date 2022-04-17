package com.company.view;

import com.company.controller.ProductPortfolioController;
import com.company.model.ProductPortfolio;
import com.company.service.productPortfolio.ProductPortfolioServiceIMPL;

import java.util.List;
import java.util.Scanner;

public class ProductPortfolioView {
    Scanner scanner = new Scanner(System.in);
    ProductPortfolioController productPortfolioController = new ProductPortfolioController();
    List<ProductPortfolio> productPortfolioList = ProductPortfolioServiceIMPL.productPortfolioList;
    public void formCreateProductPortfolio(){
        while (true){
            int id;
            if(productPortfolioList.size()==0){
                id = 1;
            } else {
                id =  productPortfolioList.get(productPortfolioList.size()-1).getId()+1;
            }
            System.out.println("Enter the name class room: ");
            String name = scanner.nextLine();
            ProductPortfolio productPortfolio = new ProductPortfolio(id,name);
            productPortfolioController.createProductPortfolio(productPortfolio);
            System.out.println("Enter any key to continue create ClassRoom or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if(backMenu.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }


    public void formListProductPortfolio(){
        System.out.println(productPortfolioController.showListProductPortfolio());
        System.out.println("Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }
}
