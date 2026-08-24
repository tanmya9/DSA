package strings;
//class Stringcompress
//{
//	public static String compress(String str)
//	{
//		String newStr="";
//		for(int x=0;x<str.length();x++)
//		{
//			//aaabbcc
//			Integer count=1;
//			while( x<str.length()-1 && str.charAt(x)==str.charAt(x+1))
//			{
//				count++;
//				x++;
//			}
//			newStr+=str.charAt(x); //while loop chahe chale ya na chale character yaha add ho jaega
//			if(count>1)
//			{
//				newStr+=count.toString();
//			}
//		}
//		return newStr;
//	}
//	public static void main(String args[])
//	{
//		String str="aaabbcc";
//		System.out.println(compress(str));
//	}
//}

class Stringcompress
{
	public static String compress(String str)
	{
		StringBuilder sb=new StringBuilder("");
		for(int x=0;x<str.length();x++)
		{
			Integer count=1;
			while( x<str.length()-1 && str.charAt(x)==str.charAt(x+1))
			{
				count++;
				x++;
			}
			sb.append(str.charAt(x));
			if(count>1)
			{
				sb.append(count.toString());
			}
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		String str="aaabbcc";
		System.out.print(compress(str));
	}
}