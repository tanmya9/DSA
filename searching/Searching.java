class Searching
{
	public static int binarySearch(int num[], int key)
	{
		int start=0,end=num.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(num[mid]==key)
			{
				return mid;
			}
			if(num[mid]>key)
			{
				end=mid-1;
			}
			if(num[mid]<key)
			{
				start=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int num[]= {10,3,5,8,23,45,12};
		int key=45;
		System.out.println("Element found at index "+binarySearch(num,key));
		
//		int result=binarySearch(num,key);
//		if(result==-1)
//		{
//			System.out.println("Not Found");
//
//		}
//		else
//		{
//			System.out.println("Element found at index "+result);
//
//		}
	}
	
}
