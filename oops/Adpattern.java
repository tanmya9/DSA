//import java.util.*;
class Adpattern
{
//	public static void hollowRectangle(int row, int col)
//	{
//		for(int x=1;x<=row;x++)
//		{
//			for(int y=1;y<=col;y++)
//			{
//				if(x==1 || x==row || y==1 || y==col)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		hollowRectangle(5,4);
//	}
//}

//	public static void invertedPyr(int row)
//	{
//		for(int x=1;x<=row;x++)
//		{
//			for(int y=1;y<=row-x;y++)
//			{
//				System.out.print(" ");
//			}
//			for(int y=1;y<=x;y++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		invertedPyr(5);
//	}
//}

//	public static void floydTri(int row)
//	{
//		int num=1;
//		for(int x=1;x<=row;x++)
//		{
//			for(int y=1;y<=x;y++)
//			{
//				System.out.print(num);
//				num++;
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		floydTri(4);
//	}
//}

//	public static void binaryPatt(int row)
//	{
//		for(int x=1;x<=row;x++)
//		{
//			for(int y=1;y<=x;y++)
//			{
//				if((x+y)%2==0)
//				{
//					System.out.print("1");
//				}
//				else
//				{
//					System.out.print("0");
//				}
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		binaryPatt(5);
//	}
//}
	
//	public static void butterPatt(int row)
//	{
//		for(int x=1;x<=row;x++)
//		{
//			for(int y=1;y<=x;y++)
//			{
//				System.out.print("*");
//			}
//			for(int y=1;y<=2*(row-x);y++)
//			{
//				System.out.print(" ");
//			}
//			for(int y=1;y<=x;y++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int x=row;x>=1;x--)
//		{
//			for(int y=1;y<=x;y++)
//			{
//				System.out.print("*");
//			}
//			for(int y=1;y<=2*(row-x);y++)
//			{
//				System.out.print(" ");
//			}
//			for(int y=1;y<=x;y++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		butterPatt(8);
//	}
//}
	
//	public static void solidRhombus(int row)
//	{
//		for(int x=1;x<=row;x++)
//		{
//			for(int y=1;y<=row-x;y++)
//			{
//				System.out.print(" ");
//			}
//			for(int y=1;y<=row;y++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		solidRhombus(8);
//	}
//}
	
//	public static void hollowRhomb(int row, int col)
//	{
//		for(int x=1;x<=row;x++)
//		{
//			for(int y=1;y<=row-x;y++)
//			{
//				System.out.print(" ");
//			}
//			for(int y=1;y<=col;y++)
//			{
//				if(x==1 || x==row ||y==1 || y==col)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//	}
//	public static void main(String args[])
//	{
//		hollowRhomb(8,6);
//	}
//}
	
	public static void diamond(int row)
	{
		for(int x=1;x<=row;x++)
		{
			for(int y=1;y<=row-x;y++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=(2*x)-1;y++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
		for(int x=row;x>=1;x--)
		{
			for(int y=1;y<=row-x;y++)
			{
				System.out.print(" ");
			}
			for(int y=1;y<=(2*x)-1;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		diamond(10);
	}
}