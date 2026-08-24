// Print all occurrences of the key in the array
//class Recursionquest
//{
//	public static void printOccur(int n, int key, int arr[])
//	{
//		if(n==arr.length)
//		{
//			return;
//		}
//		if(arr[n]==key)
//		{
//			System.out.print(n+" ");
//		}
//		printOccur(n+1,key,arr);
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {3,2,4,5,6,2,7,2,2};
//		printOccur(0,2,arr);
//	}
//}

// Print the numbers in words
//class Recursionquest
//{
//	public static void noinWords(String nos[],int n)
//	{
//		if(n==0)
//		{
//			return;
//		}
//		int lastdigit=n%10;
//		noinWords(nos, n/10);
//		System.out.print(nos[lastdigit]+" ");
////		noinWords(nos, n/10); //to print nos in words in reverse 
//
//	}
//	public static void main(String args[])
//	{
//		String nos[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
//		noinWords(nos,952003);
//	}
//}

//Length of a string
//class Recursionquest
//{
//	public static int lengthString(String str)
//	{
//		if(str.length()==0)
//		{
//			return 0;
//		}
//		
//		return lengthString(str.substring(1))+1;
//	}
//	public static void main(String args[])
//	{
//		String str="tanmya";
//		System.out.println(lengthString(str));
//	}
//}

//class Recursionquest
//{
////	public static int length(String str)
////	{
////		if(str.length()==0)
////		{
////			return 0;
////		}
////		return length(str.substring(1))+1;
////	}
//	public static void main(String args[])
//	{
////		String str="tanmyaa";
////		System.out.println(length(str));		
//	}
//}


// count no of contiguous substring starting and ending with same character
class Recursionquest
{
	public static int count(String str, int i, int j, int n)
	{
		if(n==1)
		{
			return 1;
		}
		if(n<=0)
		{
			return 0;
		}
		
		int res=count(str,i+1,j,n-1) + count(str,i,j-1,n-1) - count(str,i+1,j-1,n-2);
		if(str.charAt(i)==str.charAt(j))
		{
			res++;
		}
		return res;
	}
	
	public static void main(String args[])
	{
		String str="abcab";
		int n=str.length();
		System.out.println(count(str,0,n-1,n));
	}
}



