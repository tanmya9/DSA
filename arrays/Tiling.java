class Tiling
{
	public static int tilingProb(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
//		int vertical=tilingProb(n-1);
//		int horizontal=tilingProb(n-2);
//		int ways=vertical+horizontal;
//		return ways;
		return tilingProb(n-1)+(n-2);
	}
	public static void main(String args[])
	{
		System.out.println(tilingProb(3));
	}
}