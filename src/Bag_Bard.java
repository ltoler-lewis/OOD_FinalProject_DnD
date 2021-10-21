
public class Bag_Bard extends Bag_Factory {

	

	Bag createBag(Character c) {
		Bag bag = new Bag(c);
		
		bag.addItem(new Equipment(0,0,"Starting clothes (weigh nothing)"));
		bag.addItem(new Equipment(10, 45, "Studded Leather Armor"));
		bag.addItem(new Weapon(3,15,"Longsword", 1, 8));
		bag.addItem(new Weapon(2,2,"Light Crossbow", 1, 6));
		bag.addItem(new Equipment(1,10,"Case with 10 Crossbow Bolts"));
		bag.addItem(new Equipment(2,35,"Lute (Common)"));
		bag.addItem(new Equipment(5,2,"Backpack"));


				
		return bag;
	}
}