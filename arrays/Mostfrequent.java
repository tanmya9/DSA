import java.util.*;
class Mostfrequent
{
	public static int checkFrequent(ArrayList<Integer> list, int target)
	{
		ArrayList<Integer> followers=new ArrayList<>();
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i)==target)
			{
				followers.add(list.get(i+1));
			}
			
		}
		
		if(followers.size()==1)
		{
			return followers.get(0);
		}
		
		int frequent=-1;int max=0;
		for(int i=0;i<followers.size()-1;i++)
		{
			int count=1;  
			for(int j=i+1;j<followers.size();j++)
			{
				if(followers.get(i)==followers.get(j))
				{
					count++;
				}
			}
			
			if(count>max)
			{
				max=count;
				frequent=followers.get(i);
			}
		}
		return frequent;
	}
	public static void main(String arrgs[])
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(1000);
		list.add(2);
		list.add(3);
		list.add(3);
		
		System.out.println(checkFrequent(list,1000));
	}
}