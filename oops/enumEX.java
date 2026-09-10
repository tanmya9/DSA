enum Status
{
    Running, Success, Pending, Failed;
}
public class enumEX
{
    public static void main(String args[])
    {
        Status status=Status.Pending;

        switch(status)
        {
            case Running:
                System.out.println("In Progress");
                break;
            
            case Pending:
                System.out.println("Please wait");
                break;
        }

        // if(status == Status.Running)
        // {
        //     System.out.println("In Progress");
        // }
        // else if(status == Status.Success)
        // {
        //     System.out.println("All Done");
        // }
        // else if(status == Status.Pending)
        // {
        //     System.out.println("Please wait");
        // }
        // else
        // {
        //     System.out.println("Please try again");
        // }
    }
}





// enum Status
// {
//     Running, Fixed, Pending, Failed;
// }

// public class enumEX
// {
//     public static void main(String args[])
//     {
//         // Status s=Status.Running;
//         // Status s1=Status.Fixed;
//         // Status s2=Status.Failed;
//         // System.out.println(s);
//         // System.out.println(s1);
//         // System.out.println(s2);

//         // Status s=Status.Running;
//         // System.out.println(s);
//         // System.out.println(s.ordinal()); //returns index of the constant

//         Status s[]=Status.values();
//         for(Status i : s)
//         {
//             System.out.println(i+ " at index "+i.ordinal());
//         }
        
//     }
// }