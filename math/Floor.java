//Floor= find greatest number in the array which is smaller or equal to the key
class Floor
{
	public static int checkCeil(int arr[], int key)
	{
		int si=0, ei=arr.length-1;
		while(si<=ei)
		{
			int mid=(si+ei)/2;

			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]<key)
			{
				si=mid+1;
			}
			else
			{
				ei=mid-1;
			}
		}
		return ei;
	}
	public static void main(String args[])
	{
		int arr[]= {2,3,5,9,14,16,18};
		System.out.println(checkCeil(arr, 15));
	}
}