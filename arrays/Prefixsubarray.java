////class Prefixsubarray
////{
////	public static void prefixSum(int num[])
////	{
////		int curr_sum=0;
////		int max_sum=Integer.MIN_VALUE;
////		int prefix[]=new int[num.length]; //declaring a prefix array
////		
////		prefix[0]=num[0]; //initialising index 0 of prefix with the element present in the index 0 of the original array
////		
////		//calculating prefix
////		for(int x=1; x<prefix.length; x++)
////		{
////			prefix[x]=prefix[x-1]+num[x]; //calc sum at index 1 of prefix array by adding no present at index 1 of the original array
////		}
////		
////		//calc sum from any index in the prefix sum array
////		for(int x=0;x<num.length;x++)
////		{
////			for(int y=x;y<num.length;y++)
////			{
////				curr_sum= x==0 ? prefix[y] : prefix[y]-prefix[x-1];
////				if(curr_sum>max_sum)
////				{
////					max_sum=curr_sum;
////				}
////			}
////		}
////		System.out.println("Maximum sum is "+max_sum);
////	}
////	public static void main(String args[])
////	{
////		int num[]={1, -2, 6, -1, 3};
////		prefixSum(num);
////	}
////}
//
//class Prefixsubarray
//{
//	public static void prefixSum(int num[])
//	{
//		int currsum=0;
//		int maxsum=Integer.MIN_VALUE;
//		int prefix[]=new int[num.length];
//		prefix[0]=num[0];
//		for(int x=1;x<prefix.length;x++)
//		{
//			prefix[x] = prefix[x-1]+num[x];
//		}
//		for(int x=0;x<prefix.length;x++)
//		{
//			for(int y=x;y<prefix.length;y++)
//			{
//				currsum = x==0 ? prefix[y] : prefix[y] - prefix[x-1];
//				if(maxsum<currsum)
//				{
//					maxsum=currsum;
//				}
//			}
//		}
//		System.out.println("Maximum sum is "+maxsum);
//	}
//	public static void main(String args[])
//	{
//		int num[]= {1, -2, 6, -1, 3};
//		prefixSum(num);
//	}
//}

//class Prefixsubarray
//{
//	public static void prefixsub(int num[])
//	{
//		int currsum=0;
//		int maxsum=Integer.MIN_VALUE;
//		int prefix[]=new int[num.length];
//		prefix[0]=num[0];
//		for(int x=1;x<num.length;x++)
//		{
//			prefix[x]=prefix[x-1]+num[x];
//		}
//		for(int x=0;x<prefix.length;x++)
//		{
//			for(int y=x;y<prefix.length;y++)
//			{
//				currsum=x==0?prefix[y]:prefix[y]-prefix[x-1];
//				if(currsum>maxsum)
//				{
//					maxsum=currsum;
//				}
//			}
//		}
//		System.out.println("Maximum sum is "+maxsum);
//	}
//	public static void main(String args[])
//	{
//		int num[]= {1,-2,6,-1,3};
//		prefixsub(num);
//	}
//}


class Prefixsubarray
{
	public static void prefixSub(int num[])
	{
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		int prefix[]=new int[num.length];
		prefix[0]=num[0];
		for(int x=1;x<prefix.length;x++) 
		{
			prefix[x]=prefix[x-1]+num[x];
		}
		for(int x=0;x<prefix.length;x++)
		{
			for(int y=x;y<prefix.length;y++)
			{
				currsum=x==0?prefix[y]:prefix[y]-prefix[x-1];
				if(currsum>maxsum)
				{
					maxsum=currsum;
				}
			}
		}
		System.out.println("Maximum sum is "+maxsum);
	}
	public static void main(String args[])
	{
		int num[]= {1,-2,6,-1,3};
		prefixSub(num);
	}
}