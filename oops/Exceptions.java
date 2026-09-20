public class Exceptions {
    public static void main(String args[])
    {
        int i=18;
        int j=18;
        int nums[]=new int[5];
        String str=null;
        try{
            // j=i/j; //risky statements should be in try block
            // System.out.println(nums[6]);
            System.out.println(str.length());
        }
        catch(ArrayIndexOutOfBoundsException e) //to handle array exception
        {
            System.out.println("Please enter nos that are within the limits");
        }
        catch(ArithmeticException e){ //error is thrown as an object and Exception here is a class
            System.out.println("Something went wrong ");
        }
        catch(NullPointerException e){ //to handle string exception
            System.out.println("Cannot print length of a null string");
        }
    }    
}
