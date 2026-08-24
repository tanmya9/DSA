import java.util.*;
class Largest2D
{
	public static void largest(int arr[][])
	{
		int largest=Integer.MIN_VALUE;
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<3;y++)
			{
				if(arr[x][y]>largest)
				{
					largest=arr[x][y];
				}
			}
		}
		System.out.println("Largest is "+largest);
	}
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the elements");
		int arr[][]=new int[3][3];
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<3;y++)
			{
				arr[x][y]=ab.nextInt();			
			}
		}
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<3;y++)
			{
				System.out.print(arr[x][y]+" ");
			}
			System.out.println();
		}
		largest(arr);
	}
}