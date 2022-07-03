public class Calculator {

    // addition, subtraction, multipltaction divison
    // two ints
    // two doubles

    public int add(int a, int b){
        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);

        return a + b;
    }

    public double add(double a, double b){
        double sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);

        return a + b;
    }

    public int subtraction(int a, int b){
        int difference = a - b;

        System.out.println(a + " - " + b + " = " + difference);

        return difference;
    }

    public double subtraction(double a, double b){
        double difference = a - b;

        System.out.println(a + " - " + b + " = " + difference);

        return difference;
    }

    public int multiply(int a, int b){
        int product = a * b;

        System.out.println(a + " * " + b + " = " + product);

        return product;
    }

    public double multiply(double a, double b){
        double product = a * b;

        System.out.println(a + " * " + b + " = " + product);

        return product;
    }

    public int divide(int a, int b){
        int quotient = a / b;

        System.out.println(a + " / " + b + " = " + quotient);

        return quotient;
    }

    public double divide(double a, double b){
        double quotient = a / b;

        System.out.println(a + " / " + b + " = " + quotient);

        return quotient;
    }



}
