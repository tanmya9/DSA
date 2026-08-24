class Subarray
{
	public static void subArray(int num[])
	{
		for(int x=0;x<num.length;x++)
		{
			for(int y=x;y<num.length;y++)
			{
				for(int z=x;z<=y;z++)
				{
					System.out.print(num[z]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int num[]= {2,4,5,7,10,11,12};
//		Subarray ab=new Subarray();
//		ab.subArray(num);
		subArray(num);
		
	}
	
}