//class Rotatedarray
//{
//	public static int search(int arr[], int si, int ei, int target)
//	{
//		if(si>ei) //Base case
//		{
//			return -1;
//		}
//		int mid=si+(ei-si)/2;
//		if(arr[mid]==target)
//		{
//			return mid;
//		}
//		if(arr[si]<=arr[mid]) //mid is on Line 1
//		{
//			if(arr[si]<=target && target<=arr[mid])
//			{
//				return search(arr, si,mid,target);
//			}
//			else
//			{
//				return search(arr, mid+1,ei,target);
//			}
//		}
//		else //mid value is on Line 2
//		{
//			if(arr[mid]<=target && target<=arr[ei])
//			{
//				return search(arr, mid+1, ei,target);
//			}
//			else
//			{
//				return search(arr, si, mid-1,target);
//			}
//		}
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {4,5,6,7,0,1,2};
//		int index=search(arr, 0, arr.length-1, 5);
//		System.out.println(index);
//	}
//}


class Rotatedarray
{
	public static int search(int arr[], int si, int ei, int target)
	{
		int mid=si+(ei-si)/2;
		
		if(si>ei)
		{
			return -1;
		}
		if(arr[mid]==target)
		{
			return mid;
		}
		//mid is on line 1
		if(arr[mid]>=arr[si])
		{
			if(arr[si]<=target && target<=arr[mid])
			{
				return search(arr,si,mid,target);
			}
			else
			{
				return search(arr,mid+1,ei, target);
			}
		}
		
		//mid is on line 2
		else
		{
			if(arr[mid]<=target && target<=arr[ei])
			{
				return search(arr, mid,ei, target);
			}
			else
			{
				return search(arr, si, mid-1, target);
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]= {4,5,6,7,0,1,2};
		System.out.println(search(arr,0,arr.length-1,10));
	}
}