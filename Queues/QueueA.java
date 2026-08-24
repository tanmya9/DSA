package Queues;
public class QueueA {
	static class Queue
	{
		static int arr[];
		static int size;
		static int rear;
		
		Queue(int n)
		{
			arr=new int[n];
			size=n;
			rear= -1; // no element, then the value of rear will keep on changing as the elements will add on from the back
		}
		
//		3 functions: add, remove, peek
		
//	check if queue is empty
		public static boolean isEmpty()
		{ 
			return rear== -1; //if rear is -1 (means empty), then true
		}
		
		//add
		public static void add(int data)
		{
			//check if queue is full
			if(rear==size-1){ //if rear has moved to the end of the queue (means it is full)
				System.out.println("Queue is full");
				return;
			}
			rear=rear+1;
			arr[rear]=data;
		}
		
		//remove
		public static int remove()
		{
			if(isEmpty()) //first check if its empty, then return -1
			{
				System.out.println("Queue is empty");
				return -1;
			}
			
			int front=arr[0];
			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1]; //after storing the front, shifting every element in the front
			}
			rear--; //shifting rear -1
			return front; 
		}
		
		//peek
		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[0];
		}
		
		public static void main(String args[])
		{
			Queue q=new Queue(3);
			q.add(2);
			q.add(3);
			q.add(4);
//			while(!isEmpty())
//			{
//				System.out.println(q.peek());
//				q.remove();
//			}
			
			//if i dont want to use remove
			while(!isEmpty())
			{
				System.out.println(q.remove());
			}
		}
	}
}
