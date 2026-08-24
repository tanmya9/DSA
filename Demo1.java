package Inheritance;  

public class Demo1 {
    public static void main(String args[])
    {
        AdvCalc obj1=new AdvCalc();
        int res1= obj1.add(4,5);
        int res2= obj1.sub(4,5);
        int res3= obj1.mult(4,5);
        int res4= obj1.div(4,5);
        System.out.println(res1 + " "+res2+ " "+res3+"   "+res4);

    }
}
