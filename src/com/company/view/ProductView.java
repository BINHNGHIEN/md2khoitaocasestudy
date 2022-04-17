package com.company.view;

import com.company.controller.ProductController;
import com.company.controller.ProductPortfolioController;
import com.company.model.Product;
import com.company.model.ProductPortfolio;
import com.company.service.product.ProductServiceIMPL;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);
    ProductController productController= new ProductController();
    ProductPortfolioController productPortfolioController= new ProductPortfolioController();
    List<Product> productList= ProductServiceIMPL.productList;

    public ProductView() {
    }

    public void showListProduct(){
        System.out.println(productController.showListProductPortfolio());
        System.out.println("Enter QUIT to come back menu: ");
        String backMenu = scanner.nextLine();
        if(backMenu.equalsIgnoreCase("quit")){
            new Main();
        }
    }

    public void createProduct(){
        while (true){
            int id;
            if(ProductServiceIMPL.productList.size()==0){
                id = 1;
            } else {
                id = productList.get(productList.size()-1).getId()+1;
            }
            System.out.println("Enter the name Student: ");
            String name = scanner.nextLine();
            System.out.println("Enter the age Student: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the id Class Room: ");
            int idClass = Integer.parseInt(scanner.nextLine());
            ProductPortfolio productPortfolio = productPortfolioController.findById(idClass);
            Product product = new Product(id,name,age,productPortfolio);
            productController.createProduct(product);
            System.out.println("Enter any key to continue create Student or Enter QUIT to come back menu: ");
            String backMenu = scanner.nextLine();
            if(backMenu.equalsIgnoreCase("quit")){
                new Main();
            }
        }
    }
}
