class Linkedlistpalindrome
{
	public static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addFirst(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=tail=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
public Node findMid(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public Boolean palindrome()
	{
		Node mid=findMid(head);
		Node prev=null;
		Node curr=mid;
		Node next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		Node right=prev;
		Node left=head;
		
		while(right!=null)
		{
			if(left.data!=right.data)
			{
				return false;
			}
			right=right.next;
			left=left.next;
		}
		return true;
	}
	public void print()
	{
		if(head==null)
		{
			System.out.println("LinkedList is empty");
			return;
		}
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Linkedlistpalindrome l1=new Linkedlistpalindrome();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.addFirst(2);
		l1.addFirst(1);
//	l1.addFirst(5);
		l1.print();
		
		System.out.println(l1.palindrome());
	}
}
