//class Reverse
//{
//	public static void main(String args[])
//	{
//		int num=10899;
//		int i=0;
//		int reverse;
//		while(num>0)
//		{
//			reverse=num%10;
//			System.out.print(reverse);
//			num=num/10;
//		}
////		System.out.println();
//	}
//}

import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		int rev=0;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=ab.nextInt();
		while(n>0)
		{
			int i=n%10;
			rev=(rev*10)+i;
			n=n/10;
		}
		System.out.println("Reversed number is "+rev);
	}
}