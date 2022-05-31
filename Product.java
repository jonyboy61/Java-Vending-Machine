package com.company;

public class Product {

    private String itemName;
    private double itemPrice;
    private int itemQuantity;



    public Product(String name, double price, int quantity) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }


    public Product(String name) {
        this.itemName= name;
    }

    public String getItemName() {
        return itemName;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public double getItemPrice() {
        return itemPrice;
    }


    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }


    public int getItemQuantity() {
        return itemQuantity;
    }


    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void sellItem(){
        if(this.itemQuantity == 0){
            System.out.println("ITEM NOT AVAILABLE");
        }
        else{
            this.itemQuantity -= 1;
        }
    }

}
