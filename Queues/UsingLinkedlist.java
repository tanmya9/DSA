package Queues;
public class UsingLinkedlist {
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	static Node head= null;
	static Node tail=null;
	
	public static boolean isEmpty()
	{
		return head==null;
	}
	
	//add
	public static void add(int data) { //adding a newnode at the end of the queue
		Node newNode=new Node(data); //creating a new Node
		
		//if we are first time adding any element, then,
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		
		tail.next=newNode;
		tail=newNode;
	}
	
	public static int remove()
	{
		//check if queue is empty or full
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		
		int front=head.data; //pehle value humesha store karlo head ki
		
		// if only single element is there in the queue
		if(head==tail) //if 1 element is there
		{
			head=tail=null;
		}
		else //agar single element nahi hai toh
		{
			head=head.next; //next element ko head bana do
		}
		
		return front; //previous head ki value return
	}
	
	//peek
	public static int peek()
	{
		if(isEmpty())
		{
			System.out.println("Empty queue");
			return -1;
		}
		
		return head.data;
	}
	
	public static void main(String args[])
	{
		UsingLinkedlist q=new UsingLinkedlist();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!isEmpty())
		{
			//System.out.println(q.peek());
			//q.remove();
			System.out.println(q.remove());
		}
	}
}
