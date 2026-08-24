package stacks;
class Stocks
{
	public static void buySell(int prices[])
	{
		int profit=0, maxprofit=0;
		int spindex;
		int buyprice=Integer.MAX_VALUE;
		for(int x=0;x<prices.length;x++)
		{
			if(buyprice < prices[x])
			{
			 	profit=prices[x]-buyprice;
				maxprofit=Math.max(profit, maxprofit);
			}
			else
			{
				buyprice = prices[x];
			}
		}
		System.out.println("Maximum profit is "+maxprofit);
	}
	public static void main(String args[])
	{
		int prices[]= {7,1,5,3,6,4};
		buySell(prices);
	}
}