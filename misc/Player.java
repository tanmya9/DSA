class Playerrr
{	String name;
	int id; 
	String country;
	void setName(String name)
	{
		this.name=name;
	}
	void setId(int id)
	{
		this.id=id;
	}
	void setCountry(String country)
	{
		this.country=country;
	}
	
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public String getCountry()
	{
		return country;
	}
	public void display()
	{
		System.out.println("Name is "+name);
		System.out.println("id is "+id);
		System.out.println("Country is "+country);
	}	
}

class Cricket extends Playerrr
{
	int matches;
	int runs;
	int wickets;
	void setMatches(int matches)
	{
		this.matches=matches;
	}
	void setRuns(int runs)
	{
		this.runs=runs;
	}
	void setWickets(int wickets)
	{
		this.wickets=wickets;
	}
	
	public int getMatches()
	{
		return matches;
	}
	public int getRuns()
	{
		return runs;
	}
	public int getWickets()
	{
		return wickets;
	}
	public void display()
	{
		super.display();
		System.out.println("No of amtches "+matches);
		System.out.println("Runs are "+runs);
		System.out.println("Wickets are "+wickets);
	}	
}

class Handball extends Playerrr
{
	int match;
	int goals;
	void setMatches(int match)
	{
		this.match=match;
	}
	void setGoal(int goals)
	{
		this.goals=goals;
	}
	
	public int getMatches()
	{
		return match;
	}
	public int getGoal()
	{
		return goals;
	}
	public void display()
	{
		System.out.println("No of matches "+match);
		System.out.println("Goals are "+goals);
	}
}
class Player
{
	public static void main(String args[])
	{
		Playerrr sc=new Playerrr();
		sc.setName("Tanmya");
		sc.getName();
		sc.setId(123);
		sc.getId();
		sc.setCountry("India");
		sc.getCountry();
		
		Cricket ab=new Cricket();
		ab.setMatches(12);
		ab.getMatches();
		ab.setRuns(899);
		ab.getRuns();
		ab.setWickets(78);
		ab.getWickets();
		
		Handball  ob=new Handball ();
		ob.setMatches(89);
		ob.getMatches();
		ob.setGoal(999);
		ob.getGoal();
		
		System.out.println("Player info for cricket is: ");
		ob.display();
		
		System.out.println("Player info for Football is: ");
		ob.display();

	}
		
		
}