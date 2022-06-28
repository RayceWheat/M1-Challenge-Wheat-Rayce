public class ConverterIf implements Converter {

    public String convertMonth(int monthNumber){

        if (monthNumber == 1) {
            System.out.println("January");
            return "January";
        } else if (monthNumber == 2) {
            return "February";
        } else if (monthNumber == 3) {
            return "March";
        } else if (monthNumber == 4) {
            return "April";
        } else if (monthNumber == 5) {
            return "May";
        } else if (monthNumber == 6) {
            return "June";
        } else if (monthNumber == 7) {
            return "July";
        } else if (monthNumber == 8) {
            return "August";
        } else if (monthNumber == 9) {
            return "September";
        } else if (monthNumber == 10) {
            return "October";
        } else if (monthNumber == 11) {
            return "November";
        } else if (monthNumber == 12){
            return "December";
        } else {
            System.out.println("Please enter a number between 1-12");
            return "Error";
        }
    }

    public String convertDay(int dayNumber){

        if (dayNumber == 1) {
            System.out.println("Sunday");
            return "Sunday";
        }
        else if (dayNumber == 2){
            System.out.println("Monday");
            return "Monday";
        }
        else if (dayNumber == 3){
            System.out.println("Tuesday");
            return "Tuesday";
        }
        else if (dayNumber == 4){
            System.out.println("Wednesday");
            return "Wednesday";
        }
        else if (dayNumber == 5){
            System.out.println("Thursday");
            return "Thursday";
        }
        else if (dayNumber == 6){
            System.out.println("Friday");
            return "Friday";
        }
        else if (dayNumber == 7){
            System.out.println("Saturday");
            return "Saturday";
        }
        else {
            System.out.println("Please enter a number between 1-7");
            return "Error";
        }
    }
}
