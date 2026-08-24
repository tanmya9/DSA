class SkipDeleteNodes
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

  public void skipDelete(int m, int n)
  {
    
    Node curr=head; //for traversing
    while(curr!=null)
    {
      //skipp M nodes
      for(int i=1; i<m && curr!=null; i++)
      {
        curr=curr.next;    
      }
      if(curr!=null)
      {
        return;
      }
      
      Node temp=curr.next; //for traversing from (m+1)th node
     //delete N nodes
    	for(int i=1; i<=n && temp!=null; i++)
        {
          temp=temp.next;    
        }
        //linking Mth node from (N+1)th node
        curr.next=temp;
        curr=temp;
    }
  }
  public static void main(String args[])
  {
    SkipMNodesDeleteNNodes list=new SkipMNodesDeleteNNodes();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(6);
		list.print();
		
		list.skipDelete(2, 2);
		list.print();
  }
}
