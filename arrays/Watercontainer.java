////Bruteforce approach TC=O(n*n)
//import java.util.ArrayList;
//class Watercontainer
//{
//	public static int calcWater(ArrayList<Integer> height)
//	{
//		int maxwater=0;
//		for(int i=0;i<height.size();i++)
//		{
//			for(int j=0;j<height.size();j++)
//			{
//				int width=j-i;
//				int ht=Math.min(height.get(i), height.get(j));
//				int currwater=width*ht;
//				maxwater=Math.max(maxwater, currwater);
//			}
//		}
//		return maxwater;
//	}
//	public static void main(String args[])
//	{
//		ArrayList<Integer> height=new ArrayList<>();
//		height.add(1);
//		height.add(8);
//		height.add(6);
//		height.add(2);
//		height.add(5);
//		height.add(4);
//		height.add(8);
//		height.add(3);
//		height.add(7);
//		
//		System.out.println(calcWater(height));
//	}
//}


//Optimised
//import java.util.*;
//class Watercontainer
//{
//	public static int calcWater(ArrayList<Integer> height)
//	{
//		int maxwater=0;
//		int leftPointer=0;
//		int rightPointer=height.size()-1;
//		while(leftPointer < rightPointer)
//		{
//			int width=rightPointer - leftPointer;
//			int ht=Math.min(height.get(leftPointer), height.get(rightPointer));
//			int currwater=width*ht;
//			maxwater=Math.max(maxwater, currwater);
//			
//			if(height.get(leftPointer) < height.get(rightPointer))
//			{
//				leftPointer++;
//			}
//			else
//			{
//				rightPointer--;
//			}
//		}
//		
//		return maxwater;
//	}
//	public static void main(String args[])
//	{
//		ArrayList<Integer> height=new ArrayList<>();
//		height.add(1);
//		height.add(8);
//		height.add(6);
//		height.add(2);
//		height.add(5);
//		height.add(4);
//		height.add(8);
//		height.add(3);
//		height.add(7);
//		
//		System.out.println(calcWater(height));
//	}
//}