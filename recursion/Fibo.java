import java.util.*;
class Fibo
{
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=ab.nextInt();
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+",");
		System.out.print(n2);
		for(int x=2;x<=n;x++)
		{
			sum=n1+n2;
			System.out.print(","+sum);
			n1=n2;
			n2=sum;
//			System.out.print(","+sum);
		}
	}
}