import java.util.*;
//class Average
//{
//	public static int average(int a,int b, int c)
//	{
//		return (a+b+c)/3;
//	}
//	public static void main(String args[])
//	{
//		Scanner ab=new Scanner(System.in);
//		System.out.println("Enter all the three numbers");
//		int n1=ab.nextInt();
//		int n2=ab.nextInt();
//		int n3=ab.nextInt();
//		int avg=average(n1,n2,n3);
//		System.out.println("Average of the three number is: "+avg);
//	}
//}

//class Average
//{
//	public static boolean isEvenodd(int num)
//	{
//		if(num%2==0)
//		{
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public static void main(String args[])
//	{
//		Scanner ab=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=ab.nextInt();
//		if(isEvenodd(n))
//		{
//			System.out.println("Even");
//		}
//		else
//		{
//			System.out.println("Odd");
//		}
//	}
//}

//class Average
//{
//	public static boolean isPalindrome(int num)
//	{
//		int palindrome=num;
//		int reverse=0;
//		while(palindrome!=0)
//		{
//			int last=palindrome%10;
//			reverse=reverse*10 +last;
//			palindrome=palindrome/10;
//		}
//		if(num==reverse)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
//	public static void main(String args[])
//	{
//		Scanner ab=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=ab.nextInt();
//		if(isPalindrome(n))
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not palindrome");
//		}
//	}
//}

class Average
{
	public static int sumOfDigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=ab.nextInt();	
		int s=sumOfDigits(n);
		System.out.println("Sum of digits is: "+s); //System.out.println("Sum of digits is: "+ sumOfDigits(n); 
	}
}