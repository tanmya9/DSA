package strings;
import java.util.Arrays;
class Stringques
{
	public static boolean anagram(String str1, String str2)
	{
		str1=str1.trim();
		str2=str2.trim();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1,ch2);
	}
	public static void main(String args[])
	{
		String str1="  race ";
		String str2=" caRE";
		System.out.println(anagram(str1, str2));
	}
}