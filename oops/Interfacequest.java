//public class Interfacequest
//{
//	public static void main(String args[])
//	{
//		Pawn p=new Pawn();
//		p.piece();
//		p.moves();
//		Queen q=new Queen();
//		q.piece();
//		q.moves();
//		Rook r=new Rook();
//		r.piece();
//		r.moves();
//	}
//}
//
//interface Chess
//{
//	void piece();
//	void moves();
//}
//class Pawn implements Chess
//{
//	public void piece() //Rule: had to be public
//	{
//		System.out.println("Pawn:");
//	}
//	public void moves()
//	{
//		System.out.println("Diagonal, Straight");
//	}
//}
//class Queen implements Chess
//{
//	public void piece()
//	{
//		System.out.println("Queen:");
//	}
//	public void moves()
//	{
//		System.out.println("In all 4 directions");
//	}
//}
//class Rook implements Chess
//{
//	public void piece()
//	{
//		System.out.println("Rook:");
//	}
//	public void moves()
//	{
//		System.out.println("left, right");
//	}
//}


//Multiple inheritance
public class Interfacequest
{
	public static void main(String args[])
	{
		Bear b=new Bear();
		b.type();
		b.typeNew();
	}
}
interface Herbivore
{
	void type();
}
interface Carnivore
{
	void typeNew();
}
class Bear implements Herbivore, Carnivore
{
	public void type()
	{
		System.out.println("Herbivore");
	}
	public void typeNew()
	{
		System.out.println("Carnivore");
	}
}