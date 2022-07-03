package com.company.pointofsale;

public class Icecream {

    private String name;

    private int stock;

    private double price;

    public int sellIceCream(int num){
        System.out.println(stock);

        stock = stock - num;

        System.out.println(stock);

        return stock;

    }

    public int restockIceCream(int num){
        System.out.println(stock);

        stock = stock + num;

        System.out.println(stock);

        return stock;
    }

    public double putIceCreamOnSale(double num){
        System.out.println(price);

        price = price - num;

        System.out.println(price);

        return price;

    }


    public Icecream(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
