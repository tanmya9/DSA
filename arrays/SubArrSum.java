class SubArrSum
{
	public static void maxSum(int num[])
	{
		int sum;
		int maxsum=Integer.MIN_VALUE;
		for(int x=0;x<num.length;x++)
		{
			
			for(int y=0;y<num.length;y++)
			{
				sum=0;
				for(int z=x;z<=y;z++)
				{
					sum=sum+z;
				}
				if(sum>maxsum)
				{
					maxsum=sum;
				}
			}
			
		}
		System.out.println("Max sum of the subarray is "+maxsum);
	}
	public static void main(String args[])
	{
		int num[]={1,-2,6,-1,3};
		maxSum(num);
	}
}