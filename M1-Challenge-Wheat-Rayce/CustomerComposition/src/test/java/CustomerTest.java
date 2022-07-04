import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void customerHasFirstName(){
        ShippingAddress newShippingAddress = new ShippingAddress("Street1", "Street2", "Austin", "Texas", 75138);
        BillingAddress newBillingAddress = new BillingAddress("Street1","Street2", "Austin", "Texast", 14132);
        Customer newCustomer = new Customer("John", "Doe","John@Email", "555-555-555", newShippingAddress, newBillingAddress, true);

        //Arrange
        String expectedOutput = "John";

        //Act
        String actualOutput = newCustomer.getFirstname();

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void customerHasLastName(){
        //Arrange
        ShippingAddress newShippingAddress = new ShippingAddress("Street1", "Street2", "Austin", "Texas", 75138);
        BillingAddress newBillingAddress = new BillingAddress("Street1","Street2", "Austin", "Texast", 14132);
        Customer newCustomer = new Customer("John", "Doe","John@Email", "555-555-555", newShippingAddress, newBillingAddress, true);
        String expectedOutput = "Doe";

        //Act
        String actualOutput = newCustomer.getLastname();

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void customerHasEmail(){
        //Arrange
        ShippingAddress newShippingAddress = new ShippingAddress("Street1", "Street2", "Austin", "Texas", 75138);
        BillingAddress newBillingAddress = new BillingAddress("Street1","Street2", "Austin", "Texast", 14132);
        Customer newCustomer = new Customer("John", "Doe","John@Email", "555-555-555", newShippingAddress, newBillingAddress, true);
        String expectedOutput = "John@Email";

        //Act
        String actualOutput = newCustomer.getEmail();

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void customerHasPhoneNumber(){
        //Arrange
        ShippingAddress newShippingAddress = new ShippingAddress("Street1", "Street2", "Austin", "Texas", 75138);
        BillingAddress newBillingAddress = new BillingAddress("Street1","Street2", "Austin", "Texast", 14132);
        Customer newCustomer = new Customer("John", "Doe","John@Email", "555-555-555", newShippingAddress, newBillingAddress, true);
        String expectedOutput = "555-555-555";

        //Act
        String actualOutput = newCustomer.getPhonenumber();

        //Assert
        assertEquals(expectedOutput, actualOutput);


    }

    @Test
    public void customerHasShippingAddress(){
        ShippingAddress newShippingAddress = new ShippingAddress("Street1", "Street2", "Austin", "Texas", 75138);
        BillingAddress newBillingAddress = new BillingAddress("Street1","Street2", "Austin", "Texast", 14132);
        Customer newCustomer = new Customer("John", "Doe","John@Email", "555-555-555", newShippingAddress, newBillingAddress, true);
        ShippingAddress expectedOutput = newCustomer.getShippingAddress();

        //Act
        ShippingAddress actualOutput = newShippingAddress;

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void customerHasBillingAddress(){
        //Arrange
        ShippingAddress newShippingAddress = new ShippingAddress("Street1", "Street2", "Austin", "Texas", 75138);
        BillingAddress newBillingAddress = new BillingAddress("Street1","Street2", "Austin", "Texast", 14132);
        Customer newCustomer = new Customer("John", "Doe","John@Email", "555-555-555", newShippingAddress, newBillingAddress, true);
        BillingAddress expectedOutput = newCustomer.getBillingAddress();

        //Act
        BillingAddress actualOutput = newBillingAddress;

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void customerIsRewardsMember(){
        //Arrange
        ShippingAddress newShippingAddress = new ShippingAddress("Street1", "Street2", "Austin", "Texas", 75138);
        BillingAddress newBillingAddress = new BillingAddress("Street1","Street2", "Austin", "Texast", 14132);
        Customer newCustomer = new Customer("John", "Doe","John@Email", "555-555-555", newShippingAddress, newBillingAddress, true);
        boolean expectedOutput = true;

        //Act
        boolean actualOutput = newCustomer.isRewardsMember();

        //Assert
        assertEquals(expectedOutput, actualOutput);

    }


}