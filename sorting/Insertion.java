class Insertion
{
	public static void insertionsort(int num[])
	{
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(num[j]<num[j-1])
				{
					int temp=num[j];
					num[j]=num[j-1];
					num[j-1]=temp;
				}
				else
				{
					break;
				}
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
		int num[]= {22,55,34,12,10,6,3,8};
		insertionsort(num);
		print(num);
	}
}