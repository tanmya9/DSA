//class Sortingques
//{
//	public static void bubble(int num[])
//	{
//		for(int turn=0;turn<num.length-1;turn++)
//		{
//			for(int x=0; x<num.length-1-turn; x++)
//			{
//				if(num[x]<num[x+1])
//				{
//					int temp=num[x];
//					num[x]=num[x+1];
//					num[x+1]=temp;
//				}
//			}
//		}
//	}
//	
//	public static void print(int num[])
//	{
//		for(int x=0;x<num.length;x++)
//		{
//			System.out.print(num[x]+" ");
//		}
//	}
//	public static void main(String args[])
//	{
//		int num[]= {3,6,2,1,8,7,4,5,3,1};
//		bubble(num);
//		print(num);
//	}
//}

//class Sortingques
//{
//	public static void selection(int num[])
//	{
//		for(int x=0;x<num.length-1;x++)
//		{
//			int minindex=x;
//			for(int y=x+1;y<num.length;y++)
//			{
//				if(num[minindex]<num[y])
//				{
//					minindex=y;
//				}
//			}
//			int temp=num[x];
//			num[x]=num[minindex];
//			num[minindex]=temp;
//		}
//	}
//	
//	public static void print(int num[])
//	{
//		for(int x=0;x<num.length;x++)
//		{
//			System.out.print(num[x]+" ");
//		}
//	}
//	public static void main(String args[])
//	{
//		int num[]= {3,6,2,1,8,7,4,5,3,1};
//		selection(num);
//		print(num);
//	}
//}

//class Sortingques
//{
//	public static void insertion(int num[])
//	{
//		for(int i=0;i<num.length-1;i++)
//		{
//			for(int j=i+1;j>0;j--) //j checks on its left thats why it is moving backwards
//			{
//				if(num[j]>num[j-1])
//				{
//					int temp=num[j];
//					num[j]=num[j-1];
//					num[j-1]=temp;
//				}
//				else
//				{
//					break;
//				}
//			}
//		}
//	}
//	public static void print(int num[])
//	{
//		for(int x=0;x<num.length;x++)
//		{
//			System.out.print(num[x]+" ");
//		}
//	}
//	public static void main(String args[])
//	{
//		int num[]= {3,6,2,1,8,7,4,5,3,1};
//		insertion(num);
//		print(num);
//	}	
//}

class Sortingques
{
	public static void countsort(int num[])
	{
		int largest=Integer.MIN_VALUE;
		for(int x=0;x<num.length;x++)
		{
			largest=Math.max(largest, num[x]);
		}
		
		int count[]=new int[largest+1];
		for(int x=0;x<num.length;x++)
		{
			count[num[x]]++;
		}
		
		int j=0;
		for(int x=count.length-1;x>=0;x--)
		{
			while(count[x]>0)
			{
				num[j]=x;
				count[x]--;
				j++;
			}
		}
	}
	
	public static void print(int num[])
	{
		for(int x=0;x<num.length;x++)
		{
			System.out.print(num[x]+" ");
		}
	}
	public static void main(String args[])
	{
		int num[]= {3,6,2,1,8,7,4,5,3,1};
		countsort(num);
		print(num);
	}
}