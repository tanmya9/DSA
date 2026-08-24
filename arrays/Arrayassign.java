//class Arrayassign
//{
//	public static boolean repeat(int num[])
//	{
//		for(int x=0;x<num.length;x++)
//		{
//			for(int y=x+1;y<num.length;y++)
//			{
//				if(num[x]==num[y])
//				{
//					return true;
//				}
//			}
//		}
//		return false;
//	}
//	public static void main(String args[])
//	{
//		int num[]= {4,5,2,3,0,11};
//		System.out.println(repeat(num));
//	}
//}

//class Arrayassign
//{
//	public static void stocks(int prices[])
//	{
//		int profit=0;
//		int buyprice=Integer.MAX_VALUE;
//		int maxprofit=0;
//		for(int x=0;x<prices.length;x++)
//		{
//			if(prices[x]>buyprice)
//			{
//				profit=prices[x]-buyprice;
//				maxprofit=Math.max(profit,maxprofit);
//			}
//			else
//			{
//				buyprice=prices[x];
//			}
//		}
//		System.out.println("Max profit is "+maxprofit);
//	}
//	public static void main(String args[])
//	{
//		int prices[]= {7,6,4,3,1};
//		stocks(prices);
//	}
//}

class Arrayassign
{
	public static void trappedwater(int height[])
	{
		int waterlevel=0;
		int trapped=0;
//		calculating left max boundary
		
		int leftmax[]=new int[height.length];
		leftmax[0]=height[0];
		for(int x=1;x<height.length;x++)
		{
			leftmax[x]=Math.max(height[x],leftmax[x-1]);
		}
		
//		calculating right max boundary
		int rightmax[]=new int[height.length];
		rightmax[height.length-1]=height[height.length-1];
		for(int x=height.length-2;x>=0;x--)
		{
			rightmax[x]=Math.max(height[x], rightmax[x+1] );
		}
		
//		calculating trapped water
		for(int x=0;x<height.length;x++)
		{
			waterlevel=Math.min(leftmax[x], rightmax[x]);
			trapped=trapped+(waterlevel-height[x]);
		}
		System.out.println("Water trapped is "+trapped);
	}
	public static void main(String args[])
	{
		int height[]= {4, 2, 0, 3, 2, 5};
		trappedwater(height);
	}
}