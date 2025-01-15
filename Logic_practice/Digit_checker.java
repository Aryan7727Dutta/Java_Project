package Logic_practice;

import java.lang.Math;
import java.util.Scanner;

public class Digit_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x;
        int len = 0;
        while(n>=1)
        {
            n=n/10;
            len++;
        }
        int y=len;
        System.out.println(x / (int)Math.pow(10, len - 1));

        if(x/Math.pow(10,(y-1))==0) {
            System.out.println("not pushpa");
            return;
        }
        n=x;
        for(int i = 1;i<len;i++)
        {
            if(n%10==0)
            {
                System.out.println("pushpa");
                return;
            }
            n=n/10;

            System.out.println(n);
        }
        System.out.println("not pushpaaa");
    }
}
