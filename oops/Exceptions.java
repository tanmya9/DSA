public class Exceptions {
    public static void main(String args[])
    {
        int i=18;
        int j=0;
        try{
            j=i/j; //risky statements should be in try block
        }
        catch(Exception e){ //error is thrown as an object and Exception here is a class
            System.out.println("Something went wrong");
        }
        System.out.println("Result is "+j);
    }    
}
