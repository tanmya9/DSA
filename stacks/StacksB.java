package stacks;
//Using Linkedlist
import java.util.*;
public class StacksB
{
	//blueprint of a node
//	static class Node
//	{
//		int data;
//		Node next;
//		Node(int data)
//		{
//			this.data=data;
//			this.next=null;
//		}
//	}
//	static class Stack
//	{
//		//making a head node in the stack
//		static Node head=null; //no node is present -> true
//		
//		//check if stack is empty or not
//		public boolean isEmpty()
//		{
//			return head==null;
//		}
//		
//		//push
//		public void push(int data)
//		{
//			Node newnode=new Node(data); //if stack is empty initially toh head hi newnode ban jaega
//			if(isEmpty())
//			{
//				head=newnode;
//				return;
//			}
//			newnode.next=head;
//			head=newnode;
//		}
//		
//		//pop
//		public int pop()
//		{
//			if(isEmpty()) //if stack is empty to kuch hai hi nai return karne ko
//			{
//				return -1;
//			}
//			int top=head.data; //pehle head ki value ko story kaa lo
//			head=head.next; //baad me next node ko head bana do
//			return top; //then previous head ko return kar do
//		}
//		
//		//peek
//		public int peek()
//		{
//			if(isEmpty())
//			{
//				return -1;
//			}
//			return head.data;
//		}
//	}
	
	public static void main(String args[])
	{
//		Stack b=new Stack();
		Stack<Integer> b=new Stack(); //Java collections framework
		b.push(0);
		b.push(1);
		b.push(2);
		b.push(3);
		
		while(!b.isEmpty()) {
//			System.out.println(b.peek());
			b.pop();
		}
	}
}