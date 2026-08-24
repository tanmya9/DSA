package stacks;
import java.util.*;
public class Stackvalidparenthesis {
	public static boolean isValid(String str)
	{
		Stack<Character> s=new Stack<>();
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='(' || ch=='{' || ch=='[') //if opening bracket push into stack
			{
				s.push(ch);
			}
			else //if no opening brack is encountered or the stack is empty
			{
				if(s.isEmpty()) {
					return false;
				}
				if((s.peek()=='(' && ch==')') || (s.peek()=='[' && ch==']') || (s.peek()=='{' && ch=='}'))
				{
					s.pop();
				}
				else
				{
					return false;
				}
				
			}
		}
		if(s.isEmpty()) { //check if at the end stack is empty or not
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		String str="(((((";
		System.out.println(isValid(str));
	}
}
