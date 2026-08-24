class Functions
{
		public static int multiply(int a, int b)
		{
			int product =a*b;
			return product;   //return a*b;
		}
		
		public static int factorial(int n)
		{
			int f=1;
			for(int x=1;x<=n;x++)
			{
				f=f*x;
			}
			return f;
		}
		public static int bincoeff(int n, int r)
		{
			int n_fact=factorial(n);
			int r_fact=factorial(r);
			int nmr_fact=factorial(n-r);
			return n_fact / (r_fact * nmr_fact);
		}
		public static void main(String args[])
		{
//			int n1=3;
//			int n2=5;
//			int prod=multiply(n1 ,n2);			//int prod=multiply(3,5);
//			System.out.println("A x B = "+prod);
//			System.out.println("A x B = "+multiply(3,5));
			
//			int fact=factorial(5);
//			System.out.println("Factorial of 8 is "+fact);
			
//			int bf=bincoeff(5,2);
//			System.out.println("Binomial coefficient of 5 and 2 is "+bf);  
			System.out.println("Binomial coefficient of 5 and 2 is "+bincoeff(5,2));
		}
}