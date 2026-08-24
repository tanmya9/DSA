class LinearSearch
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
		Node newNode= new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}

  public int search(int key)
  {
    Node temp=head;
    int i=0;
    while(temp!=null)
    {
      if(temp.data==key)
      {
        return i;
      }
      temp=temp.next;
      i++;
    }
    return -1;
  }
  public void print()
	{
		if(head==null)
		{
			System.out.println("LL is empty");
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
		LinearSearch l1=new LinearSearch();
		l1.addFirst(2);
		l1.addFirst(1);
    l1.addFirst(3);
    l1.addFirst(4);
		l1.print();
		System.out.println(l1.search());
		
	}
}
