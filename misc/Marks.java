import java.util.*;
class Marks
{
	public static void update(int marks[])
	{
//		marks[0]=marks[0]+1;
//		marks[1]=marks[1]+1;
//		marks[2]=marks[2]+1;
		for(int x=0;x<marks.length;x++)
		{
			marks[x]=marks[x]+1;
		}
	}
	public static void main(String args[])
	{
		int marks[]=new int[3];
		marks[0]=95;
		marks[1]=96;
		marks[2]=98;
		update(marks);
		for(int x=0;x<marks.length;x++)
		{
			System.out.print(marks[x]+" ");
		}
	}
}