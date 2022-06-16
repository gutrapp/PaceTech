package mercado;

import java.util.Scanner;

public class Interface {

    public static void main(String[] args) {
        
        Stock isle1 = new Stock();
        int option = 1;
        Scanner scanner = new Scanner(System.in);

        while(option != 8) {
            System.out.println("1- View Stock");
            System.out.println("2- Add Product");
            System.out.println("3- Remove Product");
            System.out.println("4- Restock Product");
            System.out.println("5- Buy Product");
            System.out.println("6- Change price");
            System.out.println("7- Show daily expenses");
            System.out.println("8- Close system");
            option = scanner.nextInt();
            System.out.println();
            System.out.println("-========================================================================================================-");

            switch(option){
                case 1:
                    isle1.showProducts();
                    break;
                case 2:
                    isle1.addProduct();
                    break;
                case 3:
                    System.out.println("Which product you would like to remove");
                    isle1.removeProduct(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Which product you would like to restock");
                    isle1.restockProduct(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("What product would you like to buy");
                    isle1.buyProduct(scanner.nextInt());
                    break;
                case 6:
                    System.out.println("Which product you would you like to change to price of");   
                    isle1.changePrice(scanner.nextInt());
                    break;
                case 7:
                    System.out.println("Your store spends R$" + isle1.dailyCost() + " everyday");
                    System.out.println();
                    System.out.println("-========================================================================================================-");
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Please select a valid option");
                    System.out.println();
                    System.out.println("-========================================================================================================-");
                    break;
            }
        }
        
    }
}
