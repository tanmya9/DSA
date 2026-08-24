//class Animall
//{
////	instance variable
//	String a="Moving";
//	String b="Making sound";
//	//overriding
//	void move(String a)
//	{
//		System.out.println(a);
//	}
//	void makeSound(String b)
//	{
//		System.out.println(b);
//	}
//}
//class Bird extends Animall
//{
//	String a="";
//	String b="";
//	void move(String a)
//	{
//		System.out.println(a);
//	}
//	void makeSound(String b)
//	{
//		System.out.println(b);
//		System.out.println(super.b);
//	}
//}
//class Panthera extends Animall
//{
//	String a="";
//	String b="";
//	void move(String a)
//	{
//		System.out.println(a);
//	}
//	void makeSound(String b)
//	{
//		System.out.println(b);
//		System.out.println(super.b);
//	}
//}
//class Exam
//{
//	public static void main(String args[])
//	{
//		Bird b=new Bird();
//		b.move("Flies");
//		b.makeSound("Chirp");
//		Panthera p=new Panthera();
//		p.move("Walks");
//		p.makeSound("Roars");
//	}
//}

class Animall
{
	
	void move()
	{
		System.out.println("Moving");
	}
	void makeSound()
	{
		System.out.println("Making sound");
	}
}
class Bird extends Animall
{
	void move()
	{
		System.out.println("Flies");
	}
	void makeSound()
	{
		super.makeSound();
		System.out.println("Chirps");
	}
}
class Panthera extends Animall
{
	void move()
	{
		System.out.println("Walks");
	}
	void makeSound()
	{
		super.makeSound();
		System.out.println("Roars");
	}
}
class Exam
{
	public static void main(String args[])
	{
		Bird b=new Bird();
		b.move();
		b.makeSound();
	}
}