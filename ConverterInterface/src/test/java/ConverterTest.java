import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {


    @Test
    public void shouldConvertMonthToString(){
        ConverterIf converter = new ConverterIf();
        String expectedOutput = "January";
        String actualOutput = converter.convertMonth(1);
        assertEquals(expectedOutput, actualOutput);
    }

}