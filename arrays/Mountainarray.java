class Mountainarray
{
	public static int findPeak(int arr[])
	{
		// start and end will always find the max element in the array
		int start=0,end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid] > arr[mid+1]) // we are in the dec part of array
			{
				end=mid; // may be the ans but still look at left
			}
			else
			{
				start=mid+1;
			}
			//at every point of time start and end try to find the best possible ans
		}
		// in the end when start==end and only one element is left then that is the max element
		return start;
	}
	public static void main(String args[])
	{
		int arr[]= {0,2,1,0};
		System.out.print(findPeak(arr));
	}
}