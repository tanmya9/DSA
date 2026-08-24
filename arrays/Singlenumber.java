class Singlenumber
{
	public static int checkSingle(int arr[])
	{
		int freq=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				freq++;
			}
			int count=freq;
		}
	}
	public static void main(String args[])
	{
		int arr[]= {2,2,1,3,3};
	}
}