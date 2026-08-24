class Evendigits
{
    public static int findNumbers(int[] nums)
    {
    	int count=0;
//    	for(int i=0;i<nums.length;i++)
    	for(int num:nums)
    	{
    		if(evenDigit(num))
    		{
    			count++;
    		}
    	}
    	return count;
    }
    
    //function to count digits
    public static int countDigit(int num)
    {
    	if (num<0)
    	{
    		num=num*-1;
    	}
    	if(num==0)
    	{
    		return 1;
    	}
    	return (int)(Math.log10(num) + 1);
//    	int count=0;
//    	while(num>0)
//    	{
//    		num=num/10;
//    		count++;
//    	}
//    	return count;
    }
    
     //function to check if digit is even
    public static boolean evenDigit(int num)
    {
    	int numberOfdigit=countDigit(num);
    	if(numberOfdigit %2 ==0)
    	{
    		return true;
    	}
    	
    	return false;
    }
	 public static void main(String args[])
	{
		int nums[]= {12, 1234, 666, 66};
		System.out.println(findNumbers(nums));
	}
}