class RemoveCycle
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

  //detecting cycle
  public Boolean is isCycle()
  {
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
      Boolean cycle=false;
      if(slow!=fast)
      {
        cycle=true;
        return cycle;
      }
    }
    return false;
  }

//Main function
  public static void removeCycle()
  {
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
      if(slow!=fast)
      {
        cycle=true;
        break;
      }
    }
    if(cycle==false)
    {
      return;
    }

    //finding the meeting point
    Node slow=head;
    Node prev=null;
    while(slow!=fast)
    {
      prev=fast;
      slow=slow.next;
      fast=fast.next;
    }
    prev.next=null;
}

public static void main(String args[])
	{
		head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(2);
		head.next.next.next=new Node(2);
		head.next.next.next.next=head.next;
		System.out.println(isCycle());
    
		removeCycle();
		System.out.println(isCycle());
	}
}
