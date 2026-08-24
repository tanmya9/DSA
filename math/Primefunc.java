//class Primefunc
//{
////	public static boolean isPrime(int n)
////	{
////		if(n==2)
////		{
////			return true;
////		}
////		for(int x=2;x<=n-1;x++)
////		{
////			if(n%x==0)
////			{
////				return false;
////			}
////		}
////		return true;
////	}
//	
//	public static boolean isPrime(int n)
//	{
//		boolean isPrime=true;
//		if(n==2)
//		{
//			return isPrime;
//		}
//		for(int x=2;x<=n-1;x++)
//		{
//			if(n%x==0)
//			{
//				isPrime=false;
//				return isPrime;
//			}
//		}
//		return isPrime;
//	}
//	public static void main(String args[])
//	{
//		System.out.println(isPrime(227));	
//	}
//}


//Optimised approach
class Primefunc
{
	public static boolean isPrime(int n)
	{
		if(n==2)
		{
			return true;
		}
		for(int x=2;x<=Math.sqrt(n);x++)
		{
			if(n%x==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void primeInRange(int num)
	{
		System.out.println("The prime numbers in the given range are: ");
		for(int x=2;x<=num;x++)
		{
			if(isPrime(x))
			{
				System.out.print(x+" ");
			}
		}
	}
	public static void main(String args[])
	{
		primeInRange(10);  //just calling the function because we are giving range
	}
}
