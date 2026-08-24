class RecursiveSearch
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

  //1 helper function, 1 main function
  public int recurSearch(int key)
  {
    return helper(Node head, int key);
  }

  public int helper(Node head, int key)
  {
    if(head==null)
    {
      return -1;
    }
    if(head.data==key)
    {
      return 0;
    }
    //if not found, searching for the next node
    int idx=helper(head.next, key);
    if(idx==-1)
    {
      return -1;
    }
    return idx+1;
  }
  public static void main(String args[])
	{
		RecursiveSearch l1=new RecursiveSearch();
		l1.addFirst(2);
		l1.addFirst(1);
    l1.addFirst(3);
    l1.addFirst(4);
		l1.print();
		System.out.println(l1.recurearch(3));
}
