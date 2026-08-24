//class Pascal
//{
//	public static void main(String args[])
//	{
//		for(int x=1;x<=5;x++)
//		{
//			for(int s=1;s<=(5-x);s++)
//			{
//				System.out.print(" ");
//			}
//			int n=1;
//			for(int c=1;c<=x;c++)
//			{
//				System.out.print(n+" ");
//				n=n*(x-c)/c;
//			}
//			System.out.println();
//		}
//		
//	}
//}

class Pascal
{
	public static void main(String args[])
	{
		for(int x=1;x<=5;x++)
		{
			for(int y=1;y<=5-x;y++)
			{
				System.out.print(" ");
			}
			int n=1;
			for(int c=1;c<=x;c++)
			{
				System.out.print(n+" ");
				n=n*(x-c)/c;
			}
			System.out.println("");
		}
	}
}