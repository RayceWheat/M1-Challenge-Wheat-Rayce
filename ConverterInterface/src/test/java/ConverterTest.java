import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {



    // Tested used for ConverterIf
    @Test
    public void shouldConvertMonthToString(){
        Converter converter = new ConverterIf();
        String expectedOutput = "January";
        String actualOutput = converter.convertMonth(1);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void shouldConvertDayToString(){
        Converter converter = new ConverterIf();
        String expectedOutput = "Sunday";
        String actualOutput = converter.convertDay(1);
        assertEquals(expectedOutput, actualOutput);
    }


    //Tests for Switch statement 
    @Test
    public void shouldConvertMonthNumberToStringSwitch(){
        Converter converter = new ConverterSwitch();
        String expectedOutput = "June";
        String actualOutput = converter.convertMonth(6);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test void shouldConvertDayNumberToStringSwitch(){
        Converter converter = new ConverterSwitch();
    }

}