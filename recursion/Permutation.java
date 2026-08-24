class Permutation
{
	public static void calcWays(String str, String add)
	{
		//base case
		if(str.length()==0)
		{
			System.out.println(add);
			return;
		}
		//recursion
		for(int i=0;i<str.length();i++)
		{
			String newStr=str.substring(0,i)+str.substring(i+1);
			
			calcWays(newStr,add+str.charAt(i));
		}
	}
	public static void main(String args[])
	{
		String str="abc";
		calcWays(str,"");
	}
}