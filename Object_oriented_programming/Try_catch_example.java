package Object_oriented_programming;

class Try_catch_example {
    public static void main(String[] args) {

        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}