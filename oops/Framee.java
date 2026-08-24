import java.util.*;
class Framee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any year");
		int y=sc.nextInt();
		if(y%100==0)
		{
			if(y%400==0)
			{
				System.out.println("Leap");
			}
			else
			{
				System.out.println("Not Leap");
			}
		}
		else
		{
			if(y%4==0)
			{
				System.out.println("Leap");	
			}
			else
			{
				System.out.println("Not Leap");
			}
		}
	}
}