import java.util.*;
class Fact
{
	public static void main(String args[])
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		for(int x=1;x<=n;x++)
		{
			i=i*x;
		}
		System.out.println("Factorial of a given number is "+i);
	}
}