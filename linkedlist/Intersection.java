class Intersection
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

  public Node getIntersection(Node head1, Node head2)
  {
    while(head2!=null)
    {
       Node temp=head1;
      while(temp!=null)
      {
        if(temp==head2)
        {
          return head2;
        }
        temp=temp.next;
      }
      head2=head2.next;
    }
    return null;
  }

  public static void main(String args[])
  {
    Intersection list=new Intersection();
    Node head1 = new Node(1);
    Node head2 = new Node(3);

    Node newnode=new Node(2);
    head1.next=newnode;

    newnode = new Node(5);
    head1.next.next=newnode;

    newnode = new Node(4);
    head2.next=newnode;
    
    newnode = new Node(6);
    head1.next.next.next=newnode;
    head2.next.next=newnode;

    int intersec=list.getIntersection(head1, head2);
    if(intersec==null)
    {
      System.out.println("There is no intersection in the list");
    }
    else
    {
      System.out.println("Intersection point is: "+intersec.data);
    }
  }
}
