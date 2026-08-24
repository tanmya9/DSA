class Arrpair
{
	public static void pairs(int num[])
	{
		int count=0;
		for(int x=0;x<num.length;x++)
		{
			for(int y=x+1;y<num.length;y++)
			{
				System.out.print("("+num[x]+","+num[y]+")");
				count++;
			}
			System.out.println();
		}
		System.out.println("Total number of pairs "+count);
	}
	public static void main(String args[])
	{
		int num[]= {12,2,6,8,9,10};
		pairs(num);
	}
}