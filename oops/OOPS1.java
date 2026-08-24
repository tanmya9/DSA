public class OOPS1
{
	public static void main(String args[])
	{
		Studenttt s1=new Studenttt("Tanmya");
		Studenttt s3=new Studenttt(123);
		Studenttt s2=new Studenttt();
		s1.display();
		s3.display();
	}
}

class Studenttt
{
	String s;
	int rollno;
	Studenttt(String name) //parametriesed constructor
	{
		this.s=name;
	}
	Studenttt(int rollno) //parametriesed constructor
	{
		this.rollno=rollno;
	}
	Studenttt() //non parameterised 
	{
		System.out.println("Constructro is called");
	}
	public void display()
	{
		System.out.println(s);
		System.out.println(rollno);
	}
}



