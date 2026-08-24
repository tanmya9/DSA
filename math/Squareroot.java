class Squareroot
{
	public static int findSquareroot(int x)
	{
		int result=0;
		int i=0;
		while(result<=x)
		{
			i++;
			result=i*i;
		}
		return i-1;
	}
	public static void main(String args[])
	{
		int x=9;
		System.out.println(findSquareroot(x));	
	}
}