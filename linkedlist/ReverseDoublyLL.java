  classReverseDoublyLL
  {
    public static Node(int data)
    {
      int data;
      Node next;
      Node prev;
      public Node(int data)
      {
        this.data=data;
        this.next=null;
        this.prev=null;
      }
    }
    public static Node head;
    public static Node tail;
    public static int size; //for size of linkedlist
    public void addFirst(int data)
  	{
  		Node newNode=new Node(data);
  		if(head==null)
  		{
  			head=tail=newNode;
  			return;
  		}
  		newNode.next=head;
  		head.prev=newNode;
  		head=newNode;
	  }

    public void print()
  	{
  		Node temp=head;
  		while(temp!=null)
  		{
  			System.out.print(temp.data+ "<->");
  			temp=temp.next;
  		}
  		System.out.println("null");
  	}
    public void reverse()
    {
      Node prev=null;
      Node curr=head;
      Node next;
      while(curr!=null)
      {
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
      }
      head=prev;
    }
    public static void main(String args[])
  	{
  		ReverseDoublyLL ll=new ReverseDoublyLL();
  		ll.addFirst(1);
  		ll.addFirst(2);
  		ll.addFirst(3);
  		ll.addFirst(4);
  		ll.print();
  		
  		ll.reverse();
  		ll.print();
	  }
  }
