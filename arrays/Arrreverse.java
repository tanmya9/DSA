class Arrreverse
{
	public static void reverse(int num[])
	{
		int start=0, end=num.length-1;
		while(start<end)
		{
			int temp=num[start];
			num[start]=num[end];
			num[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String args[])
	{
		int num[]= {2,34,5,8,12,11,20};
		reverse(num);
		System.out.println("Reversed array is ");
		for(int x=0;x<num.length;x++)
		{
			System.out.print(num[x]+" ");
		}
		
	}
}