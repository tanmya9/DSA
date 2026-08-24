class MergeSort
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
        public static Ndoe tail;

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
        //helper 
        public Node getMid(Node head)
        {
            Nodoe slow=head;
            Node fast=head;
            while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
            return slow;
        }
        
        //main function
        public Node mergeSort(Node head)
        {
            if(head==null || head.next==null)
            {
                return head;
            }
            //find mid
            Node mid=getMid(Node head);

            //divide into left and right halves
            Node righthead=mid.next;
            mid.next=null;
            Node lefthalf=mergeSort(head);
            Node righthalf=mergeSort(head);
            return merge(lefthalf, righthalf);
        }

        //helper
        public Node merge(Node head1, Node head2)
        {
            Ndoe mergedLL=new Node(-1); //creating a new linkedlist
            Node temp=mergedLL; //initialising the first node with -1
            while(head1!=null && head2!=null)
                {
                    if(head1.data<=head2.data)
                    {
                        temp.next=head1;
                        head1=head1.next;
                        temp=temp.next;
                    }
                    else
                    {
                        temp.next=head2;
                        head2=head2.next;
                        temp=temp.next;
                    }
                }
            while(head1!=null)
                {
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }
            while(head2!=null)
                {
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next;
                }

            return mergedLL.next;
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
            MergedSort ll=new MergeSort();
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            ll.print();

            ll.head=ll.mergeSort((ll.head);
            ll.print();
        }
    }
