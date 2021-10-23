
public class Bag_Fighter extends Bag_Factory {

	

	Bag createBag(Character c) {
		Bag bag = new Bag(c);
		
		bag.addItem(new Equipment(0,0,"Starting clothes (weigh nothing)"));
		bag.addItem(new Equipment(5, 50, "Scale Mail Armor"));
		bag.addItem(new Weapon(6,50,"Greatsword", 2, 6));
		bag.addItem(new Weapon(2,2,"Shortbow", 1, 6));
		bag.addItem(new Equipment(5,2,"Quiver with 20 Arrows"));
		bag.addItem(new Equipment(0,2,"Backpack"));


		return bag;
	}
}