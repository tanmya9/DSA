// class X implements Runnable{
//     public void run()
//     {
//         for(int i=0; i<5;i++)
//         {
//             System.out.println("In thread A");
//             try{
//                 Thread.sleep(10); //thread will wait for 10 milisecs after printing each thread
//             }
//             catch(InterruptedException e)
//             {
//                 // e.printStackTrace();
//                 System.out.println("Thread Interrupted "+e.getMessage());
//             }
//         }
//     }
// }

// class Y implements Runnable{
//     public void run(){
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("In thread B");
//             try{
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e)
//             {
//                 System.out.println("Sleep interrupted "+e.getMessage());
//             }
//         }
//     }
// }
// public class RunnableVsThread
// {
//     public static void main(String args[])
//     {
//         Runnable obj1=new X(); //we will use reference of an interface and object of a class
//         Runnable obj2=new Y();

//         Thread t1=new Thread(obj1); //create separate thread objects
//         Thread t2=new Thread(obj2);
//         t1.start();
//         t2.start();

//         // obj1.start(); //start method will not work in runnable interface because it is a part of Thread class 
//         // obj2.start();
//     }
// }


//If we want to use lambda expression

public class RunnableVsThread
{
    public static void main(String args[])
    {
        Runnable obj1= () -> //Since runnable is a functional interface
        {
            for(int i=0; i<5;i++)
            {
                System.out.println("In thread A");
                try{
                    Thread.sleep(10); //thread will wait for 10 milisecs after printing each thread
                }
                catch(InterruptedException e)
                {
                    // e.printStackTrace();
                    System.out.println("Thread Interrupted "+e.getMessage());
                }
            }
        }; 
        //we will use anonymous class here 
        Runnable obj2= () -> {
            for(int i=0; i<5;i++)
            {
                    System.out.println("In thread B");
                    try{
                        Thread.sleep(10); //thread will wait for 10 milisecs after printing each thread
                    }
                    catch(InterruptedException e)
                    {
                        // e.printStackTrace();
                        System.out.println("Thread Interrupted "+e.getMessage());
                    }
            }
        };
        Thread t1=new Thread(obj1); //create separate thread objects
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}