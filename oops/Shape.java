abstract class Test
{
	abstract void draw();
}
class Rectangle extends Test
{
	void draw()
	{
		System.out.println("Drawing..");
	}
}
class Circle extends Test
{
	void draw()
	{
		System.out.println("Drawing circle..");
	}
}
class Shape
{
	public static void main(String args[])
	{
		Circle ab=new Circle();
		ab.draw();
		Rectangle ob=new Rectangle();
		ob.draw();
	}
}
