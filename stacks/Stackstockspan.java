////import java.util.*;
////public class Stackstockspan {
////	public static void stockSpan(int stocks[], int span[])
////	{
////		Stack<Integer> s=new Stack<>();
////		span[0]=1; //making first index of span result to 1
////		s.push(0); //pushing index into stack
////		for(int i=1;i<stocks.length;i++)
////		{
////			int currPrice=stocks[i];
////			while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
////				s.pop();
////			}
////			if(s.isEmpty()) {
////				span[i]=i+1;
////			}
////			else
////			{
////				int prevHigh=s.peek();
////				span[i]=i-prevHigh;
////			}
////			s.push(i);
////		}
////	}
////	public static void main(String args[])
////	{
////		int stocks[]= {100,80,60,70,60,85,100};
////		int span[]=new int[stocks.length]; //stores result
////		stockSpan(stocks, span);
////		for(int i=0;i<stocks.length;i++)
////		{
////			System.out.println(span[i]+" ");
////		}
////	}
////}
//
//
//import java.util.*;
//class Stackstockspan{
//	public static void stockSpan(int stocks[], int span[])
//	{
//		Stack<Integer> s=new Stack<>();
//		span[0]=1; //fix
//		s.push(0);
//		for(int i=1;i<stocks.length;i++)
//		{
//			int currPrice=stocks[i];
//			while(!s.isEmpty() && currPrice>stocks[s.peek()]) {
//				s.pop();
//			}
//			if(s.isEmpty())
//			{
//				span[i]=i+1;
//			}
//			else
//			{
//				int prevHigh=s.peek();
//				span[i]=i-prevHigh;
//			}
//			s.push(i);
//		}
//	}
//	public static void main(String args[])
//	{
//		int stocks[]= {100,80,60,70,60,85,100};
//		int span[]=new int[stocks.length];
//		stockSpan(stocks, span);
//		for(int i=0;i<stocks.length;i++)
//		{
//			System.out.println(span[i]+" ");
//		}
//	}
//}
package stacks;
import java.util.*;
class Stackstockspan
{
	public static void stockSpan(int stocks[], int span[])
	{
		Stack<Integer> s=new Stack<>(); //to store prevHigh (immediate greater values piche se)
		span[0]=1; //storing span=1 at index 0
		s.push(0); //pushing index 0 in the stack
		for(int i=1;i<stocks.length;i++) //loop to traverse through the stock
		{
			int currPrice=stocks[i];
			while(!s.isEmpty()&& currPrice > stocks[s.peek()])
			{
				s.pop();
			}
			if(s.isEmpty()) {
				span[i]=i+1;
			}
			else
			{
				int prevHigh=s.peek(); //the top element of stack becomes prevHigh
				span[i]=i-prevHigh;
			}
			s.push(i);
		}
	}
	public static void main(String args[])
	{
		int stocks[]= {100,85,60,75,80,87};
		int span[]=new int[stocks.length];
		stockSpan(stocks, span);
		for(int i=0;i<stocks.length;i++)
		{
			System.out.println(span[i]+"");
		}
	}
}