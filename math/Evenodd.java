import java.util.*;
class Evenodd
{
	public static void main(String args[])
	{
		int evensum=0;
		int oddsum=0;
		int choice;
		Scanner ab=new Scanner(System.in);
		do{
			System.out.println("Enter the number ");
			int n=ab.nextInt();
			if(n%2==0)
			{
				evensum+=n;
			}
			else {
			oddsum+=n;
			}
			System.out.println("Do you want to continue: 1 for YES and 0 for NO");
			choice=ab.nextInt();
		}while(choice==1);
		
		System.out.println("Sum for even numbers is "+evensum);
		System.out.println("Sum for odd number is "+oddsum);
	}
}

