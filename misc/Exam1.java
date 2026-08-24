interface Playable
{
	void Play();
	void Rest();
	void Happy();
}
class Football implements Playable
{
	public void Play()
	{
		System.out.println("Plays Football");
	}
	public void Rest()
	{
		System.out.println("Rests");
	}
	public void Happy()
	{
		System.out.println("Happy");
	}
}
class Volleyball implements Playable
{
	public void Play()
	{
		System.out.println("Plays Volleyball");
	}
	public void Rest()
	{
		System.out.println("Rests");
	}
	public void Happy()
	{
		System.out.println("Happy");
	}
}
class Basketball implements Playable
{
	public void Play()
	{
		System.out.println("Plays Basketball");
	}
	public void Rest()
	{
		System.out.println("Rests");
	}
	public void Happy()
	{
		System.out.println("Happy");
	}
}
class Exam1
{
	public static void main(String args[])
	{
		Playable p=new Football();
		p.Play();
		p.Rest();
		p.Happy();
		Playable p1=new Volleyball();
		p1.Play();
		p1.Rest();
		p1.Happy();
		Playable p2=new Basketball();
		p2.Play();
		p2.Rest();
		p2.Happy();

	}
	
}
