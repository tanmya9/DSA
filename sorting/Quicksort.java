//class Quicksort
//{
//	public static void quickSort(int arr[], int si, int ei)
//	{
//		if(si>=ei)
//		{
//			return;
//		}
//		//pivot will be the last element
//		
//		//Partition
//		int pindex=partition(arr,si,ei);//partition will return the index of pivot
//		quickSort(arr,si,pindex-1);
//		quickSort(arr,pindex+1,ei);
//	}
//	
//	//this method will return the index of pivot
//	public static  int partition(int arr[], int si, int ei)
//	{
//		int pivot=arr[ei];
//		int i=si-1;
//		for(int j=si;j<arr.length;j++)
//		{
//			if(arr[j]<pivot)
//			{
//				i++;
//				//Swap
//				int temp=arr[j];
//				arr[j]=arr[i];
//				arr[i]=temp;
//			}
//		}
//		i++;
//		int temp=pivot;
//		arr[ei]=arr[i]; //ei is the index of pivot
//		arr[i]=temp;
//		return i; //index of pivot
//	}
//	public static void printArr(int arr[])
//	{
//		for(int x=0;x<arr.length;x++)
//		{
//			System.out.print(arr[x]+" ");
//		}
//		System.out.println();
//	}
//	public static void main(String args[])
//	{
//		int arr[]={7,6,5,4,3,2,1,0};
//		quickSort(arr,0,arr.length-1);
//		printArr(arr);
//	}
//}


class Quicksort
{
	public static void quickSort(int arr[], int si, int ei)
	{
		if(si>=ei)
		{
			return;
		}
		//take pivot as the last element
		int pindex=partition(arr,si, ei);
		quickSort(arr,si,pindex-1);
		quickSort(arr,pindex+1,ei);
	}
	
	public static int partition(int arr[], int si, int ei)
	{
		int i=si-1;
		int pivot=arr[ei];
		for(int j=si;j<arr.length;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		i++;
		int temp=pivot;
		arr[ei]=arr[i];
		arr[i]=temp;
		
		return i;
	}
	public static void printArr(int arr[])
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr[]= {5,3,8,6,1,0,7,-1};
		quickSort(arr,0,arr.length-1);
		printArr(arr);
	}
}