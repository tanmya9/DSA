//////Using ArrayList
////import java.util.*;
////public class StacksA {
////	static class Stack //object will be created for this class in the main function
////	{
////		//creating an arraylist
////		static ArrayList<Integer> list= new ArrayList<>();
////		
////		//checking if arraylist is empty
////		public static boolean isEmpty()
////		{
////			return list.size()==0; //returns true if stack is empty
////		}
////		
////		//push
////		public static void push(int data)
////		{
////			list.add(data);
////		}
////		
////		//pop
////		public static int pop()
////		{
////			int top=list.get(list.size()-1); //stores the last element of list 
////			list.remove(list.size()-1); //removes the last element
////			return top;
////		}
////		
////		//peek
////		public static int peek()
////		{
////			return list.get(list.size()-1);
////		}
////	}
////	public static void main(String args[])
////	{
////		Stack a=new Stack();
////		a.push(1);
////		a.push(2);
////		a.push(3);
////		while(!a.isEmpty())
////		{
////			System.out.println(a.peek());
////			a.pop();
////		}
////	}
////}
//
////import java.util.*;
////public class StacksA
////{
////	static class Stack
////	{
////		static ArrayList<Integer> list=new ArrayList<>();
////		
////		//check if list is empty
////		public boolean isEmpty()
////		{
////			return list.size()==0;
////		}
////		
////		//push
////		public void push(int data)
////		{
////			list.add(data);
////		}
////		
////		//pop
////		public int pop()
////		{
////			int top=list.get(list.size()-1);
////			list.remove(list.size()-1);
////			return top;
////		}
////		
////		//peek
////		public int peek()
////		{
////			return list.get(list.size()-1);
////		}
////	}
////	public static void main(String args[])
////	{
////		Stack b= new Stack();
////		b.push(0);
////		b.push(1);
////		b.push(2);
////		
////		while(!b.isEmpty())
////		{
////			System.out.println(b.peek());
////			b.pop();
////		}
////	}
////}
//
//import java.util.*;
//public class StacksA
//{
//	static class Stack
//	{
//		ArrayList<Integer> list=new ArrayList<>();
//		
//		//check if list is empty
//		public boolean isEmpty()
//		{
//			return list.size()==0;
//		}
//		//push
//		public void push(int data)
//		{
//			list.add(data);
//		}
//		//pop
//		public int pop()
//		{
//			if(isEmpty()) //if List is empty initially
//			{
//				return -1;
//			}
//			int top=list.get(list.size()-1);
//			list.remove(list.size()-1);
//			return top;
//		}
//		//peek
//		public int peek()
//		{
//			if(isEmpty())
//			{
//				return -1;
//			}
//			return list.get(list.size()-1);
//		}
//	}
//	public static void main(String args [])
//	{
//		Stack a=new Stack();
////		a.push(0);
////		a.push(1);
////		a.push(2);
////		a.push(3);
//		if(a.isEmpty())//check if list not having any values in stack then print -1
//		{
//			System.out.println(a.peek());
//		}
//		else //stack has some elements
//		{
//			while(!a.isEmpty()) //jab tak list empty nahi ho jaati tab tak loop runs
//			{
//				System.out.println(a.peek());
//				a.pop();
//			}
//		}
//		
//	}
//}
package stacks;
import java.util.*;
public class StacksA
{
	static class Stack
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		//check if list is empty
		public boolean isEmpty()
		{
			return list.size()==0;
		}
		
		//push
		public void push(int data)
		{
			list.add(data);
		}
		//pop
		public int pop()
		{
			int top=list.get(list.size()-1);
			list.remove(list.size()-1); //"list.size()-1" to remove index+value both
			return top;
		}
		//peek
		public int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			return list.get(list.size()-1);
		}
	}
	public static void main(String args[])
	{
		Stack b=new Stack();
		b.push(0);
		b.push(1);
		b.push(2);
//		b.push(3);
		if(b.isEmpty())
		{
			System.out.println("The stack is empty");
			System.out.println(b.peek());
		}
		else
		{
			while(!b.isEmpty())
			{
				System.out.println(b.peek());
				b.pop();
			}
		}
	}
}