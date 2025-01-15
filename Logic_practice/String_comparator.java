package Logic_practice;

import java.util.Scanner;

public class String_comparator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.length()!=b.length())
        {
            System.out.println("invalid");
            return;
        }
        int arr[]=new int[26];
        char x;
        for(int i = 0;i<a.length();i++)
        {
            x=a.charAt(i);
            arr[x-'a']+=1;
        }
        for(int i = 0;i<a.length();i++)
        {
            x=b.charAt(i);
            arr[x-'a']-=1;
        }
        int i=0;
        for( i = 0;i<arr.length;i++)
        {
            if (arr[i]!=0){
                System.out.println("not same");
                return ;
            }
        }
        System.out.println("same");

    }
}
