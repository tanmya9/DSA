//import java.util.*;
//public class Stackreverse {
//	public static void pushAtBottom(Stack<Integer> s, int data) 
//	{
//		if(s.isEmpty()) {
//			s.push(data);
//			return;
//		}
//		int top=s.pop();
//		pushAtBottom(s, data);
//		s.push(top);
//	}
//	public static void reverseStack(Stack<Integer> s)
//	{
//		if(s.isEmpty()){
//			return;
//		}
//		int top=s.pop();
//		reverseStack(s);
//		pushAtBottom(s, top);
//	}
//	public static void printStack(Stack<Integer> s)
//	{
//			System.out.println(s);
//	}
//	public static void main(String args[])
//	{
//		Stack<Integer> s=new Stack<>();
//		s.push(0);
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		System.out.println("Original Stack");
//		printStack(s);
//
//		reverseStack(s);
//		System.out.println("Reversed Stack");
//		printStack(s);
//	}
//}

package stacks;
import java.util.*;
class Stackreverse
{
	public static void pushAtBottom(Stack<Integer>s, int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		pushAtBottom(s, data);
		s.push(top);
	}
	public static void reverseStack(Stack<Integer> s)
	{
		if(s.isEmpty()) {
			return;
		}
		int top=s.pop();
		reverseStack(s);
		pushAtBottom(s,top);
	}
	public static void printStack(Stack<Integer>s)
	{
//		while(!s.isEmpty())
//		{
//			System.out.println(s.pop()); 
//			//prints top element 1by1 till the stack is empty, nd then destroys the stacks
			//s.pop prints element top -> bottom
//		}
		System.out.println(s); //used when we need to see the elements only
		//stack is not destroyed, can be used after
	}
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3); //from top -> 3,2,1,0
		System.out.println("Original stack: ");
		printStack(s); //prints bottom -> top
		reverseStack(s);
		System.out.println("Reversed stack");
		printStack(s); //from top ->0,1,2,3
		
		
//		reverseStack(s);
//		printStack(s);
	}
}