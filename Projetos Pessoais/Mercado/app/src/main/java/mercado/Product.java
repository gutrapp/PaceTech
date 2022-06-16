package mercado;

import java.util.Scanner;

public class Product {

    private Scanner scanner = new Scanner(System.in);
    private String productName;
    private float productPrice;
    private float restockPrice;
    private boolean refrigeration;
    private int productQuantity;
    private int productIndex;

    public Product(int index) {
        System.out.print("Product Name: ");
        setProductName(scanner.nextLine());
        System.out.print("Product Price: ");
        setProductPrice(scanner.nextFloat());
        System.out.print("Refrigeration: ");
        setRegrigeration(scanner.nextBoolean());
        System.out.print("Restock Price: ");
        setRestockPrice(scanner.nextFloat());
        System.out.print("Product Quantity: ");
        setProductQuantity(scanner.nextInt());
        System.out.println();
        setProductIndex(index);
        System.out.println();
        System.out.println("-========================================================================================================-");
    }
    
    public float getProductQuantity() {
        return productQuantity;
    }

    public int getProductIndex() {
        return productIndex;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public float getRestockPrice() {
        return restockPrice;
    }

    public boolean getRegrigeration() {
        return refrigeration;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(float productPrice) {
        if(productPrice < 0) {
            this.productPrice = 0;
        } else {
            this.productPrice = productPrice;
        }
    }

    public void setRestockPrice(float restockPrice) {
        if(restockPrice < 0) {
            this.restockPrice = 0;
        } else {
            this.restockPrice = restockPrice;
        }
    }

    public void setRegrigeration(Boolean refrigeration) {
        this.refrigeration = refrigeration;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductIndex(int productIndex) {
        this.productIndex = productIndex;
    }

    public void setProductQuantity(int productQuantity) {
        if(productQuantity < 0) {
            this.productQuantity = 0;
        } else {
            this.productQuantity = productQuantity;
        }
    }

    public void showInfo() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Product Restock Price: " + restockPrice);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println("Refrigeration: " + refrigeration);
        System.out.println("ID: " + productIndex);
        System.out.println();
        System.out.println("-========================================================================================================-");
    }

    public void restockProduct(int restockQuantity) {
        this.productQuantity = this.productQuantity + restockQuantity;
    }

    public void buyProduct(int buyQuantity) {
        if(buyQuantity > this.productQuantity) {
            buyQuantity = buyQuantity - this.productQuantity;
            System.out.println("You bought only " + buyQuantity + ", because we didn't have enough " + productName + "s/es on stock");
            productQuantity = 0;
        } else {
            this.productQuantity = this.productQuantity - buyQuantity;
            System.out.println("You bought " + buyQuantity + " " + productName + "s/es");
            
        }
        System.out.println();
        System.out.println("-========================================================================================================-");
        
    }

    public void changePrice(float newPrice) {
        this.productPrice = newPrice;
    }

    public float stockPrice() {
        return productQuantity * restockPrice;
    }
}
