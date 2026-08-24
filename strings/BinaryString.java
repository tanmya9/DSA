package strings;
class BinaryString
{
	public static void printBinary(int n, int lastIndex, String str)
	{
		if(n==0)
		{
			System.out.println(str);
			return;
		}
		if(lastIndex==0)
		{
			printBinary(n-1, 0, str+"0");
			printBinary(n-1, 1, str+"1");
		}
		else
		{
			printBinary(n-1, 0, str+0);
		}
	}
	public static void main(String args[])
	{
		printBinary(2,0," ");
	}
}

//class BinaryString
//{
//	public static void printBinary(int n, int lastindex, String str)
//	{
//		if(n==0)
//		{
//			System.out.println(str);
//			return;
//		}
//		printBinary(n-1,0,str+"0");
//		if(lastindex==0)
//		{
//			printBinary(n-1, 1, str+"1");
//		}
//	}
//	public static void main(String args[])
//	{
//		printBinary(2,0," ");
//	}
//}