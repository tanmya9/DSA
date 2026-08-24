//class Mergesort
//{
//	public static void mergeSort(int arr[], int si, int ei)
//	{
//		if(si>=ei)
//		{
//			return;
//		}
//		int mid=si+(ei-si)/2;
//		mergeSort(arr,si,mid);
//		mergeSort(arr,mid+1,ei);
//		merge(arr, si, mid, ei);
//	}
//	public static void merge(int arr[], int si, int mid, int ei)
//	{
//		int temp[]=new int[ei-si+1];
//		int i=si;
//		int j=mid+1;
//		int k=0;
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
//			}
//		}
//		
//		while(i<=mid)
//		{
//			temp[k]=arr[i];
//			k++;
//			i++;
//			
//		}
//		while(j<=ei)
//		{
//			temp[k]=arr[j];
//			k++;
//			j++;
//			
//		}
//		
//		for(k=0, i=si; k<temp.length;k++, i++)
//		{
//			arr[i]=temp[k];
//		}
//	}
//	public static void print(int arr[])
//	{
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
//	
//	public static void main(String args[])
//	{
//		int arr[]= {2,6,9,3,5,10,1};
//		mergeSort(arr,0,arr.length-1);
//		print(arr);
//	}
//}


class Mergesort
{
	public static void mergeSort(int arr[], int si, int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int mid=si+(ei-si)/2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid+1, ei);
		merge(arr, si, mid, ei);
	}
	public static void merge(int arr[], int si, int mid, int ei)
	{
		int temp[]=new int[ei-si+1];
		int i=si; //to iterate left array
		int j=mid+1; //to iterate right array
		int k=0;
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
			}
		}
		
		while(i<=mid)
		{
			temp[k]=arr[i];
			k++;
			i++;
			
		}
		while(j<=ei)
		{
			temp[k]=arr[j];
			k++;
			j++;
		}
		//copying elements
		for(k=0,i=si; k<temp.length;k++, i++)
		{
			arr[i]=temp[k];
		}
	}
	//print method to print the array
	public static void printArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr[]= {2,4,7,1,3,9,7,12,10};
		mergeSort(arr,0,arr.length-1);
		printArr(arr);
	}
}


//class MergeSort
//{
//	public static int[] mergeSort(int arr[], int si, int ei)
//	{
//		if(si==ei)
//		{
//			int basearray[]=new int[1];
//			basearray[0]=arr[si];
//			return basearray;
//		}
//		int mid=si+(ei-si)/2;
//		int left[]=mergeSort(arr,si,mid);
//		int right[]=mergeSort(arr,mid+1,ei);
//		int res[]=merge(left,right);
//		return res;
//	}
//	public static int[] merge(int left[],int right[])
//	{
//		int n=left.length;
//		int m=right.length;
//		
//		int res[]=new int[n+m];
//		
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<n && j<m)
//		{
//			if(left[i]<right[j])
//			{
//				res[k]=left[i];
//				k++;
//				i++;
//			}
//			else
//			{
//				res[k]=right[j];
//				k++;
//				j++;
//			}
//		}
//		
//		while(i<n)
//		{
//			res[k]=left[i];
//			k++;
//			i++;
//		}
//		while(j<m)
//		{
//			res[k]=right[j];
//			k++;
//			j++;
//		}
//		return res;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {2,4,5,3,1,8,7,12,10};
//		int res[]=mergeSort(arr,0,arr.length-1);
//		for(int x=0;x<res.length;x++)
//		{
//			System.out.print(res[x]+" ");
//		}
//		System.out.println();
//
//	}
//}