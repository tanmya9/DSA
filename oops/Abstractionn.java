//public class Abstractionn
//{
//	public static void main(String args[])
//	{
//		Tiger t=new Tiger();
//		t.eat();
//		t.walk();
//		
//		Human h=new Human();
//		h.eat();
//		h.walk();
//	}
//}
//
//abstract class Anima
//{
//	abstract void eat(); // the implementation of the method of every class can be different
//	void walk() //this method has to be there in all the methods of the classes
//	{
//		System.out.println("Walks");
//	}
//}
//class Tiger extends Anima
//{
//	void eat()
//	{
//		System.out.println("Eats other animals");
//	}
//}
//class Human extends Anima
//{
//	void eat()
//	{
//		System.out.println("Eats vegan");
//	}
//}


//public class Abstractionn
//{
//	public static void main(String args[])
//	{
//		Human h=new Human();
//		h.eat();
//		h.color="dark brown";
//		System.out.println(h.color);
//	}
//}
//abstract class Anima
//{
//	String color;
//	abstract void eat();
//	Anima()
//	{
//		color="brown";
//	}
//	void sleep()
//	{
//		System.out.println("Sleeps");
//	}
//}
//class Human extends Anima
//{
//	void changeColor()
//	{
//		color= "dark brown";
//	}
//	void eat()
//	{
//		System.out.println("Eats");
//	}
//}


//Constructor calling hierarchy
public class Abstractionn
{
	public static void main(String args[])
	{
		Mustang m=new Mustang();
	}
}
abstract class Anima //doesn't matter if it is abstract or not
{
	abstract void walk();
	Anima()
	{
		System.out.println("Animal class constructor called");
	}
	void eat()
	{
		System.out.println("Eating");
	}
}
class Horse extends Anima
{
	Horse()
	{
		System.out.println("Horse class constructor is called");
	}
	void walk()
	{
		System.out.println("Walking");
	}
}
class Mustang extends Horse
{
	Mustang()
	{
		System.out.println("Mustang class constructor is called");
	}
	void walk()
	{
		System.out.println("Walking");
	}
}
