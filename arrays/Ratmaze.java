//class Ratmaze
//{
//	public static void solveMaze(int maze[][], int row, int col, String path, boolean isVisited[][])
//	{
//		int n=maze.length;
//		if(row<0 || col<0 || row==n || col==n) //boundary condition
//		{
//			return;
//		}
//		if(maze[row][col]==0)
//		{
//			return;
//		}
//		if(row==n-1 && col==n-1) //boundary condition
//		{
//			System.out.println(path);
//			return;
//		}
//		if(isVisited[row][col]) //this was already visited
//		{
//			return;
//		}
//		isVisited[row][col]=true; //makes that cell true to denote that cell has been visited
//		
//		//left
//		solveMaze(maze,row,col-1,path+"L",isVisited);
//		//right
//		solveMaze(maze,row,col+1,path+"R",isVisited);
//		//Up
//		solveMaze(maze,row-1,col,path+"U", isVisited);
//		//Down
//		solveMaze(maze,row+1,col,path+"D",isVisited); 
//		
//		isVisited[row][col]=false;
//	}
//	public static void main(String args[])
//	{
//		int row=4,col=4;
//		int maze[][]={{1,1,0,0},
//					{1,1,0,1},
//					{0,1,1,0},
//					{1,1,1,1}};
//		boolean isVisited[][]=new boolean[row][col]; //default value false
//		solveMaze(maze, 0, 0, "",isVisited);
//	}
//}


//class Ratmaze
//{
//	public static void solveMaze(int maze[][], int row, int col, String p, boolean isVisited[][])
//	{
//		int n=maze.length;
//		if(row<0 || col<0 || row==n || col==n)
//		{
//			return;
//		}
//		if(isVisited[row][col])
//		{
//			return;
//		}
//		if(maze[row][col]==0)
//		{
//			return;
//		}
//		if(row==n-1 && col==n-1)
//		{
//			System.out.println(p);
//			return;
//		}
//		
//		isVisited[row][col]=true;
//		
//		//left
//		solveMaze(maze, row, col-1, p+"L", isVisited);
//		//right
//		solveMaze(maze, row, col+1, p+"R", isVisited);
//		//Up
//		solveMaze(maze, row-1, col, p+"U", isVisited);
//		//Down
//		solveMaze(maze, row+1, col, p+"D", isVisited);
//		
//		isVisited[row][col]=false;
//	}
//	public static void main(String args[])
//	{
//		int row=4, col=4;
//		int maze[][]= {{1,1,0,0},
//					{1,1,1,1},
//					{0,1,1,1},
//					{1,1,1,1}};
//		boolean isVisited[][]=new boolean[row][col]; //extra array, larger space complexity
//		solveMaze(maze,0,0,"",isVisited);
//	}
//}


//Optimised, checking and unchecking in the current array itslef
class Ratmaze
{
	public static void solveMaze(int maze[][], int row, int col, String p)
	{
		int n=maze.length;
		if(row<0 || col<0 || row==n || col==n)
		{
			return;
		}
		if(maze[row][col]==-1) // return if already visited
		{
			return;
		}
		if(maze[row][col]==0)
		{
			return;
		}
		if(row==n-1 && col==n-1)
		{
			System.out.println(p);
			return;
		}
		
		maze[row][col]=-1; //-1, already visited
		
		//left
		solveMaze(maze, row, col-1, p+"L");
		//right
		solveMaze(maze, row, col+1, p+"R");
		//Up
		solveMaze(maze, row-1, col, p+"U");
		//Down
		solveMaze(maze, row+1, col, p+"D");
		
		maze[row][col]=1; //unchecking previous paths to explore new paths
	}
	public static void main(String args[])
	{
		int maze[][]= {{1,1,0,0},
					{1,1,1,1},
					{0,1,1,1},
					{1,1,1,1}};
		solveMaze(maze,0,0,"");
	}
}