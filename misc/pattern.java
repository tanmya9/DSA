import java.util.*;
class pattern
{
	public static void main(String args[])
	{
//		for(int x=1;x<=5;x++)
//		{
//			for(int y=1;y<=6-x;y++)
//			{
//				System.out.print(x);
//			}
//			System.out.println(" ");
//		}
//		for(int x=1;x<=3;x++)
//		{
//			for(int y=1;y<=5;y++)
//			{
//				System.out.print(y);
//			}
//			System.out.println();
//		}
//		for(int x=5;x<=7;x++)
//		{
//			for(int y=1;y<=4;y++)
//			{
//				System.out.print(x);
//			}
//			System.out.println();
//		}
//		for(int x=9;x>=5;x-=2)
//		{
//			for(int y=1;y<=4;y++)
//			{
//				System.out.print(x);
//			}
//			System.out.println();
//		}
//		for(int x=7;x>=5;x--)
//		{
//			for(int y=9;y>=x;y--)
//			{
//				System.out.print(y);
//			}
//			System.out.println();
//		}
//		for(int x=3;x<=6;x++)
//		{
//			for(int y=x;y>=2;y--)
//			{
//				System.out.print(y);
//			}
//			System.out.println();
//		}
//		for(int x=5;x>=1;x--)
//		{
//			for(int y=x;y<=5;y++)
//			{
//				System.out.print(y);
//			}
//			System.out.println();
//		}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any number to check whether it is a special no or not");
//		int n=sc.nextInt();
//		int sum=0;
////		int f=1;
//		int t=n; //temp variable is necessary here in the end 'n' will have a different value and it can't be compared with 'sum' to check the condition
//		while(t!=0)
//		{		
//			int f=1;  //f will be initialized inside while loop because after each iteration the value of factorial will be calculated from 1
//			int d=t%10;
//			for(int x=1;x<=d;x++)
//			{
//				f=f*x;
//			}
//			sum=sum+f;
//			t=t/10;
//		}
//		if(sum==n)
//		{
//			System.out.println("It is a special number");
//		}
//		else
//		{
//			System.out.println("It is not a special number");
//		}
//		for(int x=3;x<=6;x++)
//		{
//			for(int y=3;y<=x+1;y++)
//			{
//				System.out.print(x);
//			}
//			System.out.println();
//		}
//		for(int x=5;x<=8;x++)
//		{
//			for(int y=5;y<=x+2;y++)
//			{
//				System.out.print(x);
//			}
//			System.out.println();
//		}
//		for(int x=9;x>=6;x--)
//		{
//			for(int y=1;y<=x-3;y++)
//			{
//				System.out.print(x);
//			}
//			System.out.println();
//		}
//		for(int x=1;x<=5;x++)
//		{
//			for(int y=1;y<=x;y++)
//			{
//				System.out.print(y);
//			}
//			System.out.println();
//		}
//		for (int x=1;x<=5;x++)
//		{
//			for(int y=5;y>=x;y--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		char ch='A';
		for(int x=1;x<=4;x++)
		{
			for(int y=1;y<=x;y++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
	}
}