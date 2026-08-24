//class Staircase
//{
//	public static void staircaseSearch(int matrix[][], int key)
//	{
//		int row=0, col=matrix[0].length-1;
//		while(row<matrix.length && col>=0)
//		{
//			if(key==matrix[row][col])
//			{
//				System.out.println("Found at index (" + row + ", " + col + ")");
//				break;
////				return true;   //return is necessary here as it stops the iteration and prevents further execution of the loop
//			}
//			else if(key<matrix[row][col])
//			{
//				col--;
//			}
//			else
//			{
//				row++;
//			}
//		}
//		if(row==matrix.length || col<0)
//		{
//			System.out.println("Sorry element not found");
////			return false;
//		}
//	}
//	public static void main(String args[])
//	{
//		int matrix[][]= {{10,20,30,40},
//						 {15,25,35,45},
//						 {27,29,37,48},
//						 {32,33,39,50}};
//		int key=7;
//		staircaseSearch(matrix, key);
//	}
//}


//class Staircase
//{
//	public static boolean staircaseSearch(int matrix[][], int key)
//	{
//		int row=0, col=matrix[0].length-1;
//		while(row<=matrix.length-1 &&col>=0)
//		{
//			if(matrix[row][col]==key)
//			{
//				System.out.println("Found at index (" + row + "," + col + ")");
//				return true;
//			}
//			else if(key<matrix[row][col])
//			{
//				col--;
//			}
//			else
//			{
//				row++;
//			}
//		}
//		System.out.println("Sorry element not found");
//		return false;
//	}
//	public static void main(String args[])
//	{
//		int matrix[][]= {{10,20,30,40},
//						 {15,25,35,45},
//						 {27,29,37,48},
//						 {32,33,39,50}};
//		int key=29;
//		staircaseSearch(matrix, key);
//	}
//}

//class Staircase
//{
//	public static void staircaseSearch(int matrix[][], int key)
//	{
//		int row=0, col=matrix[0].length-1;
//		while(row<matrix.length &&col>=0)
//		{
//			if(key==matrix[row][col])
//			{
//				System.out.println("Found at (" + row + "," + col + ")");
//				break;
//			}
//			else if(key<matrix[row][col])
//			{
//				col--;
//			}
//			else
//			{
//				row++;
//			}
//		}
//		if(row==matrix.length || col<0)
//		{
//			System.out.println("Sorry element not found");
//		}
//	}
//	public static void main(String args[])
//	{
//		int matrix[][]={{10,20,30,40},
//						 {15,25,35,45},
//						 {27,29,37,48},
//						 {32,33,39,50}};
//		int key=90;
//		staircaseSearch(matrix,key);
//	}
//}

class Staircase
{
	public static boolean staircaseSearch(int matrix[][], int key)
	{
		int row=matrix.length-1, col=0;
		while(row>=0 && col<matrix[0].length)
		{
			if(key==matrix[row][col])
			{
				System.out.println("Found at (" + row + "," + col + ")");
				return true;
			}
			else if(key<matrix[row][col])
			{
				row--;
			}
			else
			{
				col++;
			}
		}
		System.out.println("Element not found");
		return false;
	}
	public static void main(String args[])
	{
		int matrix[][]={{10,20,30,40},
						 {15,25,35,45},
						 {27,29,37,48},
						 {32,33,39,50}};
		int key=29;
		staircaseSearch(matrix,key);
	}
}

