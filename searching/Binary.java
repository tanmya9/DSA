class Binary
{
	public static void binToDec(int num)
	{
		int mynum=num;
		int dec=0;
		int pow=0;
		while(num>0)
		{
			int last=num%10;
			dec=dec+(last*(int)Math.pow(2, pow));
			pow++;
			num=num/10;
		}
		System.out.println("Decimal of "+mynum+" is "+dec);  //because num becomes 0 at the end after dividing
	}
	public static void main(String args[])
	{
		binToDec(0101);
	}
}