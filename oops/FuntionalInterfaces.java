@FunctionalInterface
interface A{
    void show(); //in functional interface we can have only one method
}

// class B implements A{  //class not needed when using anonymous in a class
//     public void show()
//     {
//         System.out.println("In Show method");
//     }
// }

public class FuntionalInterfaces {
    //A obj = new A (); //we cannot instantiate interfaces
    public static void main(String args[])
    {   
        //1st method
        // A obj=new B();
        // obj.show();

        //2nd method - without creating B class and creating an object of B
        // we would be using anonymous in a class
        A obj = new A(){ //instantiating A by defining its own implementation
            public void show()
            {
                System.out.println("In show method");
            }
        };
        obj.show();
    }
    
}
