class Counter{
    int count=0;
    public synchronized void increment() //for Thread safety
    {
        count++; //synchronised - making sure only one thread is accessing this at a time
    }
}
public class RaceCondition
{
    public static void main(String args[]) throws InterruptedException
    {
        Counter c=new Counter();
        Runnable obj1= () -> //Since runnable is a functional interface
        {
            for(int i=0; i<1000;i++)
            {
                c.increment();
            }
        }; 
        //we will use anonymous class here 
        Runnable obj2= () -> {
            for(int i=0; i<1000;i++)
            {
                c.increment();
            }
        };
        Thread t1=new Thread(obj1); //create separate thread objects
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

        t1.join(); //join method ensures that main method waits for the t1 and t2 thread to finish execution before proceeding
        t2.join();
        System.out.println(c.count);
    }
}