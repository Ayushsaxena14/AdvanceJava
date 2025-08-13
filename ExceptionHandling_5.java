// Usage of finally block in java

import java.util.*;
public class ExceptionHandling_5
{
    public static int greet()
    {
        try
        {
            int a=50;
            int b=10;
            int c=a/b;
            return c;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception occurred");
        }
        finally
        {
            System.out.println("This is the end of the function");
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int k=greet();
        System.out.println(k);

    }
}
