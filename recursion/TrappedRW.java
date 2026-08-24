class TrappedRW
{
	public static void rainWater(int height[])
	{
		int max=0;
		int leftmax[]=new int[height.length];
		leftmax[0]=height[0];
		for(int x=1;x<height.length;x++)
		{
			leftmax[x]=Math.max(height[x], leftmax[x-1]);
		}
		
		int rightmax[]=new int[height.length];
		rightmax[height.length-1]=height[height.length-1];
		for(int x=height.length-2;x>=0;x--)
		{
			rightmax[x]=Math.max(height[x],rightmax[x+1]);
		}
		
		int waterlevel=0, trapped=0;;
		for(int y=0;y<height.length;y++)
		{
			waterlevel=Math.min(leftmax[y], rightmax[y]);
			trapped= trapped+(waterlevel-height[y]);
		}
		System.out.println(trapped);
	}
	public static void main(String args[])
	{
		int height[]= {4,2,0,6,3,2,5};
		rainWater(height);
	}
}