//package Queues;
//import java.util.*;
//public class Using2queues {
//	static class QueueB
//	{
//		static Queue<Integer> q1=new LinkedList<>();
//		static Queue<Integer> q2=new LinkedList<>();
//		
//		public static boolean isEmpty()
//		{
//			return q1.isEmpty() && q2.isEmpty();
//		}
//		
//		//add elements
//		public static void push(int data)
//		{
//			if(!q1.isEmpty())
//			{
//				q1.add(data);
//			}
//			else
//			{
//				q2.add(data);
//			}
//		}
//		
//		//popping elements
//		public static int pop()
//		{
//			if(isEmpty())
//			{
//				System.out.println("Queue is empty");
//				return -1;
//			}
//			int top= -1;
//			
//			//we will keep on removing elements from q1 till we reach the last element in q1
//			if(!q1.isEmpty()) 
//			{
//				while(!q1.isEmpty())
//				{
//					top=q1.remove();
//					if(q1.isEmpty())
//					{
//						break; //if q1 becomes empty, that means top=last element of q1
//					}
//					else
//					{
//						q2.add(top);
//					}
//				}
//			}
//			else
//			{
//				while(!q2.isEmpty()) {
//					top=q2.remove();
//					if(q2.isEmpty()) { //as soon as q2 is empty, top=last element of q2
//						break;
//					}
//					else
//					{
//						q1.add(top);
//					}
//				}
//			}
//			return top;
//		}
//		
//		
//		public static void main(String args[])
//		{
//			QueueB s=new QueueB();
//			s.push(1);
//			s.push(2);
//			s.push(3);
//			s.push(4);
//			
//			while(!s.isEmpty())
//			{
//				System.out.println(s.pop());
//			}
//		}
//	}
//}


package Queues;
import java.util.*;
public class Using2queues
{
	static class QueueB
	{
		static Queue<Integer> q1=new LinkedList<>();
		static Queue<Integer> q2=new LinkedList<>();
		
		public static boolean isEmpty()
		{
			return q1.isEmpty() && q2.isEmpty();
		}
		
		//add
		public static void add(int data)
		{
			if(!q1.isEmpty()) {
				q1.add(data);
			}
			else
			{
				q2.add(data);
			}
		}
		
		//popping
		public static int remove()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top= -1;
			if(!q1.isEmpty())
			{
				while(!q1.isEmpty())
				{
					top=q1.remove();
					if(q1.isEmpty())
					{
						break;
					}
					q2.add(top);
				}
			}
			else
			{
				while(!q2.isEmpty()) {
					top=q2.remove();
					if(q2.isEmpty()) { //as soon as q2 is empty, top=last element of q2
						break;
					}
					else
					{
						q1.add(top);
					}
				}
			}
			return top;
		}
		public static void main(String args[])
		{
			QueueB q=new QueueB();
			q.add(1);
			q.add(2);
			
			while(!q.isEmpty())
			{
				System.out.println(q.remove());
			}
		}
	}
	
}