import java.util.*;
class Fibo1
{
	public static void main(String args[])
	{
		int sum=0;
		int n1=0,n2=1;
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=ab.nextInt();
		System.out.print(n1+",");
		System.out.print(n2);
		for(int i=2;i<=n;i++)
		{
			sum=n1+n2;
			System.out.print(","+sum);
			n1=n2;
			n2=sum;
			
		}
	}
}