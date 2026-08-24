//Checking even odd

//class Bitoperations
//{
//	public static void evenOdd(int n)
//	{
//		int bitMask=1;
//		if((n & bitMask) ==0)
//		{
//			System.out.println("Even");
//		}
//		else
//		{
//			System.out.println("Odd");
//		}
//	}
//	public static void main(String args[])
//	{
//		evenOdd(13);
//	}
//}


//finding  the ith bit
//class Bitoperations
//{
//	public static int getIthBit(int n, int i)
//	{
//		int bitMask=1<<i;
//		if((n & bitMask)==0) (n&bitMask) will always return a decimal value
//		{
//			return 0;
//		}
//		else
//		{
//			return 1;
//		}
//	}
//	public static void main(String args[])
//	{
//		System.out.println(getIthBit(10,3));
//	}
//}


//Set ith bit to 1
//class Bitoperations
//{
//	public static int setIthBit(int n, int i)
//	{
//		int bitmask=1<<i;
//		return n|bitmask;
//	}
//	public static void main(String args[])
//	{
//		System.out.println(setIthBit(6,3));
//	}
//}


//Clear ith Bit to 0
//class Bitoperations
//{
//	public static int clearIthBit(int n, int i)
//	{
//		int bitMask= ~(1<<i);
//		return n & bitMask;
//	}
//	public static void main(String args[])
//	{
//		System.out.println(clearIthBit(6,2));
//	}
//}



//class Bitoperations
//{
//	public static int setIthBit(int n, int i)
//	{
//		int bitmask=1<<i;
//		return n|bitmask;
//	}
//	public static int clearIthBit(int n, int i)
//	{
//		int bitMask= ~(1<<i);
//		return n & bitMask;
//	}
//	public static int updateIthBit(int n, int i, int newBit)
//	{
//		if(newBit==0)
//		{
//			return clearIthBit(n,i);
//		}
//		else
//		{
//			return setIthBit(n,i);
//		}
//	}
//	public static void main(String args[])
//	{
//		System.out.println(updateIthBit(6,2,0));
//	}
//}

//Clear last i bits to 0
//class Bitoperations
//{
//	public static int clearIBits(int n, int i)
//	{
//		int bitMask= (~0)<<i;
//		return n & bitMask;
//	}
//	public static void main(String args[])
//	{
//		System.out.println(clearIBits(15,2));
//	}
//}


//Clear bits in range
//class Bitoperations
//{
//	public static int clearBitinRange(int n, int i, int j)
//	{
//		int a= (~0)<<(j+1);
//		int b= (1<<i)-1;
//		int bitMask= a | b;
//		return n & bitMask;
//	}
//	public static void main(String args[])
//	{
//		System.out.println(clearBitinRange(10,2,4));
//	}
//}


//Check if no is a power of 2
//class Bitoperations
//{
//	public static boolean PowerOfTwo(int n)
//	{
////		return (n&(n-1))==0; //n-1 or n-2 or n-1, any no which is less than n
//		if( (n&(n-1)) ==0)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
//	public static void main(String args[])
//	{
//		System.out.println(PowerOfTwo(8));
//	}
//}


//Count set bits
//class Bitoperations
//{
//	public static int CountSetBits(int n)
//	{
//		int count=0;
//		while(n>0)  //  or n!=0
//		{
//			if((n & 1) !=0)
//			{
//				count++;
//				n=n>>1;
//			}
////			n=n>>1;
//			else
//			{
//				n=n>>1;
//			}
//		}
//		return count;
//	}
//	public static void main(String args[])
//	{
//		System.out.println(CountSetBits(15));
//	}
//}


//Fast Exponentiation
class Bitoperations
{
	public static int fastExpo(int n, int p)
	{
		int ans=1;
		while(p>0)
		{
			if((p & 1)!=0)
			{
				ans*=n;
			}
			n=n*n;
			p=p>>1;
		}
		return ans;
	}
	public static void main(String args[])
	{
		System.out.println(fastExpo(5,3));
	}
}

