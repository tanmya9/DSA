import java.util.*;
class Factorial
{
	static void fact()  //void-if no return type is there
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int f=1;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial is "+f);
	}
	public static void main(String args[])
	{
		Factorial ob=new Factorial();
		ob.fact();
	}	
}

//import java.util.*;
//class Factorial
//{
//	public int fact()
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any number");
//		int f=1;
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			f=f*i;
//		}
//		return f;
//	}
//	public static void main(String args[])
//	{
//		Factorial ob=new Factorial();
//		int s=ob.fact();
//		System.out.println("Factorial is "+s);
//	}
//}

//import java.util.*;
//class Factorial
//{
//	static void fact(int n)  //void-if no return type is there
//	{
//		int f=1;
//		for(int i=1;i<=n;i++)
//		{
//			f=f*i;
//		}
//		System.out.println("Factorial is "+f);
//	}
//	public static void main(String args[])
//	{
//		Factorial ob=new Factorial();
//		ob.fact(4);
//	}
//}