//class Kadanes
//{
//	public static void kadanes(int num[])
//	{
//		int maxsum=Integer.MIN_VALUE;
//		int currsum=0;
//		for(int x=0;x<num.length;x++)
//		{
//			currsum = currsum + num[x];
//			if(currsum<0)
//			{
//				currsum=0;
//				
//			}
//			maxsum=Math.max(maxsum, currsum); //checks which is greater
//		}
//		
////		if(maxsum<0) //checks if the array is all negative it returns max sum as 0 for empty subarray condition
////		{
////			maxsum=0;
////		}
//		System.out.println("Maximum sum of the array is "+maxsum);
//	}
//	public static void main(String args[])
//	{
//		int num[]={-2,-3,-4,-1,-2,-1,-5,-3};
//		kadanes(num);
//	}
//}

//printing the subarray of maximum sum
//class Kadanes
//{
//	public static void kadane(int num[])
//	{
//		int start=0;
//		int finalstart=-1 , finalend=-1;
//		int currsum=0;
//		int maxsum=Integer.MIN_VALUE;
//		for(int x=0;x<num.length;x++)
//		{
//			if(currsum==0)
//			{
//				start=x; //capturing the starting index
//			}
//			currsum=currsum+num[x];
//			if(currsum<0)
//			{
//				currsum=0;
//			}
//			maxsum=Math.max(currsum,maxsum);
//			finalend=x; //storing the final index
//			finalstart=start;
//		}
//		System.out.println("Maximum sum is "+maxsum);
//		
//		for(int y=finalstart;y<finalend;y++)
//		{
//			System.out.print(num[y]+ " ");
//		}
//	}
//	public static void main(String args[])
//	{
//		int num[]= {-2,-3,4,-1,-2,1,5,-3};
//		kadane(num);
//	}
//}

//class Kadanes
//{
//	public static void kadanesalgo(int num[])
//	{
//		int currsum=0, start=0, finalstartindex=-1, endindex=-1;
//		int maxsum=Integer.MIN_VALUE;
//		for(int x=0;x<num.length;x++)
//		{
//			if(currsum==0)
//			{
//				start=x;
//			}
//			currsum=currsum+num[x];
//			if(currsum<0)
//			{
//				currsum=0;
//			}
//			maxsum=Math.max(maxsum,currsum);
//			finalstartindex=start;
//			endindex=x;
//		}
//		if(maxsum<0)
//		{
//			maxsum=0;
//		}
//		System.out.println("Maximum sum is "+maxsum);
//		System.out.println("Subarray of maximum sum is ");
//
//		for(int y=finalstartindex;y<endindex;y++)
//		{
//			System.out.print(num[y]+" ");
//		}
//	}
//	public static void main(String args[])
//	{
//		int num[]={-2,-3,4,-1,-2,1,5,-3};
//		kadanesalgo(num);
//	}
//}

//class Kadanes
//{
//	public static void kadanes(int num[])
//	{
//		int currsum=0;
//		int maxsum=Integer.MIN_VALUE;
//		for(int x=0;x<num.length;x++)
//		{
//			currsum=currsum+num[x];
//			if(currsum<0)
//			{
//				currsum=0;
//			}
//			maxsum=Math.max(currsum,maxsum);
//		}
//		if(maxsum<0)
//		{
//			maxsum=0;
//		}
//		System.out.println("Maximum sum is "+maxsum);
//	}
//	public static void main(String args[])
//	{
//		int num[]= {-2,-3,4,-1,-2,1,5,-3};
//		kadanes(num);
//	}
//}

class Kadanes
{
	public static void kadanes(int num[])
	{
		int currsum=0;
		int maxsum= Integer.MIN_VALUE;
		int start=-1, finalstartindex=-1, end=-1;
		for(int x=0;x<num.length;x++)
		{
			if(currsum==0)
			{
				start=x;
			}
			currsum=currsum+num[x];
			if(currsum<0)
			{
				currsum=0;
			}
			maxsum=Math.max(maxsum, currsum);
			finalstartindex=start;
			end=x;
		}
		System.out.println("Maximum sum of the subarray is "+maxsum);
		System.out.println("The subarray  with maximum sum is ");
		for(int x=finalstartindex; x<end; x++)
		{
			System.out.print(num[x]+ " ");
		}
	}
	public static void main(String args[])
	{
		int num[]= {-2,-3,4,-1,-2,1,5,-3};
		kadanes(num);
	}
}