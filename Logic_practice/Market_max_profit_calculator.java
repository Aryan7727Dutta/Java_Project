package Logic_practice;

public class Market_max_profit_calculator {
    public static void main(String[] args)
    {
        int prof = 0;
        int buy = 0;
        int min;
        int arr[] = {200,100,50,200,150,300,1,0,500};
        min = arr[0];
        int x = arr.length;
        for(int i = 1;i<x-1;i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            } else if (arr[i]>min && arr[i+1]<arr[i])
            {
                buy = buy +min;
                prof += arr[i]-min;
                min =arr[i+1];

            }
        }
        System.out.println(prof+"  "+ min);
        if (arr[x-1]>arr[x-2] && arr[x-1]>min)
        {
            buy = buy +min;
            prof =prof+( arr[x-1]-min);
        }
        System.out.println(buy);

        System.out.print(prof);
    }
}
