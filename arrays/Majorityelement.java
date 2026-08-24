//Brute Force
//class Majorityelement
//{
//	public static int checkMajority(int arr[])
//	{
//		int n=arr.length;
//		for(int x=0;x<arr.length;x++)
//		{
//			int freq=0;
//			for(int y=0;y<arr.length;y++)
//			{
//				if(arr[y]==arr[x])
//				{
//					freq++;
//				}
//			}
//			if(freq >n/2)
//			{
//				return arr[x];
//			}
//		}
//		return -1;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {1,2,2,2,2,1,1,1,2};
//		System.out.println(checkMajority(arr));
//	}
//}


//Optimised

//import java.util.Arrays;
//
//class Majorityelement
//{
//	public static int checkMajority(int arr[])
//	{
//		Arrays.sort(arr);
//		
//		int n=arr.length;
//		int freq=1;
//		int ans=arr[0]; //assuming current element is the majority element
//		for(int x=1;x<arr.length;x++)
//		{
//			if(arr[x]==arr[x-1])
//			{
//				freq++;
//			}
//			else
//			{
//				freq=1;
//				ans=arr[x];
//			}
//			if(freq > n/2)
//			{
//				return ans;
//			}
//		}
//		return -1;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {1,2,2,2,2,2,1,1};
//		System.out.println(checkMajority(arr));
//	}
//}


//divide and conquer approach
class Majorityelement
{
	public static int checkMajority(int arr[], int si, int ei)
	{
		if(si==ei)
		{
			return arr[si];
		}
		int mid=si+(ei-si)/2;
		
		int left=checkMajority(arr,si,mid); //checks majority element from left 
		int right=checkMajority(arr,mid+1,ei);//checks majority element from right
		
		if(left==right) //if element is same from both sides
		{
			return left;
		}
		else //count no of time element occurred in left and right side
		{
			int leftCount=countinRange(arr,left,si,ei);
			int rightCount=countinRange(arr,right,si,ei);
			return leftCount>rightCount?left:right;
		}
	}
	public static int countinRange(int arr[], int num, int si, int ei)
	{
		int freq=0;
		for(int x=si;x<=ei;x++) //combine check
		{
			if(arr[x]==num)
			{
				freq++;
			}
		}
		return freq;
		
	}
	public static void main(String args[])
	{
		int arr[]= {1,1,2,2,2,2,1,1};
		System.out.println(checkMajority(arr,0,arr.length-1));
	}
}


