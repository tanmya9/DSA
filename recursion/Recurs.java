//Printing increasing and decreasing nos
//class Recurs
//{
////	public static void printDec(int n)
////	{
////		if(n==1)
////		{
////			System.out.print(1);
////			return;
////		}
////		System.out.print(n+" ");
////		printDec(n-1);
////	}
//	public static void printInc(int n)
//	{
//		if(n==1)
//		{
//			System.out.print(1+" ");
//			return;
//		}
//		printInc(n-1);
//		System.out.print(n+" ");
//		
//	}
//	public static void main(String args[])
//	{
//		int n=10;
//		printInc(n);
//	}
//}


//Printing factorial nos
//class Recurs
//{
//	public static int printFact(int n)
//	{
//		if(n==0)
//		{
//			return 1;
//		}
//		int fact=n*printFact(n-1);
//		return fact;
//	}
//	public static void main(String args[])
//	{
//		int n=5;
//		System.out.println(printFact(n));	
//	}
//}


//Sum of n natural nos
//class Recurs
//{
//	public static int printSum(int n)
//	{
//		if(n==1)
//		{
//			return 1;
//		}
//		int sum=n+printSum(n-1);
//		return sum;
//	}
//	public static void main(String args[])
//	{
//		int n=10;
//		System.out.println(printSum(n));
//	}
//}


//Print nth fibonacci
//class Recurs
//{
//	public static int printFib(int n)
//	{
//		if(n==1||n==0)
//		{
//			return n;
//		}
//		int nth=printFib(n-1)+printFib(n-2);
//		return nth;
//	}
//	public static void main(String args[])
//	{
//		int n=7;
//		System.out.println(printFib(n));
//	}
//}


//Check if array is sorted or not
//class Recurs
//{
//	public static boolean isSorted(int arr[],int i)
//	{
//		if(i==arr.length-1)
//		{
//			return true;
//		}
//		if(arr[i]>arr[i+1])
//		{
//			return false;
//		}
//		return isSorted(arr, i+1);
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {1,2,7,4,5};
//		System.out.println(isSorted(arr,0));
//	}
//}


//First Occurence
//class Recurs
//{
//	public static int firstOccur(int arr[],int key,int i)
//	{
//		if(i==arr.length-1)
//		{
//			return -1;
//		}
//		if(arr[i]==key)
//		{
//			return i;
//		}
//		return firstOccur(arr,key,i+1);
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {2,6,3,1,5,7,8,5,0};
//		System.out.println(firstOccur(arr,6,0));
//	}
//}

//Last occurence
//class Recurs
//{
//	public static int lastOccur(int arr[],int key, int i)
//	{
//		if(i==arr.length)
//		{
//			return -1;
//		}
//		int isFound=lastOccur(arr,key,i+1);
//		if(isFound==-1 && arr[i]==key)
//		{
//			return i;
//		}
//		return isFound;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {1,2,3,4,1,0};
//		System.out.println(lastOccur(arr,1,0));
//	}
//}

//class Recurs
//{
//	public static int lastOccur(int arr[],int key,int i)
//	{
//		if(i==arr.length)
//		{
//			return -1;
//		}
//		int isFound=lastOccur(arr,key,i+1);
//		if(arr[i]==key && isFound==-1)
//		{
//			return i;
//		}
//		return isFound;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {2,3,4,1,0,1};
//		System.out.println(lastOccur(arr,1,0));
//	}
//}

//x to the power n
//class Recurs
//{
//	public static int power(int x, int n)
//	{
//		if(n==0)
//		{
//			return 1;
//		}
//		return x*power(x,n-1);
//	}
//	public static void main(String args)
//	{
//		System.out.println(power(2,5));
//	}
//}


//Optimised
class Recurs
{
	public static int optimisedPower(int a, int n)
	{
		if(n==0)
		{
			return 1;
		}
//		int power=optimisedPower(a,n/2)*optimisedPower(a,n/2);
		
		int halfpower=optimisedPower(a,n/2);
		int halfpowersq=halfpower*halfpower;
		if(n%2!=0)
		{
			return a*halfpowersq;
		}
		return halfpowersq;
	}
	public static void main(String args[])
	{
		int a=2;
		int n=5;
		System.out.println(optimisedPower(a,n));
	}
}


