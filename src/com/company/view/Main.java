package com.company.view;

import java.util.Scanner;

public class Main {
    public Main(){
        System.out.println("1. REGISTER");
        System.out.println("2. LOGIN");
        Scanner scanner = new Scanner(System.in);
        int choose= scanner.nextInt();
        switch (choose){
            case 1:
                new RegisterView();
                break;
            case 2:
                new LoginView();
                break;
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("1. Creat product portfolio");
        System.out.println("2. Show list product portfolio");
        System.out.println("3. CREATE PRODUCT");
        System.out.println("4. SHOW LIST PRODUCT");
        int chooseMenu = scanner2.nextInt();
        switch (chooseMenu){
            case 1:
                new ProductPortfolioView().formCreateProductPortfolio();
                break;
            case 2:
                new ProductPortfolioView().formListProductPortfolio();
                break;
            case 3:
                new ProductView().createProduct();
                break;
            case 4:
                new ProductView().showListProduct();
        }
    }




    public static void main(String[] args) {
        new Main();
    }
}
