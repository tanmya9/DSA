import java.util.ArrayList;
class Listswap
{
	public static void swap(ArrayList<Integer> list, int idx, int idx1)
	{
		int temp=list.get(idx);
		list.set(idx, idx1);
		list.set(idx1, temp);
	}
	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(6);
		
		int idx=1, idx1=3;
		System.out.println(list);
		swap(list, idx, idx1);
		System.out.println(list);
	}
}