class Pair
{
	public static void arrayPair(int num[])
	{
		for(int x=0;x<num.length;x++)
		{
			for(int y=x+1;y<num.length;y++)
			{
				System.out.print("("+num[x]+","+num[y]+")");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int num[]= {2,4,6,7,8,10,12,11};
//		Pair ab=new Pair();
//		ab.arrayPair(num);
		arrayPair(num);
	}
}