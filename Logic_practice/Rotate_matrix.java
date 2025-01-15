package Logic_practice;

public class Rotate_matrix {
    public static void main(String[] args) {
      int a[][]={{2,1,6,2,5},{8,1,3,4,9},{3,3,3,3,3}};


      for(int i=0;i<a.length;i++){
          for (int j=0;j<a[i].length;j++)
          {
              System.out.print(a[i][j]);
          }
          System.out.println();
      }
}}
