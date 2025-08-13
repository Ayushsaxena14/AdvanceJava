
//Nested try catch block concept

import java.util.Scanner;

public class ExceptionHandling_3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[3];
        marks[0]=96;
        marks[1]=95;
        marks[2]=85;
        boolean flag=true;
        while(flag)
        {
            System.out.println("Enter the index");
            int ind=sc.nextInt();
            try
            {
                System.out.println("This is upper try");
                try
                {
                    System.out.println(marks[ind]);
                    flag=false;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Sorry this index doesnot exist in the array");
                    System.out.println("Exception in level 2");
                }
            }
            catch(Exception e)
            {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("This is the end of the program");
    }
}
