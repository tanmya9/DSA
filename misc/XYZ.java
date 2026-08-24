//class  XYZ//same class
//{
//	void sum(int a, int b) //same name, same arguments
//	{
//		System.out.println(a+b);
//	}
//	void sum(int a, float b)
//	{
//		System.out.println(a+b);
//	}
//	void sum(float a, float b)
//	{
//		System.out.println(a+b);
//	}
//	public static void main(String args[])
//	{
//		XYZ ob=new XYZ();
//		ob.sum(5, 7);
//		ob.sum(5, 5.5f);
//		ob.sum(5.5f, 8.1f);
//	}	
//}

//method overriding

class ABC
{
	void sum(int a, int b) //same name
	{
		System.out.println(a+b);
	}
}
class cals extends XYZ //different class
{
	void sum(int a,int b) //same argument
	{
		System.out.println(a+b);
	}
}
class cals1 extends XYZ
{
	void sum(int a, int b)
	{
		System.out.println(a+b);
	}
}
class XYZ
{
	public static void main(String args[])
	{
		cals ob=new cals();
		ob.sum(5, 10);
		cals1 ab=new cals1();
		ab.sum(20, 30);
	}
}