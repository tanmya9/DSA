package strings;
class Palindromestring
{
	public static boolean isPalindrome(String str)
	{
		for(int x=0;x<str.length()/2;x++)
		{
			if(str.charAt(x)!=str.charAt(str.length()-1-x))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		String str="tanmya";
		System.out.println(isPalindrome(str));
	}
}