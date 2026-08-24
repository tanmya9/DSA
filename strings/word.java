package strings;
import java.util.*;
class word
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any alphabet from a to d: ");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case 'A':
			case 'a':
			System.out.println("Apple");
			break;
			case 'B':
			case 'b':
			System.out.println("Ball");
			break;
			case 'C':
			case 'c':
			System.out.println("Cat");
			break;
			case 'D':
			case 'd':
			System.out.println("Dog");
			break;
			default:
			System.out.println("Input out of range");
		}
	}
}