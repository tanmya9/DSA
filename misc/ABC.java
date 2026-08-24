abstract class Hall
{
	abstract void display();
}
class hey extends Hall
{
	void display()
	{
		System.out.println("Hall is halling");
	}
}
class ABC
{
	public static void main(String args[])
	{
		hey ab=new hey();
		ab.display();
	}
}