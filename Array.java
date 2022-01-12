import java.util.Scanner;

public class  Array{
 
  public static void main(String[] args)
{
   int []arr=new int [5];
    Scanner sc=new Scanner(System.in);

System.out.println("Enter" + arr.length +"numbers:");
for(int i=0;i<arr.length;i++)
{
  arr[i]=sc.nextInt();
}
   print_array(arr);
}

static void print_array(int [] brr)
   {
        int sum=0;
        for(int i=0;i<brr.length;i++)
      {
         sum=sum+brr[i];
      }
         System.out.println("Sum of brr is:" + sum);
    }
} 
