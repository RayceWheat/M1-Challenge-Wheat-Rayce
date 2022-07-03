package com.company.factory;

import com.company.pointofsale.Icecream;
import junit.framework.TestCase;
import org.junit.Test;

public class IceCreamTest extends TestCase {

    @Test
    public void testProduceMoreIceCream() {
        //Arrange
        IceCream icecream = new com.company.factory.IceCream(
                "Chocolate",
                2.5,
                12.25,
                1000,
                "Milk, Coco Beans, Ice");

        //Act
        int expectedValue = 1500;
        int actualValue = icecream.produceMoreIceCream(500);

        //Assert
        assertEquals(expectedValue, actualValue);


    }

    @Test
    public void testCutCostOfProduction() {
        //Arrange
        IceCream icecream = new com.company.factory.IceCream(
                "Chocolate",
                2.5,
                12.25,
                1000,
                "Milk, Coco Beans, Ice");

        //Act
        double expectedValue = 2.00;
        double actualValue = icecream.cutCostOfProduction(0.50);

        //Assert
        assertEquals(expectedValue, actualValue, .10);
    }

    @Test
    public void testSellIceCream() {
        //Arrange
        IceCream icecream = new com.company.factory.IceCream(
                "Chocolate",
                2.5,
                12.25,
                1000,
                "Milk, Coco Beans, Ice");

        //Act
        int expectedValue = 500;
        int actualValue = icecream.sellIceCream(500);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testIfInflationStrikingYourBussinessIncreaseSalePrice(){
        //Arrange
        IceCream icecream = new com.company.factory.IceCream(
                "Chocolate",
                2.5,
                12.25,
                1000,
                "Milk, Coco Beans, Ice");

        //Act
        double expectedValue = 112.25;
        double actualValue = icecream.haveInflationStrikeYourBussiness(100.00);

        //Assert
        assertEquals(expectedValue, actualValue, .10);

    }
}