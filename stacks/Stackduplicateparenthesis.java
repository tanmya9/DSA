package stacks;
import java.util.*;
public class Stackduplicateparenthesis {
	public static boolean isDuplicate(String str1)
	{
		Stack<Character> s=new Stack<>();
		
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
			
			//closing condition
			if(ch==')') {
				int count=0; //to calculate operators, operands that exist between the opening and closing brack
				while(s.peek()!='(')
				{
					count++; //increases for every operators or operands in between
					s.pop(); //removes all operators or operands until it finds the opening brack
				}
				if(count<1)
				{
					return true; //duplicate exists
				}
				s.pop();
			}
			
			//opening condition
			else
			{
				s.push(ch);
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		String str="((a+b))";
		String str1="(a-b)";
		System.out.println(isDuplicate(str1));
	}
}