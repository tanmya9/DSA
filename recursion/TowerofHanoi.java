class TowerofHanoi
{
	public static void toh(char source, char dest, char aux, int n)
	{
		if(n==0)
		{
			return;
		}
		toh(source, aux, dest,n-1);//faith 1 to transfer smaller discs to auxillary
		
		System.out.println(n+" moved from "+source+" tower to "+dest+" tower");//our work to transfer bigger disc
		
		toh(aux, dest, source, n-1);//faith 2 to transfer smaller discs to destination
	}
	
	public static void main(String args[])
	{
		toh('A', 'C', 'B', 3);
	}
}