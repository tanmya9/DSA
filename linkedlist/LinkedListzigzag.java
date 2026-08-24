class LinkedListzigzag
{
  public static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
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
  public void zigZag()
  {
    //find mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
    }
    Node mid=slow;

    //reversing
    Node prev=null;
    Node curr=mid.next;
    mid.next=prev;
    Node next;
    while(curr!=null)
    {
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }

    //zigzag merge
    Node left=head;
    Node right= prev;
    Node nextL, nextR;
    while(left!=null && right!=null)
    {
      nextL=left.next;
      left.next=right;
      nextR=right.next;
      right.next=nextL;

      left=nextL;
      right=nextR;
    }
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
		LinkedListzigzag ll=new LinkedListzigzag();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.print();
		ll.zigZag();
		ll.print();
	}
}
