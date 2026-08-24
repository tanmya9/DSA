//import java.util.*;
//public class Stackreversestring
//{
//	public static void reverseString(String str)
//	{
//		Stack<Character> s=new Stack();
//		int idx=0;
//		//pushing each character of string into the stack
//		while(idx<str.length()) {
//			s.push(str.charAt(idx));
//			idx++;
//		}
//		
//		//popping out each character now and storing it into a string
//		StringBuilder result=new StringBuilder("");
//		while(!s.isEmpty())
//		{
//			char curr=s.pop(); //taking out each character from stack
//			result.append(curr);
//		}
//		
//		str=result.toString();
//		System.out.println(str);
//	}
//	public static void main(String args[])
//	{
//		reverseString("abc");
//	}
//}
package stacks;
import java.util.*;
public class Stackreversestring
{
	public static String reverseString(String str)
	{
		Stack<Character> s=new Stack();
		int idx=0;
		//pushing each character of string into the stack
		while(idx<str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		
		//popping out each character now and storing it into a string
		StringBuilder result=new StringBuilder("");
		while(!s.isEmpty())
		{
			char curr=s.pop(); //taking out each character from stack
			result.append(curr);
		}
		return result.toString();
		
	}
	public static void main(String args[])
	{
		String str="abc";
		System.out.println(reverseString(str));
	}
}
