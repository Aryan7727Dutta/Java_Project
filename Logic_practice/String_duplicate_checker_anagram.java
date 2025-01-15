package Logic_practice;

import java.util.Scanner;

public class String_duplicate_checker_anagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int arr[]=new int[26];
        char x;
        int y=0;
        char z;
        int i;
        for( i = 0;i<a.length();i++)
        {
            x=a.charAt(i);
            arr[x-'a']+=1;
            if (x==a.charAt(y)){
                for(int k= y;k<=i;k++)
                {
                    z=a.charAt(y);
                    if(arr[z-'a']!=1)
                    {
                        y++;
                    }
                }
            }
        }
        if (y==i)
        {
            System.out.printf("null");
        }

    }
}
