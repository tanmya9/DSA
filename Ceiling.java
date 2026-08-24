//ceiling number= find the smallest number which is greater than or equal to key
//class Ceiling
//{
//	public static int checkCeil(int arr[], int key)
//	{
//		int si=0, ei=arr.length-1;
//		while(si<=ei)
//		{
//			int mid=(si+ei)/2;
//
//			if(arr[mid]==key)
//			{
//				return mid;
//			}
//			else if(arr[mid]<key)
//			{
//				si=mid+1;
//			}
//			else
//			{
//				ei=mid-1;
//			}
//		}
//		return si;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {2,3,5,9,14,16,18};
//		System.out.println(checkCeil(arr, 15));
//	}
//}


class Ceiling
{
	public static char checkCeil(char letters[], char key)
	{
		int si=0, ei=letters.length-1;
		while(si<=ei)
		{
			int mid=si+(ei-si)/2;
			if(key < letters[mid]) //looks for element in the left half as we know array is in ascending order and Since we are looking for the smallest letter that is strictly greater than target, we continue searching on the left half.
			{
				ei=mid-1; 
			}
			else
			{
				si=mid+1;
			}
		}
		return letters[si % letters.length];
	}
	public static void main(String args[])
	{
		char letters[]= {'c','f','j'};
		System.out.println(checkCeil(letters, 'c'));
	}
}