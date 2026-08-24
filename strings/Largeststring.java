package strings;
class Largeststring
{
	public static String getLargest(String fruit[])
	{
		String largest=fruit[0];
		for(int x=1;x<fruit.length;x++)
		{
			if(largest.compareTo(fruit[x])<0)
			{
				largest=fruit[x];
			}
		}
		return largest;
	}
	public static void main(String args[])
	{
		String fruit[]= {"apple", "mango", "raspberry"};
		System.out.println("Largest string is "+getLargest(fruit));
	}
}