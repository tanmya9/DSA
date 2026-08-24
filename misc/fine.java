import java.util.*;
class fine
{
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the number of days late");
		int n=ab.nextInt();
		int fine=0;
		if(n>=1&&n<=5)
		{
			fine=n*5;
			System.out.println("Fine is Rs."+fine);
		}
		else if(n>=6&&n<=10)
		{
			fine=5*1+(n-5)*2;
			System.out.println("fine is Rs."+fine);
		}
		else if(n>=11)
		{
			fine=5*1+5*2+(n-10)*5;
			System.out.println("Fine is Rs."+fine);
		}
	}
}