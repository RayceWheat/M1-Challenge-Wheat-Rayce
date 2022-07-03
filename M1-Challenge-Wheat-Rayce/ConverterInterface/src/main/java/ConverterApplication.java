public class ConverterApplication {

    public static void main(String[] args) {
        Converter converter = new ConverterIf();

        converter.convertDay(1);

        converter.convertDay(5);

        converter.convertDay(7);

        converter.convertMonth(2);

        converter.convertMonth(12);


        converter = new ConverterSwitch();

        converter.convertDay(12);

        converter.convertDay(1);

        converter.convertMonth(2);

        converter.convertMonth(-10);


    }

}
