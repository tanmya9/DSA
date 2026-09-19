@FunctionalInterface
interface A{
    //void show(); //in functional interface we can have only one method
    void show (int i);
}

// class B implements A{  //class not needed when using anonymous in a class
//     public void show()
//     {
//         System.out.println("In Show method");
//     }
// }

public class FunctionalInterfaces {
    //A obj = new A (); //we cannot instantiate interfaces
    public static void main(String args[])
    {   
        //1st method
        // A obj=new B();
        // obj.show();

        //2nd method - without creating B class and creating an object of B
        // we would be using anonymous in a class
        // A obj = new A(){ //instantiating A by defining its own implementation
        //     public void show()
        //     {
        //         System.out.println("In show method");
        //     }
        // };

        // A obj=new A(){
        //     public void show(int i)
        //     {
        //         System.out.println("In show method "+i);
        //     }
        // };
        // obj.show(5);

        //lambda expression
        // A obj = () ->
        // {
        //     System.out.println("in show method");
        // };
        // obj.show();

        //lambda expression
        A obj=(int i) -> {
            System.out.println("In show method "+i);
        };
        obj.show(5);
    }
    
}
