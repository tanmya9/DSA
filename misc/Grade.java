import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of the student");
		int m=sc.nextInt();
		if(m>100)
		{
			System.out.println("Wrong input");
		}
		else if(m<=100&&m>=90)
		{
			System.out.println("Grade A");
		}
		else if(m<90&&m>=80)
		{
			System.out.println("Grade B");
		}
		else if(m<80&&m>=70)
		{
			System.out.println("Grade C");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}