package java8features;

import java.lang.Math;
@FunctionalInterface
interface MathOperation
{
    double calculate(double a,double b);
}
public class Functional_interface_mod_pow_example {
    public static void main(String[] args) {
        MathOperation mod = (x, y) -> x % y;
        MathOperation pow = (x, y) -> Math.pow(x,y);
        double a=10,b=4;
        System.out.println("mod - "+mod.calculate(a,b));
        System.out.println("power - "+pow.calculate(a,b));

    }
}
