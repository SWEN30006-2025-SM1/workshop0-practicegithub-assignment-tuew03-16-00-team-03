package example;

public class Calculator {
    public int add(int a, int b) {
        // TODO: Implement this method
        return 4;
    }

    public int minus(int a, int b) {
        // TODO: Implement this method
        return 10;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        if (b == 0){
            System.out.println("divisor can't be zero");
            return 0;
        }
        return (double) a / b;
    }
}
