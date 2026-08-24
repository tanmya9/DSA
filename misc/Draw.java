interface Drawing
{
	void draw();
}
class Shape1 implements Drawing
{
	public void draw()
	{
		System.out.println("Circle is drawn");
	}
}
class Shape2 implements Drawing
{
	public void draw()
	{
		System.out.println("Rectangle is drawn");
	}
}
class Draw
{
	public static void main(String args[])
	{
		Drawing d=new Shape1();
		d.draw();
		Drawing d1=new Shape2();
		d1.draw();
	}
}