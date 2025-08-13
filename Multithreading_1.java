

// Creating threads by extending thread class (1st Method of creating thread in java)


import java.util.*;
class Mythread1 extends Thread     // Creating thread 1
{
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Thread 1 is running");
            i++;
        }

    }
}
class Mythread2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Now thread 2 is running");
            i++;
        }
    }
}

public class Multithreading_1
{
    public static void main(String[] args)
    {
       Mythread1 t1=new Mythread1();
       Mythread2 t2=new Mythread2();
       t1.start();                    // Starting the thread 1
       t2.start();                    // Starting the thread 2
    }
}
