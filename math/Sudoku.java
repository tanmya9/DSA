//class Sudoku
//{
//	public static boolean sudokuSolver(int sudoku[][], int row, int col)
//	{
//		//base Case
//		if(row==9)//because row starts from 0 and goes till 8
//		{
//			return true;//puzzle completed
//		}
//		
//		//recursion
//		int nextRow=row, nextCol=col+1;
//		if(col+1==9)
//		{
//			nextRow=row+1;
//			nextCol=0;
//		}
//		
//		//for already existing element in the cell, it moves to the next column
//		if(sudoku[row][col]!=0)
//		{
//			return sudokuSolver(sudoku,nextRow,nextCol);
//		}
//		
//		//for placing elements in new cells
//		for(int digit=1;digit<=9;digit++)
//		{
//			if(isSafe(sudoku,row,col,digit))
//			{
//				sudoku[row][col]=digit;
//				sudokuSolver(sudoku, nextRow, nextCol);
//				if(sudokuSolver(sudoku, nextRow, nextCol)==true)
//				{
//					return true; //the function immediately exits with return true, skipping any further lines in the loop.
//				}
//				else
//				{
//					sudoku[row][col]=0;
//				}
//			}
//		}
//		
//		return false;
//	}
//	
//	public static boolean isSafe(int sudoku[][], int row, int col, int digit)
//	{
//		//column condition
//		for(int x=0;x<=8;x++)
//		{
//			if(sudoku[x][col]==digit)
//			{
//				return false;
//			}
//		}
//		//row
//		for(int y=0;y<=8;y++)
//		{
//			if(sudoku[row][y]==digit)
//			{
//				return false;
//			}
//		}
//		//grid
//		int sr=(row/3)*3;
//		int sc=(col/3)*3;
//		for(int x=sr;x<sr+3;x++)
//		{
//			for(int y=sc;y<sc+3;y++)
//			{
//				if(sudoku[x][y]==digit)
//				{
//					return false;
//				}
//			}
//		}
//		
//		return true;
//	}
//	public static void printSudoku(int sudoku[][])
//	{
//		for(int x=0;x<9;x++)
//		{
//			for(int y=0;y<9;y++)
//			{
//				System.out.print(sudoku[x][y]+" ");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		int sudoku[][]= {{0,0,8,0,0,0,0,0,0},
//						{4,9,0,1,5,7,0,0,2},
//						{0,0,3,0,0,4,1,9,0},
//						{1,8,5,0,6,0,0,2,0},
//						{0,0,0,0,2,0,0,6,0},
//						{9,6,0,4,0,5,3,0,0},
//						{0,3,0,0,7,2,0,0,4},
//						{0,4,9,0,3,0,0,5,7},
//						{8,2,7,0,0,9,0,1,3}};
//		if(sudokuSolver(sudoku,0,0))
//		{
//			System.out.println("Solution exists");
//			printSudoku(sudoku);
//		}
//		else
//		{
//			System.out.println("Solution doesnt exits");
//
//		}
//	}
//}


class Sudoku
{
	public static boolean sudokuSolver(int sudoku[][], int row, int col)
	{
		if(row==9)
		{
			return true;
		}
		int nextRow=row, nextCol=col+1;
		if(col+1==9)
		{
			nextRow=row+1;
			nextCol=0;
		}
		
		if(sudoku[row][col]!=0)
		{
			return sudokuSolver(sudoku, nextRow, nextCol);
		}
		for(int digit=1;digit<=9;digit++)
		{
			if(isSafe(sudoku, row, col, digit))
			{
				sudoku[row][col]=digit;
				if(sudokuSolver(sudoku, nextRow, nextCol)==true)
				{
					return true;//the function immediately exits with return true, skipping any further lines in the loop.
				}
					sudoku[row][col]=0;
			}
		}
		return false;
	}
	
	public static boolean isSafe(int sudoku[][], int row, int col, int digit)
	{
		//row
		for(int x=0;x<=8;x++)
		{
			if(sudoku[row][x]==digit)
			{
				return false;
			}
		}
		
		//column;
		for(int x=0;x<=8;x++)
		{
			if(sudoku[x][col]==digit)
			{
				return false;
			}
		}
		
		//grid
		int startRow=(row/3)*3;
		int startCol=(col/3)*3;
		for(int x=startRow;x<startRow+3;x++)
		{
			for(int y=startCol;y<startCol+3;y++)
			{
				if(sudoku[x][y]==digit)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void printSudoku(int sudoku[][])
	{
		for(int x=0;x<sudoku.length;x++)
		{
			for(int y=0;y<sudoku.length;y++)
			{
				System.out.print(sudoku[x][y]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int sudoku[][]={{0,0,8,0,0,0,0,0,0},
						{4,9,0,1,5,7,0,0,2},
						{0,0,3,0,0,4,1,9,0},
						{1,8,5,0,6,0,0,2,0},
						{0,0,0,0,2,0,0,6,0},
						{9,6,0,4,0,5,3,0,0},
						{0,3,0,0,7,2,0,0,4},
						{0,4,9,0,3,0,0,5,7},
						{8,2,7,0,0,9,0,1,3}};
		
		if(sudokuSolver(sudoku,0,0))
		{
			System.out.println("Solution exists");
			printSudoku(sudoku);
		}
		else
		{
			System.out.println("Solution doesn't exists");
		}
	}
}