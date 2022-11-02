package studio7;

public class Die {

	private int die;
	public Die(int initDie)
	{
		die = initDie;
		
	}
	public int randomDie()
	{
		 int roll = ((int) Math.random()*die)+1;
		return roll;
	}
	public static void main(String []args)
	{
		Die rolldie = new Die(6);
		System.out.println(rolldie.randomDie());
	}
}
