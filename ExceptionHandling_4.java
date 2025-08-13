// Exception class and throw & throws keyword concept
//In this how a custom exception can be made by programmer itself is being demonstrated

import java.util.*;
class NegativeradiusException extends Exception
{
    @Override
    public String toString() {
        return "Negative radius can't be used";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative";
    }
}

public class ExceptionHandling_4
{
    public static double area(int r) throws NegativeradiusException
    {
        if(r<0)
        {
            throw new NegativeradiusException();
        }
        double area=Math.PI*r*r;
        return area;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        int r=sc.nextInt();
        try {
            double area=area(r);
        } catch (NegativeradiusException e)
        {
//            System.out.println(e.getMessage());
//            System.out.println(e);
            e.printStackTrace();
        }
    }
}
