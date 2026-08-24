//import java.util.*;
//class twoDArray
//{
//	public static void main(String args[])
//	{
//		Scanner ab=new Scanner(System.in);
//		int arr[][]=new int[3][4];
//		System.out.println("Enter the elements");
//		for(int x=0;x<3;x++)
//		{
//			for(int y=0;y<4;y++)
//			{
//				arr[x][y]=ab.nextInt();
//			}
//		}
//		
//		for(int x=0;x<3;x++)
//		{
//			for(int y=0;y<4;y++)
//			{
//				System.out.print(arr[x][y]+" ");
//			}
//			System.out.println();
//		}
//	}
//}

import java.util.*;
class twoDArray
{
	public static boolean search(int num[][],int key)
	{
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<4;y++)
			{
				if(num[x][y]==key)
				{
					System.out.println("Found at ("+x+", "+y+")");
					return true;
				}
			}
		}
		System.out.println("Not found");
		return false;
	}
	
	public static void main(String args[])
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter the elements");
		int num[][]=new int[3][4];
		
		for(int x=0;x<3;x++)
		{
			for(int y=0;y<4;y++)
			{
				num[x][y]=ab.nextInt();
			}
		}
		System.out.println("Enter the key ");
		int key=ab.nextInt();
		search(num,key);

		for(int x=0;x<3;x++)
		{
			for(int y=0;y<4;y++)
			{
				System.out.print(num[x][y]+" ");
			}
			System.out.println();
		}	
	}
}