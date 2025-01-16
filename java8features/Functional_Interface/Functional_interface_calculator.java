package java8features;

@FunctionalInterface
interface IntOperation {
    int apply(int x, int y);
}

public class Functional_interface_calculator {
    public static void main(String[] args) {
        IntOperation add = (x, y) -> x + y;
        IntOperation sub = (x, y) -> x - y;
        IntOperation mult = (x, y) -> x * y;
        IntOperation div=(x, y) -> {
            if (y == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return x / y;
        };
        int a = 10, b = 5;

        System.out.println("Addition: " + add.apply(a, b));
        System.out.println("Subtraction: " + sub.apply(a, b));
        System.out.println("Multiplication: " + mult.apply(a, b));
        System.out.println("Division: " + div.apply(a, b));
    }
}
