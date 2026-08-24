import java.util.*;
class breakk
{
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Start entering numbers and the loop will end when a multiple of 10 is encountered");
		while(true)
		{
			int n=ab.nextInt();
			if(n%10==0)
			{
				System.out.println("You entered a number which is a multiple of 10");
				break;
			}
			System.out.println(n);
		}
	}
	
}

//import java.util.*;
//class breakk
//{
//	public static void main(String args[])
//	{
//		Scanner ab=new Scanner(System.in);
//		{
//			System.out.println("Start entering numbers: ");
//			do {
//				int n=ab.nextInt();
//				if(n%10==0)
//				{
//					System.out.println("You entered a number multiple of 10");
//					break;
//				}
//				System.out.println(n);
//			}while(true);
//		}
//	}
//}