//public class OOPS
//{
//	public static void main(String args[])
//	{
//		Pen p1=new Pen();
//		p1.setColor("Yellow");
//		System.out.println(p1.color);
//		p1.setTip(2);
//		System.out.println(p1.tip);
//		
//		//p1.setColor("Blue");
//		p1.color="Blue";
//		System.out.println(p1.color);
//		
//		BankAccount b=new BankAccount();
//		b.username="Tanmya";
//		b.setPassword("dnrgrg");
//
//	}
//}
//
//class BankAccount
//{
//	public String username;
//	private String password;
//	public void setPassword(String pwd)
//	{
//		password=pwd;
//	}
//}
//
//class Pen
//{
//	String color;
//	int tip;
//	void setColor(String newColor)
//	{
//		color=newColor;
//	}
//	void setTip(int newTip)
//	{
//		tip=newTip;
//	}
//}
//class Student
//{
//	String name;
//	int age;
//	double perc;
//	void calcPerc(int phy, int chem, int math)
//	{
//		perc=(phy+chem+math)/3;
//	}
//}





public class OOPS
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.name="tanmya";
		s1.roll=456;
		s1.password="abc";
		s1.marks[0]=100;
		s1.marks[1]=90;
		s1.marks[2]=80;
		
		Student s2=new Student(s1);
		s2.password="xyz";
		s1.marks[2]=100;
		for(int i=0;i<3;i++)
		{
			System.out.println(s2.marks[i]);
		}
	}
}
class Student
{
	String name;
	int roll;
	String password;
	int marks[];
	
//	Student(Student s1)
//	{
//		marks=new int[3];
//		this.name=s1.name;
//		this.roll=s1.roll;
//		this.marks=s1.marks;
//	}
	
	Student(Student s1)
	{
		marks=new int[3];
		this.name=s1.name;
		this.roll=s1.roll;
		for(int i=0;i<marks.length;i++)
		{
			this.marks[i]=s1.marks[i];
		}
	}
	Student()
	{
		marks=new int[3];
	}
}