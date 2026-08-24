class Countsort
{
	public static void countsort(int num[])
	{
		int largest=Integer.MIN_VALUE;
		for(int x=0;x<num.length;x++)
		{
			largest=Math.max(largest, num[x]);
		}
		
		//creating frequency array
		int count[]=new int[largest+1];
		for(int x=0;x<num.length;x++)
		{
			count[num[x]]++;
		}
		
		//sorting
		int j=0;
		for(int x=0;x<count.length;x++)
		{
			while(count[x]>0)
			{
				num[j]=x;
				count[x]--;
				j++;
			}
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
		int num[]= {3,4,1,3,2,5,2,8};
		countsort(num);
		print(num);
	}
}