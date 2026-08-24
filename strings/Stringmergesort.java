package strings;
//class Stringmergesort
//{
//	public static void mergeSort(String arr[],int si, int ei)
//	{
//		if(si>=ei)
//		{
//			return;
//		}
//		int mid=si+(ei-si)/2;
//		
//		mergeSort(arr,si,mid);
//		mergeSort(arr,mid+1,ei);
//		merge(arr, si, ei, mid);
//	}
//	public static void merge(String arr[], int si, int ei, int mid)
//	{
//		String temp[]=new String[ei-si+1];
//		
//		int i=si;
//		int j=mid+1;
//		int k=0;
//		
//		while(i<=mid && j<=ei)
//		{
//			if(arr[i].compareTo(arr[j]) <= 0)
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
//		for(i=si,k=0;k<temp.length;i++,k++)
//		{
//			arr[i]=temp[k];
//		}
//	}
//	public static void print(String arr[])
//	{
//		for(int x=0;x<arr.length;x++)
//		{
//			System.out.print(arr[x]+" ");
//		}
//		System.out.println();
//	}
//	public static void main(String args[])
//	{
//		String arr[]= {"sun","earth","mars","moon"};
//		mergeSort(arr,0,arr.length-1);
//		print(arr);
//	}
//}

//example of merge sort
//class Stringmergesort
//{
//	public static int[] mergeSort(int arr[], int si, int ei)
//	{
//		if(si==ei)
//		{
//			int ba[]=new int[1];
//			ba[0]=arr[si];
//			return ba;
//		}
//		int mid=si+(ei-si)/2;
//		
//		int left[]=mergeSort(arr,si,mid);
//		int right[]=mergeSort(arr,mid+1,ei);
//		int result[]=merge(left,right);
//		
//		return result;
//	}
//	public static int[] merge(int left[],int right[])
//	{
//		int n=left.length;
//		int m=right.length;
//		int result[]=new int[n+m];
//		
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<n && j<m )
//		{
//			if(left[i]<right[j])
//			{
//				result[k]=left[i];
//				i++;
//				k++;
//			}
//			else
//			{
//				result[k]=right[j];
//				j++;
//				k++;
//			}
//		}
//		while(i<n)
//		{
//			result[k]=left[i];
//			i++;
//			k++;
//		}
//		while(j<m)
//		{
//			result[k]=right[j];
//			j++;
//			k++;
//		}
//		
//		return result;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {5,7,3,2,9,10,4};
//		int result[]=mergeSort(arr,0,arr.length-1);
//		for(int x=0;x<result.length;x++)
//		{
//			System.out.print(result[x]+" ");
//		}
//		System.out.println();
//	}
//}


//class Stringmergesort
//{
//	public static String[] mergeSort(String arr[], int si, int ei)
//	{
//		if(si==ei)
//		{
//			String ba[]=new String[1];
//			ba[0]=arr[si];
//			return ba;
//		}
//		int mid=si+(ei-si)/2;
//		
//		String left[]=mergeSort(arr,si,mid);
//		String right[]=mergeSort(arr,mid+1,ei);
//		String result[]=merge(left,right);
//		
//		return result;
//	}
//	public static String[] merge(String left[],String right[])
//	{
//		int n=left.length;
//		int m=right.length;
//		String result[]=new String[n+m];
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<n && j<m)
//		{
//			if(left[i].compareTo(right[j])<=0)
//			{
//				result[k]=left[i];
//				i++;
//				k++;
//			}
//			else
//			{
//				result[k]=right[j];
//				j++;
//				k++;
//			}
//		}
//		while(i<n)
//		{
//			result[k]=left[i];
//			i++;
//			k++;
//		}
//		while(j<m)
//		{
//			result[k]=right[j];
//			j++;
//			k++;
//		}
//		return result;
//	}
//	public static void main(String args[])
//	{
//		String arr[]= {"sun","mars","earth","moon"};
//		String result[]=mergeSort(arr,0,arr.length-1);
//		for(int x=0;x<result.length;x++)
//		{
//			System.out.print(result[x]+" ");
//		}
//		System.out.println();
//	}
//}

//using separate compare function
class Stringmergesort
{
	public static String[] mergeSort(String arr[], int si, int ei)
	{
		if(si==ei)
		{
			String ba[]=new String[1];
			ba[0]=arr[si];
			return ba;
		}
		int mid=si+(ei-si)/2;
		
		String left[]=mergeSort(arr,si,mid);
		String right[]=mergeSort(arr,mid+1,ei);
		String result[]=merge(left,right);
		
		return result;
	}
	public static String[] merge(String left[],String right[])
	{
		int n=left.length;
		int m=right.length;
		String result[]=new String[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m)
		{
			if(compareAlphabets(left[i],right[j]))
			{
				result[k]=left[i];
				i++;
				k++;
			}
			else
			{
				result[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<n)
		{
			result[k]=left[i];
			i++;
			k++;
		}
		while(j<m)
		{
			result[k]=right[j];
			j++;
			k++;
		}
		return result;
	}
	public static boolean compareAlphabets(String left,String right)
	{
		if(left.compareTo(right)<=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		String arr[]= {"sun","earth","earths","moon"};
		String result[]=mergeSort(arr,0,arr.length-1);
		for(int x=0;x<result.length;x++)
		{
			System.out.print(result[x]+" ");
		}
		System.out.println();
	}
}