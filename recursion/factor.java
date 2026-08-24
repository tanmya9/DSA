import java.util.*;
class factor
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=sc.nextInt();
//		System.out.println("Its factors are: ");
//		for(int x=1;x<=n;x++)
//		{
//			if(n%x==0)
//			{
//				System.out.println(+x);
//			}
//			else
//			{
//				System.out.println("No factors");
//			}
//		}
		int x=1;
		int sum=0;
		System.out.println("Its factors are: ");
		while(x<=n)
		{
			if(n%x==0)
			{
				System.out.println(x);
				sum=sum+x;
			}
			x++;
		}
		System.out.println("Sum of its factors are: "+sum);
	}
}