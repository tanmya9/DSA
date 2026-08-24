public class Staticex
{
	public static void main(String args[])
	{
		Example s1=new Example();
		s1.schoolName="BHS";
//		System.out.println(s1.schoolName);
		
		Example s2=new Example();
		s2.schoolName="JVM";
		System.out.println(s2.schoolName);
	}
}
class Example
{
	String name;
	int roll;
	static String schoolName;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return this.name;
	}
}