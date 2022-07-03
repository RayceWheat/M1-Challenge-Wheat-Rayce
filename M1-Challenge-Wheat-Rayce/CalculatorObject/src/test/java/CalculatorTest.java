import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addsTwoInts(){
        Calculator calculator = new Calculator();
        int expectedOutput = 5;
        int actualOutput = calculator.add(2, 3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void addTwoDoubles(){
        Calculator calculator = new Calculator();
        double expectedOutput = 9.1;
        double actualOutput = calculator.add(2.3, 6.8);
        assertEquals(expectedOutput, actualOutput, .10);
    }

    @Test
    public void subtractTwoInts(){
        Calculator calculator = new Calculator();
        int expectedOutput = 25;
        int actualOutput = calculator.subtraction(50, 25);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void subtractTwoDoubles(){
        Calculator calculator = new Calculator();
        double expectedOutput = 3.65;
        double actualOutput = calculator.subtraction(11.77, 8.12);
        assertEquals(expectedOutput, actualOutput, .10);
    }

    @Test
    public void multiplyTwoInts(){
        Calculator calculator = new Calculator();
        int expectedOutput = 33;
        int actualOutput = calculator.multiply(11, 3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void multiplyTwoDoubles(){
        Calculator calculator = new Calculator();
        double expectedOutput = 29.125;
        double actualOutput = calculator.multiply(12.5, 2.33);
        assertEquals(expectedOutput, actualOutput, .10);
    }

    @Test
    public void divideTwoInts(){
        Calculator calculator = new Calculator();
        int expectedOutput = 2;
        int actualOutput = calculator.divide(4, 2);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void divideTwoDoubles(){
        Calculator calculator = new Calculator();
        double expectedOutput = .912621359223;
        double actualOutput = calculator.divide(7.52, 8.24);
        assertEquals(expectedOutput, actualOutput, .10);
    }

}