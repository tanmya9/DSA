class Search
{
	public static boolean linearSearch(int num[], int key)
	{
		if(num.length==0)
		{
			return true;
		}
		for(int x=0;x<num.length;x++)
		{
			if(num[x]==key)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		int num[]={10,47,12,45,2,5,1,9};
		int key=45;
		boolean result=linearSearch(num,key);
		if(result==false)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.out.println("Number found at index "+result);
		}
	}
}