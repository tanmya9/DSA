//class Inversioncount
//{
//	public static int inversionCount(int arr[])
//	{
//		int count=0;
//		for(int x=0;x<arr.length;x++)
//		{
//			for(int y=x+1;y<arr.length;y++)
//			{
//				if(arr[x]>arr[y])
//				{
//					count++;
//				}
//			}
//		}
//		return count;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {2,4,1,3,5};
//		System.out.println(inversionCount(arr));
//	}
//}


//class Inversioncount
//{
//	public static int mergeSort(int arr[], int si, int ei)
//	{
//		if(si>=ei)
//		{
//			return 0;
//		}
//		int mid=si+(ei-si)/2;
//			
//		int leftCount=mergeSort(arr,si,mid);
//		int rightCount=mergeSort(arr,mid+1,ei);
//		int inversion=merge(arr,si,ei,mid);
//			
//		return leftCount+rightCount+inversion;
//	}
//	public static int merge(int arr[], int si, int ei, int mid)
//	{
//		int temp[]=new int[ei-si+1];
//		
//		int i=si;
//		int j=mid+1;
//		int k=0;
//		int invCount=0;
//		while(i<=mid && j<=ei)
//		{
//			if(arr[i]<arr[j])
//			{
//				temp[k]=arr[i];
//				i++;
//				k++;
//			}
//			else
//			{
//				temp[k]=arr[j];
//				j++;
//				k++;
//				invCount+=(mid-i+1);
//			}
//		}
//		while(i<=mid)
//		{
//			temp[k]=arr[i];
//			i++;
//			k++;
//		}
//		while(j<=ei)
//		{
//			temp[k]=arr[j];
//			j++;
//			k++;
//		}
//		
//		for(k=0,i=si; k<temp.length;k++, i++)
//		{
//			arr[i]=temp[k];
//		}
//		return invCount;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {1,20,6,4,5};
//		System.out.println(mergeSort(arr,0,arr.length-1));
//	}
//}


class Inversioncount
{
	public static int mergeSort(int arr[], int si, int ei)
	{
		if(si>=ei) // if(si==ei)
		{
			return 0;
		}
		int mid=si+(ei-si)/2;
		
		int leftCount=mergeSort(arr,si,mid);
		int rightCount=mergeSort(arr,mid+1,ei);
		int invCount=merge(arr,si,mid,ei);
		
		return leftCount+rightCount+invCount;
	}
	
	public static int merge(int arr[], int si, int mid, int ei)
	{
		int temp[]=new int[ei-si+1];
		int i=si;
		int j=mid+1;
		int k=0;
		
		int count=0;
		while(i<=mid && j<=ei)
		{
			if(arr[i]<arr[j])
			{
				temp[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				temp[k]=arr[j];
				j++;
				k++;
				count=count+(mid-i+1);
			}
		}
		while(i<=mid)
		{
			temp[k]=arr[i];
			i++;
			k++;
		}
		while(j<=ei)
		{
			temp[k]=arr[j];
			j++;
			k++;
		}
		
		for(k=0,i=si;k<temp.length;k++,i++)
		{
			arr[i]=temp[k];
		}
		return count;
	}
	public static void main(String args[])
	{
		int arr[]= {1,20,6,4,5};
		System.out.println(mergeSort(arr,0,arr.length-1));
	}
}
