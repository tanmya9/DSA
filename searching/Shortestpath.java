class Shortestpath
{
	public static double getShortestPath(String path)
	{
		int x=0, y=0;
		for(int i=0;i<path.length();i++)
		{
			//North
			if(path.charAt(i)=='N')
			{
				y++;
			}
			//South
			else if(path.charAt(i)=='S')
			{
				y--;
			}
			//West
			else if(path.charAt(i)=='W')
			{
				x--;
			}
			//East
			else if(path.charAt(i)=='E')
			{
				x++;
			}
		}
		return (double)Math.sqrt((x*x)+(y*y));
	}
	public static void main(String args[])
	{
		String path="WNEENESENNN";
		System.out.println(getShortestPath(path));
	}
}