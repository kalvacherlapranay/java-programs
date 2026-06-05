import java.util.Scanner;
class matrix
{
public static void main(String args[])                     
{
      int[][] mat = {{10,20,30},{40,50,60},{70,80,90}};
      for(int i=0;i<3;i++)
      {
      int sum=0;
      for(int j=0;j<3;j++){
      
      sum+=mat[i][j];
      }
      System.out.println(sum);
      }
      }
      }