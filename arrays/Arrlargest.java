class Arrlargest
{
	public static int largest(int num[])
	{
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		int index=0;
		for(int x=0;x<num.length;x++)
		{
			if(num[x]>largest)
			{
				largest=num[x];
				index=x;
			}
			if(num[x]<smallest)
			{
				smallest=num[x];
			}
		}
		System.out.println("Index of the largest number is "+index);
		System.out.println("Smallest element of the array is "+smallest);

		return largest;
	}
	public static void main(String args[])
	{
		int num[]= {12,23,2,6,569,46};
		System.out.println("The largest number from the array is "+largest(num));
	}
}