class SubArr
{
	public static void subarray(int num[])
	{	int count=0;
		for(int x=0;x<num.length;x++) //for start index
		{
			for(int y=x;y<num.length;y++) //for end index
			{
				for(int z=x;z<=y;z++) //prints elements from start to end
				{
					System.out.print(num[z]);
				}
				System.out.println();
				count++;

			}
			System.out.println();
		}
		System.out.println("Total subarrays are "+count);
	}
	public static void main(String args[])
	{
		int num[]= {2,4,6,8,10};
		System.out.println("Sub arrays are ");
		subarray(num);
	}
}