package Logic_practice;

import java.util.Arrays;

public class Highest_frequency_charecter_checker {
    public static void main(String[] args)
    {
        String a = "Shah Rukh khan";
       String[] arr = a.split(" "); // Splits based on the comma


        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            if(i!=(arr.length-1) )
            {
                System.out.print(arr[i].charAt(0)+".");

            }
            else
            {

                System.out.print(arr[i]);
            }
        }
    }
}
