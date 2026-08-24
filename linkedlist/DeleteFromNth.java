class DeleteFromNth
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

  public void deleteFromNth(int n)
  {
    //calculating size
    int size = 0;
    Node temp = head;
    while(temp!=null)
    {
      temp=temp.next;
      size++;
    }
    if(size==n)
    {
      head=head.next;
      return;
    }
    int i=1;
    Node prev=head;
    int itoEnd=size-n;
    while(i<itoEnd)
    {
      prev=prev.next;
      i++;
    }
    prev.next=prev.next.next;
    return;
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
    DeleteFromNth ll=new DeleteFromNth();
    l1.addFirst(4);
		l1.addFirst(3);
		l1.addFirst(2);
		l1.addFirst(1);
		l1.print();
		
		l1.DeletefromNth(2);
		l1.print();
  }
}
