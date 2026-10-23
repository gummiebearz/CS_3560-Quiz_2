public class Calculator {
    public int sum(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if(y == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return x / y;
    }

    public boolean isEven(int value) {
        if(value < 0) {
            value *= -1;
        }

        return value % 2 == 0;
    }
}
