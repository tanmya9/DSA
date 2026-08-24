package stacks;
import java.util.*;
public class Stackpushbottom {
	public static void pushAtBottom(Stack<Integer> s, int data)
	{
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		int top=s.pop(); //removes element from the stack 1 by 1
		pushAtBottom(s, data);
		s.push(top); //pushes the same element 1 by 1 after adding 4 at the bottom
		
	}
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		pushAtBottom(s, 4);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
}
