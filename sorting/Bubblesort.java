class Bubblesort
{
	public static void bubble(int num[])
	{
		//total turns = (n-2)
		int swaps=0;
		for(int turn=0;turn<=num.length-2;turn++) //1 turn = swapping 1 element till the last
		{
			for(int x=0 ; x<= num.length-2-turn; x++) //for comparison
			{
				if(num[x]>num[x+1])
				{
					int temp=num[x];
					num[x]=num[x+1];
					num[x+1]=temp;
					swaps++;
				}
			}
		}
		System.out.println("Total number of swaps "+swaps);
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
		int num[]= {1,2,3,5,4};
		bubble(num);
		print(num);
	}
}