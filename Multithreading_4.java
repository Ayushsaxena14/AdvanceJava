// Java Thread methods

class thrd1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Yeh thread 1 h");
            i++;
        }
    }
}
class thrd2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("thread 2");
            i++;
        }
    }
}

public class Multithreading_4
{
    public static void main(String[] args)
    {
        thrd1 t1=new thrd1();
        thrd2 t2=new thrd2();
        t2.start();
        try
        {
            t2.join();                 // Join method is used when we want to run a thread continously without the interruption of other thread i.e here thread 2 will be runned until it gets executed completely
        }
        catch(Exception e)
        {
            System.out.println("Exception found");
        }
        t1.start();
    }
}
