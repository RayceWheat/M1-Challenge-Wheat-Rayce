package com.company.factory;

public class IceCream {

    //flavor, salePrice, productionCost, productionTime, ingredients;


    private String name;

    private double costToMake;

    private double salePrice;

    private int stockOfIceCream;

    private String ingredients;

    public int produceMoreIceCream(int num) {
        System.out.println(stockOfIceCream);

        stockOfIceCream = stockOfIceCream + num;

        System.out.println(stockOfIceCream);

        return stockOfIceCream;
    }

    public double cutCostOfProduction(double num){
        System.out.println(costToMake);

        if(costToMake - num < 0){
            System.out.println("It can't cost 0 or less");
            return 0;
        }
        costToMake = costToMake - num;
        System.out.println(costToMake);
        return costToMake;

    }

    public int sellIceCream(int num){
        System.out.println(stockOfIceCream);

        stockOfIceCream = stockOfIceCream - num;

        if (stockOfIceCream < 0 ){
            stockOfIceCream = 0;
        }

        System.out.println(stockOfIceCream);

        return stockOfIceCream;
    }

    public double haveInflationStrikeYourBussiness(double num){
        System.out.println(salePrice);

            salePrice = salePrice + num;
            System.out.println(salePrice);
            return salePrice;


    }



    public IceCream(String name, double costToMake, double salePrice, int stockOfIceCream, String ingredients) {
        this.name = name;
        this.costToMake = costToMake;
        this.salePrice = salePrice;
        this.stockOfIceCream = stockOfIceCream;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostToMake() {
        return costToMake;
    }

    public void setCostToMake(double costToMake) {
        this.costToMake = costToMake;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getStockOfIceCream() {
        return stockOfIceCream;
    }

    public void setStockOfIceCream(int stockOfIceCream) {
        this.stockOfIceCream = stockOfIceCream;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
