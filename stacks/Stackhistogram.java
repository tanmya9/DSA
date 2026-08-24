//import java.util.*;
//public class Stackhistogram {
//	public static void maxArea(int arr[])
//	{
//		Stack<Integer> s=new Stack<>();
//		int nextSmallerR[]=new int[arr.length];
//		int nextSmallerL[]=new int[arr.length];
//		int maxArea=0;
////		finding next smaller right
//		for(int i=arr.length-1;i>=0;i--) //traversing from right to left
//		{
//			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) //stack me jo element hai agar wo bada hai array ke current element se
//			{
//				s.pop();
//			}
//			if(s.isEmpty()) //stack empty, toh smaller right= total no of elements in the array
//			{
//				nextSmallerR[i]=arr.length;
//			}
//			else
//			{
//				nextSmallerR[i]=s.peek();
//			}
//			s.push(i);
//		}
//		
////		finding next smaller left
//		s=new Stack<>();
//		for(int i=0;i<arr.length;i++)
//		{
//			while(!s.isEmpty() && arr[s.peek()]>=arr[i])
//			{
//				s.pop();
//			}
//			if(s.isEmpty()) {
//				nextSmallerL[i]= -1;
//			}
//			else //stack me jo element hai vo chota hai array ke current element se
//			{
//				nextSmallerL[i]=s.peek(); //stack ka top element is pushed into the array
//			}
//			s.push(i);
//		}
//		
////		calculating area width=NextsmallR-nextSmallerL-1
//		for(int i=0;i<arr.length;i++)
//		{
//			int height=arr[i];
//			int width=nextSmallerR[i] - nextSmallerL[i] -1;
//			int currArea=height*width;
//			
//			maxArea=Math.max(maxArea, currArea);
//		}
//		
//		System.out.println("Maximum area of hsitogram is "+ maxArea);
//		
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {2,1,5,6,2,3};
//		maxArea(arr);
//	}
//}
package stacks;

import java.util.*;
class Stackhistogram
{
	public static void maxArea(int arr[])
	{
		Stack<Integer> s=new Stack<>(); //creating a new stack to store nextSmallerR and nextSmallerL
		 int nextSmallerR[]=new int[arr.length];
		 int nextSmallerL[]=new int[arr.length];
		 
		 int area=0;
		 
		 //finding next smaller right
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 while(!s.isEmpty() && arr[s.peek()]>=arr[i])
			 {
				 s.pop();
			 }
			 if(s.isEmpty()) {
				 nextSmallerR[i]=arr.length;
			 }
			 else
			 {
				 nextSmallerR[i]=s.peek();
			 }
			 s.push(i);
		 }
		 
		 //finding next smaller left
		 for(int i=0;i<arr.length;i++)
		 {
			 while(!s.isEmpty() && arr[s.peek()]>=arr[i])
			 {
				 s.pop();
			 }
			 if(s.isEmpty()) {
				 nextSmallerL[i]= -1;
			 }
			 else
			 {
				 nextSmallerL[i]=s.peek();
			 }
			 s.push(i);
		 }
		 
		 //calculating max area
		 for(int i=0;i<arr.length;i++)
		 {
			 int width=nextSmallerR[i] - nextSmallerL[i] - 1;
			 int currArea=arr[i]*width; //calculates the area for each element
			 area=Math.max(area, currArea); //stores the previous area and compares the previous area with the new area
		 }
		 System.out.println("Maximum area of histogram is: "+area);
	}
	public static void main(String args[])
	{
		int arr[]= {2,1,5,6,2,3};
		maxArea(arr);
	}
}