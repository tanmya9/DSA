class Backtrackarr
{
	public static void changeArr(int arr[], int i, int value)
	{
		//base case
		if(i==arr.length)
		{
			printArr(arr); //prints original array
			return;
		}
		//recursion
		arr[i]=value;
		changeArr(arr,i+1,value+1);
		arr[i]=value-2; //arr[i]=arr[i]-2, backtracking
	}
	public static void printArr(int arr[]) //prints array with new values
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr[]=new int[5]; //creating an empty array
		changeArr(arr,0,1);
		printArr(arr);
	}
}