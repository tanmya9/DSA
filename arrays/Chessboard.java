////This program will not check the safety of the queens
//class Chessboard
//{
//	public static void nQueens(char board[][], int row)
//	{
//		//base case
//		if(row==board.length)
//		{
//			printBoard(board);
//			return;
//		}
//		//Queen ko bethane ke steps
//		for(int j=0;j<board.length;j++)
//		{
//			board[row][j]='Q';
//			nQueens(board, row+1);
//			board[row][j]='.';
//		}
//	}
//	
//	public static void printBoard(char board[][])
//	{
//		System.out.println("--------Chess Board--------");
//		for(int i=0;i<board.length;i++)
//		{
//			for(int j=0;j<board.length;j++)
//			{
//				System.out.print(board[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		int n=4;
//		char board[][]=new char[n][n];
//		for(int i=0;i<board.length;i++)
//		{
//			for(int j=0;j<board.length;j++)
//			{
//				board[i][j]='.';
//			}
//		}
//		nQueens(board,0);
//	}
//}

//
//class Chessboard
//{
//	public static void nQueens(char board[][], int row)
//	{
//		if(row==board.length)
//		{
//			printBoard(board);
//			return;
//		}
//		for(int j=0;j<board.length;j++)
//		{
//			if(isSafe(board,row,j))
//			{
//				board[row][j]='Q';
//				nQueens(board,row+1);
//				board[row][j]='.'; //backtrack
//			}
//		}
//	}
//	public static boolean isSafe(char board[][], int row, int col)
//	{
//		//vertical up
//		for(int i=row-1;i>=0;i--)
//		{
//			if(board[i][col]=='Q')
//			{
//				return false;
//			}
//		}
//		
//		//left diagonal
//		for(int i=row-1,j=col-1; i>=0&&j>=0; i--,j--)
//		{
//			if(board[i][j]=='Q')
//			{
//				return false;
//			}
//		}
//		
//		//right diagonal
//		for(int i=row-1,j=col+1; i>=0&&j<board.length; i--,j++)
//		{
//			if(board[i][j]=='Q')
//			{
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	//Printing the final board
//	public static void printBoard(char board[][])
//	{
//		System.out.println("-----Chess Board-----");
//		for(int i=0;i<board.length;i++)
//		{
//			for(int j=0;j<board.length;j++)
//			{
//				System.out.print(board[i][j]);
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		int n=4;
//		char board[][]=new char[n][n];
//		
//		//initialising with no queens
//		for(int i=0;i<board.length;i++)
//		{
//			for(int j=0;j<board.length;j++)
//			{
//				board[i][j]='.';
//			}
//		}
//		nQueens(board, 0);
//	}
//}

//class Chessboard
//{
//	public static void nQueens(char board[][], int row)
//	{
//		if(row==board.length)
//		{
//			printBoard(board);
//		}
//		for(int y=0;y<board.length;y++)
//		{
//			if(isSafe(board, row, y))
//			{
//				board[row][y]='Q';
//				nQueens(board,row+1);
//				board[row][y]='.';
//			}
//		}
//	}
//	public static boolean isSafe(char board[][],int row, int col)
//	{
//		for(int x=row-1;x>=0;x--)
//		{
//			if(board[x][col]=='Q')
//			{
//				return false;
//			}
//		}
//		
//		for(int x=row-1,y=col-1; x>=0&&y>=0; x--,y--)
//		{
//			if(board[x][y]=='Q')
//			{
//				return false;
//			}
//		}
//		
//		for(int x=row-1, y=col+1; x>=0&&y<board.length;x--,y++)
//		{
//			if(board[x][y]=='Q')
//			{
//				return false;
//			}
//		}
//		
//		return true;
//	}
//	
//	public static void printBoard(char board[][])
//	{
//		System.out.println("-----Chess Board-----");
//		for(int x=0;x<board.length;x++)
//		{
//			for(int y=0;y<board.length;y++)
//			{
//				System.out.print(board[x][y]);
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		int n=4;
//		char board[][]=new char[n][n];
//		
//		for(int x=0;x<board.length;x++)
//		{
//			for(int y=0;y<board.length;y++)
//			{
//				board[x][y]='.';
//			}
//		}
//		
//		nQueens(board,0);
//	}
//}


//Count total no of ways to solve n queens problem
//class Chessboard
//{
//	public static void nQueens(char board[][], int row)
//	{
//		if(row==board.length)
//		{
//			count++;
//			return;
//		}
//		for(int y=0;y<board.length;y++)
//		{
//			if(isSafe(board, row, y))
//			{
//				board[row][y]='Q'; //place queen
//				nQueens(board,row+1);
//				board[row][y]='.'; //unplace previous queen
//			}
//		}
//	}
//	static int count=0; //static to ensure it retains its value across recursive calls and throughout the execution of program. 
//	
//	public static boolean isSafe(char board[][],int row, int col)
//	{
//		for(int x=row-1;x>=0;x--)
//		{
//			if(board[x][col]=='Q')
//			{
//				return false;
//			}
//		}
//		
//		for(int x=row-1,y=col-1; x>=0&&y>=0; x--,y--)
//		{
//			if(board[x][y]=='Q')
//			{
//				return false;
//			}
//		}
//		
//		for(int x=row-1, y=col+1; x>=0&&y<board.length;x--,y++)
//		{
//			if(board[x][y]=='Q')
//			{
//				return false;
//			}
//		}
//		
//		return true;
//	}
//	
//	public static void printBoard(char board[][])
//	{
//		System.out.println("-----Chess Board-----");
//		for(int x=0;x<board.length;x++)
//		{
//			for(int y=0;y<board.length;y++)
//			{
//				System.out.print(board[x][y]);
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		int n=2;
//		char board[][]=new char[n][n];
//		
//		for(int x=0;x<board.length;x++)
//		{
//			for(int y=0;y<board.length;y++)
//			{
//				board[x][y]='.';
//			}
//		}
//		
//		nQueens(board,0);
//		System.out.println("Total ways to count no of ways is ="+count);
//	}
//}


class Chessboard
{
	public static boolean nQueens(char board[][], int row)
	{
		if(row==board.length)
		{
			count++;
			return true;
		}
		for(int y=0;y<board.length;y++)
		{
			if(isSafe(board, row, y))
			{
				board[row][y]='Q'; //place queen
				if(nQueens(board,row+1))
				{
					return true;
				}
				board[row][y]='.';
			}
		}
		
		return false;
	}
	static int count=0; //static to ensure it retains its value across recursive calls and throughout the execution of program. 
	
	public static boolean isSafe(char board[][],int row, int col)
	{
		for(int x=row-1;x>=0;x--)
		{
			if(board[x][col]=='Q')
			{
				return false;
			}
		}
		
		for(int x=row-1,y=col-1; x>=0&&y>=0; x--,y--)
		{
			if(board[x][y]=='Q')
			{
				return false;
			}
		}
		
		for(int x=row-1, y=col+1; x>=0&&y<board.length;x--,y++)
		{
			if(board[x][y]=='Q')
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void printBoard(char board[][])
	{
		System.out.println("-----Chess Board-----");
		for(int x=0;x<board.length;x++)
		{
			for(int y=0;y<board.length;y++)
			{
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int n=2;
		char board[][]=new char[n][n];
		
		for(int x=0;x<board.length;x++)
		{
			for(int y=0;y<board.length;y++)
			{
				board[x][y]='.';
			}
		}
		
		if(nQueens(board,0))
		{
			System.out.println("Solution is possible");
			printBoard(board);
		}
		else
		{
			System.out.println("Solution is not possible");
		}
	}
}