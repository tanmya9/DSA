//package Queues;
//import java.util.*;
//public class Using2stacks {
//	public static class Queue
//	{
//		static Stack<Integer> s1=new Stack<>();
//		static Stack<Integer> s2=new Stack<>();
//		
//		//checking is stack is empty
//		public static boolean isEmpty()
//		{
//			return s1.isEmpty();
//		}
//		
//		//add
//		public static void add(int data)
//		{
//			while(!s1.isEmpty())
//			{
//				s2.push(s1.pop());
//			}
//			s1.pop();
//			while(!s2.isEmpty()) {
//				s1.push(s2.pop());
//			}
//		}
//		
//		//remove
//		public static int remove()
//		{
//			if(isEmpty())
//			{
//				return -1;
//			}
//			
//			return s1.pop();
//		}
//		public static void main(String args[])
//		{
//			Queue q=new Queue();
//		}
//	}
//}

//package Queues;
//import java.util.*;
//public class Using2stacks
//{
//	static class Queue
//	{
//		static Stack<Integer> s1=new Stack<>();
//		static Stack<Integer> s2=new Stack<>();
//		
//		//check if empty
//		public static Boolean isEmpty()
//		{
//			return s1.isEmpty();
//		}
//		
//		//add elements in s1
//		public static void add(int data)
//		{
//			while(!s1.isEmpty())
//			{
//				s2.push(s1.pop());
//			}
//			s1.push(data);
//			while(!s2.isEmpty()) {
//				s1.push(s2.pop());
//			}
//			
//		}
		//removing
//		public static int remove()
//		{
//			if(isEmpty())
//			{
//				return -1;
//			}
//			
//			return s1.pop();
//		}
//	}
//	public static void main(String args[])
//	{
//		Queue q=new Queue();
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		
//		while(!q.isEmpty())
//		{
//			System.out.println(q.remove());
//		}
//	}
//}

//package Queues;
//import java.util.*;
//public class Using2stacks
//{
//	static class Queue
//	{
//		static Stack<Integer> s1=new Stack<>();
//		static Stack<Integer> s2=new Stack<>();
//		
//		//checking is stack is empty
//		public static Boolean isEmpty()
//		{
//			return s1.isEmpty();		
//		}
//		
//		//add
//		public static void add(int data)
//		{
//			while(!s1.isEmpty()) {
//				s2.push(s1.pop());
//			}
//			s1.push(data);
//			while(!s2.isEmpty()) {
//				s1.push(s2.pop());
//			}
//		}
//		
//		//remove
//		public static int remove()
//		{
//			if(isEmpty())
//			{
//				return -1;
//			}
//			return s1.pop();
//		}
//		
//		public static int peek()
//		{
//			if(isEmpty())
//			{
//				return -1;
//			}
//			return s1.peek();
//		}
//	}
//	public static void main(String args[])
//	{
//		Queue q=new Queue();
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		
//		while(!q.isEmpty())
//		{
//			System.out.println(q.remove());
//		}
//	}
//}

package Queues;
import java.util.*;
public class Using2stacks
{
	static class Queue
	{
		static Stack<Integer> s1=new Stack<>();
		static Stack<Integer> s2=new Stack<>();
		
		//checking if stack is empty
		public static Boolean isEmpty()
		{
			return s1.isEmpty() && s2.isEmpty();		
		}
		
		//add
		public static void add(int data)
		{
			s1.push(data);
		}
		
		//pushing all elements from s1 to s2 in one go
		//then popping elements from s2 will reverse the order
		public static int remove()
		{
				while(!s1.isEmpty()) {
					s2.push(s1.pop());
				}
			return s2.pop();
		}
	}
	public static void main(String args[])
	{
		Queue q=new Queue();
		q.add(0);
		q.add(1);
		q.add(2);
		while(!q.isEmpty())
		{
			System.out.println(q.remove());
		}
		
	}
}
