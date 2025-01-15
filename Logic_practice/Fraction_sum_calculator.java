package Logic_practice;

import java.util.Scanner;

public class Fraction_sum_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator and denominator of the first fraction:");
        int num1 = scanner.nextInt();
        int den1 = scanner.nextInt();
        System.out.println("Enter the numerator and denominator of the second fraction:");
        int num2 = scanner.nextInt();
        int den2 = scanner.nextInt();
        if (den1 == 0 || den2 == 0) {
            System.out.println("Denominator cannot be zero.");
        } else {
            int numerator = (num1 * den2) + (num2 * den1);
            int denominator = den1 * den2;
            int gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
            System.out.println("The sum of the fractions is: " + numerator + "/" + denominator);
        }
        scanner.close();
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
