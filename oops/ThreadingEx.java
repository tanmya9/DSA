class X extends Thread{
    public void run()
    {
        for(int i=0; i<100;i++)
        {
            System.out.println("In thread A");
            try{
                Thread.sleep(100); //thread will wait for 10 milisecs after printing each thread
            }
            catch(InterruptedException e)
            {
                // e.printStackTrace();
                System.out.println("Thread Interrupted "+e.getMessage());
            }
        }
    }
}

class Y extends Thread{
    public void run(){
        for(int i=0;i<100;i++)
        {
            System.out.println("In thread B");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println("Sleep interrupted "+e.getMessage());
            }
        }
    }
}
public class ThreadingEx
{
    public static void main(String args[])
    {
        X obj1=new X();
        Y obj2=new Y();
        System.out.println(obj1.getPriority()); //to get the priority of the thread
        obj2.setPriority(Thread.MAX_PRIORITY); //suggesting scheduler to give this thread the max priority

        obj1.start();
        obj2.start();
    }
}