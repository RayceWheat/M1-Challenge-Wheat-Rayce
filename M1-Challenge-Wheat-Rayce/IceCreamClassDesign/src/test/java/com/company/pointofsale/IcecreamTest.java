package com.company.pointofsale;

import junit.framework.TestCase;
import org.junit.Test;

public class IcecreamTest extends TestCase {

    @Test
    public void testSellIceCream() {
        //Arrange
        Icecream icecream = new com.company.pointofsale.Icecream("Vanilla", 100, 5);

        //Act
        int expectedValue = 50;
        int actualValue = icecream.sellIceCream(50);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testRestockIceCream() {
        //Arrange
        Icecream icecream = new com.company.pointofsale.Icecream("Vanilla", 100, 5);

        //Act
        int expectedValue = 150;
        int actualValue = icecream.restockIceCream(50);
        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void testPutIceCreamOnSale() {
        //Arrange
        Icecream icecream = new com.company.pointofsale.Icecream("Vanilla", 100, 5);

        //Act
        double expectedValue = 2.5;
        double actualValue = icecream.putIceCreamOnSale(2.5);
        //Assert
        assertEquals(expectedValue, actualValue, .1);

    }
}