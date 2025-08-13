
// Handling specific exceptions in different catch blocks

import java.util.Scanner;

public class ExceptionHandling_2
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int marks[]=new int[3];
       marks[0]=95;
       marks[1]=90;
       marks[2]=85;
       System.out.println("Enter the index");
       int ind=sc.nextInt();
       System.out.println("Enter the divisor");
       int div=sc.nextInt();
       try
       {
           System.out.println("The value at index "+ind+" is : "+marks[ind]);
           System.out.println("The value after dividing is : "+marks[ind]/div);
       }
       catch(ArithmeticException e)
       {
           System.out.println("Arithmetic exception occurred");
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.println("Array Index out of bound exception occurred");
       }
       catch(Exception e)
       {
           System.out.println("Some other exception occurred");
       }
    }
}
