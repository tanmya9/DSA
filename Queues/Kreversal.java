package Queues;
import java.util.*;
public class Kreversal {
	public static void reverseK(Queue<Integer> q, int k)
	{
		Stack<Integer> s=new Stack<>();
		int size=q.size();
		for(int i=0;i<k;i++) //loop runs till k elements
		{
			s.add(q.remove()); //removes from queue and stores it in stack
		}
		while(!s.isEmpty()) {
			q.add(s.pop()); //removes from stack and stores it in queue, popping from stack reverses the elements
		}
		for(int i=0;i<size-k;i++)//size-k gives no of remaining elements in queue
		{
			q.add(q.remove()); //removes elements from front in the queue and add at the rear
		}
	}
	public static void main(String args[])
	{
		Queue<Integer> q=new LinkedList<>();
		int k=3;
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		reverseK(q,k);
		while(!q.isEmpty())
		{
			System.out.println(q.remove());
		}
		System.out.println();
	}
}
