

//Constructors in thread class

class Mythrd extends Thread
{
    public Mythrd(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("Thread 1");
    }

}
class Mythrdrunnable implements Runnable
{
    public void run()
    {
        System.out.println("This is thread 2");
    }
}


public class Multithreading_3
{
    public static void main(String[] args)
    {
        Mythrd t1=new Mythrd("Ayush");
        Mythrdrunnable runnable=new Mythrdrunnable();
        Thread t2=new Thread(runnable,"Saxena");
        t1.start();
        t2.start();
        System.out.println("Thread 1 name is : "+t1.getName());
        System.out.println("Thread 2 name is : "+t2.getName());
    }
}
