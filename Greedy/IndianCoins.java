//package Greedy;
//import java.util.*;
//public class IndianCoins {
//	public static void main(String args[])
//	{
//		Integer coins[]= {1,2,5,10,20,50,100,500,2000};
//		Arrays.sort(coins, Comparator.reverseOrder());
//		int countCoins=0;
//		int amount=590;
//		
//		ArrayList<Integer> ans=new ArrayList<>();
//		
//		for(int i=0;i<coins.length;i++)
//		{
//			if(coins[i]<=amount)
//			{
//				while(coins[i]<=amount)
//				{
//					countCoins++;
//					ans.add(coins[i]);
//					amount-=coins[i];
//
//				}
//			}
//		}
//		System.out.println("Total coins used "+countCoins);
//	}
//}


package Greedy;
import java.util.*;
public class IndianCoins
{
	public static void main(String args[])
	{
		Integer coins[]= {1,2,5,10,20,50,100,500,2000}; //arrays.sort works only on objects
		Arrays.sort(coins, Comparator.reverseOrder());
		
		int countCoins=0;
		int amount=590;
		
		for(int i=0;i<coins.length;i++)
		{
			while(coins[i]<=amount)
			{
				countCoins++;
				System.out.print(coins[i]+" ");
				amount-=coins[i];
			}
		}
		System.out.println();
		System.out.println("Total number of coins used "+countCoins);
	}
}