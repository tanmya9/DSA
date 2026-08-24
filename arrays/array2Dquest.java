//class array2Dquest
//{
//	public static int printSeven(int matrix[][])
//	{
//		int count=0;
//		for(int x=0;x<matrix.length;x++)
//		{
//			for(int y=0;y<matrix[0].length;y++)
//			{
//				if(matrix[x][y]==7)
//				{
//					count++;
//				}
//			}
//		}
//		return count;
//	}
//	public static void main(String args[])
//	{
//		int matrix[][]={{7,7,8},
//						 {7,8,7}};
//		System.out.println(printSeven(matrix));
//	}
//}

//print sum of second row only
//class array2Dquest
//{
//	public static int printSecond(int matrix[][])
//	{
//		int row=1, col=0, sum=0;;
//		while(col<matrix[0].length)
//		{
//			System.out.print(matrix[row][col]+" ");
//			sum+=matrix[row][col];
//			col++;
//		}
//		System.out.println();
//		return sum;
//	}
//	public static void main(String args[])
//	{
//		int matrix[][]={{7,7,8,10},
//				 		{7,8,7,16},
//				 		{2,3,5,20},
//				 		{22,34,56,11}};
//		System.out.println("Sum is "+printSecond(matrix));
//	}
//}


//class array2Dquest
//{
//	public static void printTranspose(int matrix[][], int transpose[][])
//	{
//		int row=matrix.length, col=matrix[0].length;
//		
//		//original matrix
//		for(int x=0;x<row;x++)
//		{
//			for(int y=0;y<col;y++)
//			{
//				System.out.print(matrix[x][y]+" ");
//				transpose[y][x]=matrix[x][y];
//
//			}
//			System.out.println();
//		}
//		
////		for(int x=0;x<row;x++)
////		{
////			for(int y=0;y<col;y++)
////			{
////				transpose[y][x]=matrix[x][y];
////			}
////		}
//		
//		System.out.println("Transpose matrix: ");
//		for(int x=0;x<row;x++)
//		{
//			for(int y=0;y<col;y++)
//			{
//				System.out.print(transpose[x][y]+" ");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		int matrix[][]={{7,7,8,10},
//				 		{7,8,7,16},
//				 		{2,3,5,20},
//				 		{22,34,56,11}};
//		int transpose[][]=new int[matrix[0].length][matrix.length];
//		printTranspose(matrix, transpose);
//	}
//}


class array2Dquest
{
	public static void printTranspose(int matrix[][], int transpose[][])
	{
		System.out.println("Original Matrix: \n");
		for(int x=0;x<matrix.length;x++)
		{
			for(int y=0;y<matrix[0].length;y++)
			{
				System.out.print(matrix[x][y]+" ");
				transpose[y][x]=matrix[x][y];
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose matrix: \n");
		for(int x=0;x<matrix.length;x++)
		{
			for(int y=0;y<matrix[0].length;y++)
			{
				System.out.print(transpose[x][y]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int matrix[][]={{7,7,8,10},
				 		{7,8,7,16},
				 		{2,3,5,20},
				 		{22,34,56,11}};
		int transpose[][]=new int[matrix[0].length][matrix.length];
		printTranspose(matrix, transpose);
	}
}

