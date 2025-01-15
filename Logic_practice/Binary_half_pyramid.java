package Logic_practice;

public class Binary_half_pyramid {
    public static void main(String[] args)
    {
        int x=0;
        for(int i=1;i<=5;i++)
        {   if(i%2==0)
        {
            x=0;
        }else {x=1;}
            for(int j = 0;j<i;j++) {
                System.out.print((x+j)%2);

            }
            System.out.println();
        }

    }
}
