//class Maxsum
//{
//	public static void maxSubarray(int num[])
//	{
//		for(int x=0;x<num.length;x++)
//		{
//			int currsum=0;
//			int maxsum=Integer.MIN_VALUE;
//			for(int y=x;y<num.length;y++)
//			{
//				currsum=0;
//				for(int z=x;z<=y;z++)
//				{
//					System.out.print(num[z]+" ");
//					currsum=currsum+num[z];
//				}
//				System.out.println();
//				System.out.println("Sum is "+currsum);
//				System.out.println();
//				if(currsum>maxsum)
//				{
//					maxsum=currsum;
//				}
//			}
//			System.out.println("Maximum sum is "+maxsum);
//
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		int num[]= {-2,3,-4,5,6};
//		maxSubarray(num);	
//	}
//}


class Maxsum
{
	public static void maxSum(int num[])
	{
		int maxsum=Integer.MIN_VALUE;
		for(int x=0;x<num.length;x++)
		{
			int currsum=0;
			
			for(int y=x;y<num.length;y++)
			{
				currsum=0;
				for(int z=x;z<=y;z++)
				{
					System.out.print(num[z]+" ");
					
					currsum=currsum+num[z];
				}
				System.out.println();
				System.out.println("Sum is "+currsum);
				System.out.println();
				if(currsum>maxsum)
				{
					maxsum=currsum;
				}
			}
			System.out.println("Maximum sum of the subarray is "+maxsum);
		}
		
	}
	public static void main(String args[])
	{
		int num[]= {-2,3,-4,5,6};
		maxSum(num);
	}
}