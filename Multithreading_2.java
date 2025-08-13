
// Creating threads by implementing Runnable interface (2nd method of creating threads in java)

class Mythread_1 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<25)
        {
            System.out.println("Thread1 is running");
            i++;
        }
    }
}
class Mythread_2 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<25)
        {
            System.out.println(" Now our Thread2 is running");
            i++;
        }
    }
}
public class Multithreading_2
{
    public static void main(String[] args)
    {
        Mythread_1 bullet1=new Mythread_1();
        Thread gun1=new Thread(bullet1);
        Mythread_2 bullet2=new Mythread_2();
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
