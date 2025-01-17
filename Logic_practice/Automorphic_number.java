package Logic_practice;

import java.util.Scanner;
import java.lang.Math;
public class Automorphic_number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Double x=0.0;
        System.out.println("Enter number : ");
        x= sc.nextDouble();
        Double y=Math.pow(x,2);
        System.out.println(y);
        double a = x;
        int b=0;
        while(a>=1)
        {
            a/=10;
            b++;
        }
        a=y%Math.pow(10,b);
        System.out.println(a);
        if(a==x)
        {
            System.out.println("Automorphic");
        }
        else
        {
            System.out.println("Not Automorphic");
        }
    }
}
