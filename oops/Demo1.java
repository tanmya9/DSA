//IMPLEMENTING ABSTRACTION

// class Laptop
// {
// 	public void code()
// 	{
// 		System.out.println("Codes");
// 	}
// }
// class Desktop
// {
// 	public void code()
// 	{
// 		System.out.println("Codes faster");
// 	}
// }
// class Developer
// {
// 	public void devApp(Laptop laptop) //tight coupling
// 	{
// 		laptop.code();	
// 	}
// }
// public class Demo1
// {
// 	public static void main(String args[])
// 	{
// 		Laptop laptop=new Laptop();
// 		Desktop desktop=new Desktop();
// 		Developer developer=new Developer();
// 		developer.devApp(laptop);
// 	}
// }

interface Computer
{
	void code();
}
class Laptop implements Computer
{
	public void code()
	{
		System.out.println("Codes");
	}
}
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("Codes faster");
	}	
}
class Developer
{
	public void devApp(Computer comp)
	{
		comp.code();
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		Computer laptop=new Laptop();
		Computer desktop=new Desktop();
		Developer developer=new Developer();
		developer.devApp(desktop);
		developer.devApp(laptop);
	}
}
