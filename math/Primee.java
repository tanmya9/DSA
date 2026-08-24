import java.util.*;
class Primee
{
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=ab.nextInt();
		boolean isPrime=true;
//		if(n==0||n==1)
//		{
//			System.out.println("Number is not Prime");
//		}
//		else
//		{
			for(int i=2;i<=n-1;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
			{
				System.out.println("Number is Prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		}
	}
		
//}