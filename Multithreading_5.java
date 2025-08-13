
// Java thread priority

class thrd extends Thread
{
    public thrd(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<500)
        {
            System.out.println("This is "+this.getName()+" thread");
            i++;
        }
    }
}

public class Multithreading_5
{
    public static void main(String[] args)
    {
        thrd t1=new thrd("Thread1");
        thrd t2=new thrd("Thread2");
        thrd t3=new thrd("Thread3 (less)");
        thrd t4=new thrd("Thread4");
        thrd t5=new thrd("Thread5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
