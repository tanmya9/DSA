class Spiral
{
	public static void printSpiral(int matrix[][])
	{
		int startRow=0;
		int startCol=0;
		int endRow=matrix.length-1;
		int endCol=matrix[0].length-1;
		
		while(startRow<=endRow && startCol<=endCol)
		{
			//top
			for(int x=startCol;x<=endCol;x++)
			{
				System.out.print(matrix[startRow][x]+" ");
			}
			
			//right
			for(int x=startRow+1;x<=endRow;x++)
			{
				System.out.print(matrix[x][endCol]+" ");
			}
			
			//bottom
			for(int x=endCol-1;x>=startCol;x--)
			{
				if(startRow==endRow)
				{
					break;
				}
				System.out.print(matrix[endRow][x]+" ");
			}
			
			//left
			for(int x=endRow-1;x>=startRow+1;x--)
			{
				if(startCol==endCol)
				{
					break;
				}
				System.out.print(matrix[x][startCol]+" ");
			}
			startCol++;
			startRow++;
			endCol--;
			endRow--;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int matrix[][]= {{1,2,3,4},
						 {5,6,7,8},
						 {9,10,11,12},
						 {13,14,15,16}};
		printSpiral(matrix);
	}
}