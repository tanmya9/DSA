class Selectionsort
{
	public static void selection(int num[])
	{
		for(int x=0;x<=num.length-2;x++) //length-2(index 3) because last element will already be sorted in the end
		{
			int minpos=x;
			for(int y=x+1;y<num.length;y++)
			{
				if(num[minpos]>num[y])
				{
					minpos=y;
				}
			}
			int temp=num[x];
			num[x]=num[minpos];
			num[minpos]=temp;
		}
	}
	public static void print(int num[])
	{
		for(int x=0;x<num.length;x++)
		{
			System.out.print(num[x]+" ");
		}
	}
	public static void main(String args[])
	{
		int num[]= {5,4,3,1,2};
		selection(num);
		print(num);
	}
}