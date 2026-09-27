class TanmyaException extends Exception
{
    public TanmyaException(String str){
        super(str);
    }   
}
public class Exceptions {
    public static void main(String args[])
    {
        // int i=18;
        // int j=18;
        // int nums[]=new int[5];
        // String str=null;
        // try{
        //     // j=i/j; //risky statements should be in try block
        //     // System.out.println(nums[6]);
        //     System.out.println(str.length());
        // }
        // catch(ArrayIndexOutOfBoundsException e) //to handle array exception
        // {
        //     System.out.println("Please enter nos that are within the limits");
        // }
        // catch(ArithmeticException e){ //error is thrown as an object and Exception here is a class
        //     System.out.println("Something went wrong ");
        // }
        // catch(NullPointerException e){ //to handle string exception
        //     System.out.println("Cannot print length of a null string");
        // }


        // int i=20;
        // // int i=0;
        // int j=0;
        // try{
        //     j=18/i; //in case of i=20, catch block will not be called, so we throw an exception
        //     if(j==0)
        //         throw new ArithmeticException();
        // } 
        // catch(ArithmeticException e)
        // {
        //     // j=18/1; 
        //     System.out.println("That's the default output");
        // }
        // System.out.println("Result is "+j);

        
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new TanmyaException("I want to print my own exception");
            }
        }
        catch(TanmyaException e)
        {
            System.out.println("That's the default output");
        }
    }    
}
