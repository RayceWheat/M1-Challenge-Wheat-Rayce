public class ConverterSwitch implements Converter{

    public String convertMonth(int monthNumber){
        switch (monthNumber){
            case 1:
                System.out.println("January");
                return "January";
            case 2:
                System.out.println("February");
                return "February";
            case 3:
                System.out.println("March");
                return "March";
            case 4:
                System.out.println("April");
                return "April";
            case 5:
                System.out.println("May");
                return "May";
            case 6:
                System.out.println("June");
                return "June";
            case 7:
                System.out.println("July");
                return "July";
            case 8:
                System.out.println("August");
                return "August";
            case 9:
                System.out.println("September");
                return "September";
            case 10:
                System.out.println("October");
                return "October";
            case 11:
                System.out.println("November");
                return "November";
            case 12:
                System.out.println("December");
                return "December";
            default:
                System.out.println("Please input a number between 1 and 12");
                return "Error";

        }

    }

    public String convertDay(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                return "Sunday";
            case 2:
                System.out.println("Monday");
                return "Monday";
            case 3:
                System.out.println("Tuesday");
                return "Tuesday";
            case 4:
                System.out.println("Wednesday");
                return "Wednesday";
            case 5:
                System.out.println("Thursday");
                return "Thursday";
            case 6:
                System.out.println("Friday");
                return "Friday";
            case 7:
                System.out.println("Saturday");
                return "Saturday";
            default:
                System.out.println("Please input a number between 1 and 6");
                return "Error";

        }
    }
}
