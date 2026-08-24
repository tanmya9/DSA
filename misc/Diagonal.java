class Diagonal
{
	public static int diagonalSum(int matrix[][])
	{
		int sum=0;
		
		//bruteforce
//		for(int x=0;x<matrix.length;x++)
//		{
//			for(int y=0;y<matrix[0].length;y++)
//			{
//				if(x==y)
//				{
//					sum+=matrix[x][y];
//				}
//				else if(x+y==matrix.length-1)
//				{
//					sum+=matrix[x][y];
//				}
//			}
//		}
		
		//optimised
		for(int x=0;x<matrix.length;x++)
		{
			sum=sum+matrix[x][x];
			if(x!=matrix.length-1-x)
			{
				sum=sum+matrix[x][matrix.length-1-x];
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		int matrix[][]= {{1,2,3,4},
						 {5,6,7,8},
						 {9,10,11,12},
						 {13,14,15,16}};
		System.out.println(diagonalSum(matrix));
	}
}