////Bruteforce
//import java.util.*;
//class Pairsum
//{
//	public static void calcTarget(ArrayList<Integer> list, int target)
//	{
//		for(int i=0;i<list.size();i++)
//		{
//			for(int j=i+1;j<list.size();j++)
//			{
//				if((list.get(i) + list.get(j)) == target)
//				{
//					System.out.print(list.get(i)+ ","+ list.get(j));
//					//return true;
//				}
//			}
//			System.out.println();
//		}
//		//return false;
//	}
//	public static void main(String args[])
//	{
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(0);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		calcTarget(list, 5);
//		//System.out.println(calcTarget(list, 5));
//	}
//}


//Optimised 2 pointer approach
import java.util.*;
class Pairsum
{
	public static boolean pairSum(ArrayList<Integer> list, int target)
	{
		int leftP=0;
		int rightP=list.size()-1;
		while(leftP<rightP)
		{
			if(list.get(leftP)+list.get(rightP)==target)
			{
				return true;
			}
			else if(list.get(leftP) + list.get(rightP) < target)
			{
				leftP++;
			}
			else
			{
				rightP--;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		ArrayList<Integer> list= new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		System.out.println(pairSum(list, 50));
		
	}
	
}