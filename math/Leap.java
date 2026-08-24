import java.util.*;
class Leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any year");
		int y=sc.nextInt();
		if(y%100==0)
		{
			if(y%400==0)
			{
				System.out.println("Leap Year");
			}
			else
			{
				System.out.println("Not a leap year");
			}
		}
		else
		{
			if(y%4==0)
			{
				System.out.println("Leap year");
			}
			else
			{
				System.out.println("Not a leap year");
			}
		}
	}
}