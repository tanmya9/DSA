//import java.util.*;
//class continuee
//{
//	public static void main(String args[])
//	{
//		Scanner ab=new Scanner(System.in);
//		System.out.println("Start entering numbers");
//		while(true)
//		{
//			int n=ab.nextInt();
//			if(n%10==0)
//			{
////				System.out.println("Enter the next number");
//				continue;
//			}
//			System.out.println(n);
//		}
//	}
//}

import java.util.*;
class continuee
{
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Start entering numbers");
		do
		{
			int n=ab.nextInt();
			if(n%10==0)
			{
				System.out.println("Enter the next number");
				continue;
			}
			System.out.println(n);
		}while(true);
	}
}
