package Queues;
import java.util.*;
public class Usingdeque {
	
	//Implementing Stack using Deque
//	static class Stack{
//		static Deque<Integer> deque=new LinkedList<>();
//		public void push(int data)
//		{
//			deque.addLast(data);
//		}
//		
//		public static int pop()
//		{
//			return deque.removeLast();
//		}
//		
//		public static int peek() //only to return the last element 
//		{
//			return deque.getLast();
//		}
//	}
//	public static void main(String args[])
//	{
//		Stack s=new Stack();
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		System.out.println("Top element"+ s.peek());
//		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//	}
	
	//Implementing Queue using Deque
	static class Queue
	{
		static Deque<Integer> deque=new LinkedList<>();
		
		public static boolean isEmpty()
		{
			return deque.isEmpty();
		}
		public static void push(int data)
		{
			deque.addLast(data);
		}
		
		public static int remove()
		{
			return deque.removeFirst();
		}
		
		public static int peek()
		{
			return deque.getFirst();
		}
	}
	public static void main(String args[])
	{
		Queue q=new Queue();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		
		System.out.println("Top element "+q.peek());
		while(!q.isEmpty())
		{
			System.out.println(q.remove());

		}
	}
}
