
import java.util.Scanner;
  class Sum
{
    public static void main(String args[])
     {
       int n1,n2,sum;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter first number:");
       n1=sc.nextInt();
       System.out.println("Enter second number:");
       n2=sc.nextInt();
        sc.close();
       sum = n1 + n2;
       System.out.println("Sum is :"+sum);
     }
}