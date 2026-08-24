import java.util.*;
class Bigg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int s=sc.nextInt();
		int a[]=new int[s];
		int big=0;
		for(int y=0;y<a.length;y++)
		{
			System.out.print("A["+y+"]=");
			a[y]=sc.nextInt();
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>big)
			{
				big=a[x];
			}
		}
		System.out.println("Biggest number is "+big);
	}
}

//import java.util.*;
//class Bigg
//{
//	public static void main(String args[])
//	{	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the elements in the array");
//		int arr[]=new int[5];
//		for(int x=0;x<arr.length;x++)
//		{
//			System.out.print("A"+"["+x+"]= ");
//			arr[x]=sc.nextInt();
//		}
//		for(int y=0;y<arr.length;y++)
//		{
//			System.out.println("A["+y+"]="+arr[y]);
//		}
//	}
//}