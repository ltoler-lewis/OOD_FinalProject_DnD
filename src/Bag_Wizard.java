
public class Bag_Wizard extends Bag_Factory {

	

	Bag createBag(Character c) {
		Bag bag = new Bag(c);
		
		bag.addItem(new Equipment(0,0,"Starting clothes (weigh nothing)"));
		bag.addItem(new Equipment(3, 50, "Writing Pouch"));
		bag.addItem(new Weapon(4,2,"Quarterstaff", 1, 6));
		bag.addItem(new Weapon(2,2,"Light Crossbow", 1, 6));
		bag.addItem(new Equipment(1,10,"10 Candles"));
		bag.addItem(new Equipment(1,10,"Case with 10 Crossbow Bolts"));
		bag.addItem(new Equipment(5,2,"Backpack"));

				
		return bag;
	}
}