package strings;
//class Firstword
//{
//	public static String getCapital(String str)
//	{
//		StringBuilder sb=new StringBuilder("");
//		sb.append(Character.toUpperCase(str.charAt(0)));
//		for(int x=0;x<str.length();x++)
//		{
//			if(str.charAt(x)==' ' && x<str.length()-1)
//			{
//				sb.append(str.charAt(x));
//				x++;
//				sb.append(Character.toUpperCase(str.charAt(x)));
//			}
//			else
//			{
//				sb.append(str.charAt(x));
//			}
//		}
//		return sb.toString();
//	}
//	public static void main(String args[])
//	{
//		String str=" sjfif fjiefje fijfei fjefjw ";
//		System.out.print(getCapital(str));
//	}
//}

class Firstword
{
	public static String getCapital(String str)
	{
		StringBuilder sb=new StringBuilder("");
		str=str.trim();
		sb.append(Character.toUpperCase(str.charAt(0)));
		for(int x=1;x<str.length();x++)
		{
			if(str.charAt(x)==' ' && x<str.length()-1)
			{
				sb.append(str.charAt(x));
				x++;
				sb.append(Character.toUpperCase(str.charAt(x)));
			}
			else
			{
				sb.append(str.charAt(x));
			}
		}
		return sb.toString();
	}
	public static void main(String args[])
	{
		String str=" hi i am tanmya ";
		System.out.print(getCapital(str));
	}
}