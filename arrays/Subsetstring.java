class Subsetstring
{
	public static void createSubset(String str, String add, int i)
	{
		//base case
//		if(i==str.length())
//		{
//			if(add.length()==0)
//			{
//				System.out.println("null");
//				return;
//			}
//			else
//			{
//				System.out.println(add);
//				return;
//			}
//			
//		}
		
		if(i==str.length())
		{
			System.out.println(add);
			return;
		}
		
		//recursion
		//Choice YES
		createSubset(str,add+str.charAt(i), i+1);
		
		//Choice NO
		createSubset(str,add,i+1);
	}
	public static void main(String args[])
	{
		String str="abc";
		createSubset(str,"",0);
	}
}