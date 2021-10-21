public class Weapon extends Equipment{
	
	double weight;
	int cost;
	String name;
	int numDice;
	int diceSize;
	
	
	public Weapon(double w, int c, String n, int num, int d) {
		super(w, c, n);
		numDice = num;
		diceSize = d;
	}
	
}