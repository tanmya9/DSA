package Queues;
import java.util.*;
public class BinaryNos {
	
	public static void printBinary(int n)
	{
		Queue<String> q=new LinkedList<>();
		q.add("1"); //add 1 first in the queue
		
		while(n-- >0) //runs till n becomes 0
		{
			String s=q.remove(); //removes 1st element from queue and stores it in s
			System.out.print(s+" "); //prints s
			
			q.add(s+"0"); //add 0 in the removed element and add it in the queue 10
			q.add(s+"1"); //add 1 in the removed element and add it in the queue 11
		}
	}
	public static void main(String args[])
	{
		BinaryNos b=new BinaryNos();
		b.printBinary(5);
	}
}
