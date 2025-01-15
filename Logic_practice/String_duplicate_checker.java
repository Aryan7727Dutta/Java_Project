package Logic_practice;

import java.util.Scanner;

public class String_duplicate_checker {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int arr[]=new int[26];
        char x;
        for(int i = 0;i<a.length();i++)
        {
            x=a.charAt(i);
            arr[x-'a']+=1;
            if(arr[x-'a']==2)
            {
                System.out.println(x);
                return;
            }
        }
        System.out.println("distinct");
    }
}
