
// Concept of try catch in java

import java.util.*;
public class ExceptionHandling_1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=5000;
        int b=sc.nextInt();
        int c=0;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("Arithmetic exception occured");
        }

    }
}
