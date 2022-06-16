package mercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock {
    
    private ArrayList<Product> products = new ArrayList<Product>();
    private float refrigerationCostDay;
    private float dailyCost = 0.0f;
    private Scanner scanner = new Scanner(System.in);
    private int counter;

    
    public Stock() {
        System.out.print("Refrigeration Cost: ");
        setRefrigerationCost(scanner.nextFloat());
        System.out.println();
        System.out.println("-========================================================================================================-");

    }

    public float getRefrigerationCost() {
        return refrigerationCostDay;
    }

    public void setRefrigerationCost(float refrigerationCostDay) {
        if(refrigerationCostDay < 0) {
            this.refrigerationCostDay = 0;
        } else {
            this.refrigerationCostDay = refrigerationCostDay;
        }
    }

    public float dailyCost() {
        for (Product products : products) {
            if(products.getRegrigeration()) {
                dailyCost = dailyCost + products.stockPrice() + getRefrigerationCost();
            } else {
                dailyCost = dailyCost + products.stockPrice();
            }
        }
        return dailyCost;
    }

    public void showProducts() {
        if(products.isEmpty()) {
            System.out.println("You have no products in your stock");
            System.out.println();
            System.out.println("-========================================================================================================-");
        } else {
            for (Product products: products) {
                products.showInfo();
            }
        }
    }

    public void addProduct() {
        products.add(new Product(counter)); 
        counter++;   
    }

    public void removeProduct(int i) {
        products.remove(i);
        for (Product products: products) {
            if(products.getProductIndex() <= i) {
                continue;
            } else {
                products.setProductIndex(products.getProductIndex() - 1);;
            }
        }
        System.out.println();
        System.out.println("-========================================================================================================-");
    }

    public void restockProduct(int i) {
        System.out.println("How much of that product would you like to buy for the restock ");
        products.get(i).restockProduct(scanner.nextInt());
    }

    public void buyProduct(int i) {
        System.out.println("How much of this product would you like to buy");
        products.get(i).buyProduct(scanner.nextInt());
    }

    public void changePrice(int i) {
        System.out.println("How much would the new price be");
        products.get(i).changePrice(scanner.nextFloat());
    }

}
