//leetcode ans
//class Firstandlastoccur
//{
//	//calculating first occurence
//	public static int firstOccur(int arr[], int target)
//	{
//		int ans=-1;
//		int start=0;
//		int end=arr.length-1;
//		while(start<=end)
//		{
//			int mid=start+(end-start)/2;
//			if(arr[mid]==target)
//			{
//				ans=mid;
//				end=mid-1; //moving left for first occurence
//			}
//			else if(target > arr[mid])
//			{
//				start=mid+1;
//			}
//			else
//			{
//				end=mid-1;
//			}
//		}
//		return ans;
//	}
//	
//	//last occurence
//	public static int lastOccur(int arr[], int target)
//	{
//		int ans=-1;
//		int start=0;
//		int end=arr.length-1;
//		while(start<=end)
//		{
//			int mid=start+(end-start)/2;
//			if(arr[mid]==target)
//			{
//				ans=mid;
//				start=mid+1; //moving right for last occurence
//			}
//			else if(target > arr[mid])
//			{
//				start=mid+1;
//			}
//			else
//			{
//				end=mid-1;
//			}
//		}
//		return ans;
//	}
//	public static void main(String args[])
//	{
//		int arr[]= {1,3,4,3,3,3,3,3,3,8,9};
//		int first=firstOccur(arr,0);
//		int last=lastOccur(arr,0);
//		
//		int[] ans=new int[]{first,last};
//		System.out.println(ans);
//	}
//}

//leetcode another ans
package strings;
//class Solution {
//    public int firstOccur(int arr[], int target)
//	{
//		int ans=-1;
//		int start=0;
//		int end=arr.length-1;
//		while(start<=end)
//		{
//			int mid=start+(end-start)/2;
//			if(arr[mid]==target)
//			{
//				ans=mid;
//				end=mid-1; //moving left for first occurence
//			}
//			else if(target > arr[mid])
//			{
//				start=mid+1;
//			}
//			else
//			{
//				end=mid-1;
//			}
//		}
//		return ans;
//	}
//
//    public int lastOccur(int arr[], int target)
//	{
//		int ans=-1;
//		int start=0;
//		int end=arr.length-1;
//		while(start<=end)
//		{
//			int mid=start+(end-start)/2;
//			if(arr[mid]==target)
//			{
//				ans=mid;
//				start=mid+1; //moving right for last occurence
//			}
//			else if(target > arr[mid])
//			{
//				start=mid+1;
//			}
//			else
//			{
//				end=mid-1;
//			}
//		}
//		return ans;
//	}
//    public int[] searchRange(int[] nums, int target) {
//        int first=firstOccur(nums, target);
//        int last=lastOccur(nums, target);
//
//        return new int[]{first,last};
//    }
//}

//final leetcode ans
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first[] = firstOccur(nums, target); 
        int last[] = lastOccur(nums, target);   
        int res[] = {first[0], last[0]}; 
        return res;
    }

    public int[] firstOccur(int nums[], int target)
	{
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(nums[mid]==target)
			{
				ans=mid;
				end=mid-1; //moving left for first occurence
			}
			else if(target > nums[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
        int res[]={ans};
		return res;
	}

    //last occurence
	public int[] lastOccur(int nums[], int target)
	{
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(nums[mid]==target)
			{
				ans=mid;
				start=mid+1; //moving right for last occurence
			}
			else if(target > nums[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
         int res[]={ans};
		return res;
	}
}