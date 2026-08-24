class Friend
{
	public static int pairFriend(int n)
	{
		if(n==1 || n==2)
		{
			return n;
		}
		int fnm1=pairFriend(n-1);
		int fnm2=pairFriend(n-2);
		int totalways=fnm1+(n-1)*fnm2;
		return totalways;
//		return pairFriend(n-1)+((n-1)*pairFriend(n-2));
		
	}
	public static void main(String args[])
	{
		System.out.print(pairFriend(3));
	}
}