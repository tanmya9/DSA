@FunctionalInterface 
interface Demo
{
    public int show(int i, int j);
}
public class Lamdareturn {
    public static void main(String args[])
    {
        // Demo obj=new Demo(){
        //     public int show(int i, int j)
        //     {
        //         return i+j;
        //     }
        // };
        // int result= obj.show(5,6);
        // System.out.println("Sum is: "+result);

        Demo obj= (int i, int j) -> {
            return i+j;
        };

        int result=obj.show(5,6);
        System.out.println("Result is "+result);
    }
}
