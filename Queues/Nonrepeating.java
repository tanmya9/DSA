//package Queues;
//import java.util.*;
//public class Nonrepeating {
//	public static void printNonRepeating(String str)
//	{
//		int freq[]=new int[26]; // to track frequency from a-z
//		Queue<Character> q=new LinkedList<>();
//		
//		for(int i=0;i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			q.add(ch); //adding it in the queue
//			freq[ch-'a']++; //any char-'a' will give the index of that char
//			
//			//checking queue from THE FRONT if 1st non repeating element exists
//			while(!q.isEmpty() && freq[q.peek()-'a']>1)
//			{
//				q.remove();
//			} //if this loop ends then there can be 2 cases:
//			// queue has become empty
//			//freq of the character has become greater than 1
//			
//			if(q.isEmpty())
//			{
//				System.out.print(-1+" ");
//			}
//			else
//			{
//				System.out.print(q.peek()+" ");
//			}
//		}
//		System.out.println();
//	}
//	public static void main(String args[])
//	{
//		String str="aabccxb";
//		printNonRepeating(str);
//	}
//}


package Queues;
import java.util.*;
public class Nonrepeating
{
	public static void findNonRepeating(String str)
	{
		Queue<Character> q=new LinkedList<>();
		int freq[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			q.add(ch);
			freq[ch-'a']++;
			
			while(!q.isEmpty() && freq[q.peek()-'a']>1)
			{
				q.remove();
			}
			
			if(q.isEmpty()) {
				System.out.print(-1+" ");
			}
			else
			{
				System.out.print(q.peek()+" ");
			}
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		String str="aabccxb";
		findNonRepeating(str);
	}
}