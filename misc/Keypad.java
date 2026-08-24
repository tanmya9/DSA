class Keypad
{
	static char L[][]= {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
	public static void letterCombination(String D)
	{
		int len=D.length();
		if(len==0)
		{
			System.out.println("");
			return;
		}
		bfs(0,len, new StringBuilder(), D);
	}
	public static void bfs(int i, int len, StringBuilder sb, String D)
	{
		if(i==len)
		{
			System.out.println(sb.toString());
			return;m 
		}
		
		char letters[]=L[Character.getNumericValue(D.charAt(i))];
		for(int x=0;x<letters.length;x++)
		{
			bfs(i+1, len, new StringBuilder(sb).append(letters[x]), D);
		}
	}
	public static void main(String args[])
	{
		letterCombination("23");
		
	}
}