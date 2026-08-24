class LLOddEven
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

public static Node oddEven(Node head)
  {
	  //pointers for result list
	  Node resStart=null;
	  Node resEnd=null;
	  
	  //Pointers for original list
	  Node curr=head;
	  Node prev=null;
	  
	  //moving even nos from original to result list
	  while(curr!=null)
	  {
		  //if curr is even
		  if(curr.data%2==0)
		  {
			  //removing from original
			  if(prev!=null)
			  {
				  prev.next=curr.next;
			  }
			  else
			  {
				  head=curr.next;
			  }
			  
			  
			  //adding curr to result list
			  if(resStart==null)
			  {
				  resStart=curr;
				  resEnd=resStart;
			  }
			  else
			  {
				  resEnd.next=curr;
				  resEnd=resEnd.next;
			  }
			  
			  //move to next node
			  curr=curr.next;
		  }
		  
		  //curr is odd
		  else
		  {
			  prev=curr;
			  curr=curr.next;
		  }
	  }
	  if(resStart==null)
	  {
		  return head; //if no even nodes return original list
	  }
	  
	  //append original list to result list
	  resEnd.next=head;
	  return resStart;
		  
  }
  //function to print the linkedlist
  void printList()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
    System.out.println();
  }
  public static void main(String[] args)
  {
        LLOddEven list=new LLOddEven();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(4);
        list.head.next.next.next=new Node(7);
        list.head.next.next.next.next=new Node(8);
        list.printList();
        
        head=list.oddEven(head);
        list.printList();
    }
}
