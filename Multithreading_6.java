
// Practise problems on multithreading concept

class thread1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Good morning");
            i++;
        }
    }
}
class thread2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("Welcome");
            i++;
        }
    }
}

public class Multithreading_6
{
    public static void main(String[] args)
    {
       thread1 t1=new thread1();
       thread2 t2=new thread2();
        try {
            t2.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t1.setPriority(7);
        t2.setPriority(4);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
//        System.out.println(t2.getState());
//        t1.start();
        t2.start();
        t1.start();
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getPriority());
    }
}
