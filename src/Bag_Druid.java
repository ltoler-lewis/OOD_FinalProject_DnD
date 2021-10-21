
public class Bag_Druid extends Bag_Factory {

	

	Bag createBag(Character c) {
		Bag bag = new Bag(c);
		
		bag.addItem(new Equipment(0,0,"Starting clothes (weigh nothing)"));
		bag.addItem(new Equipment(12, 10, "Hide Armor"));
		bag.addItem(new Equipment(10,7,"Wooden Shield"));
		bag.addItem(new Weapon(3,10,"Scimitar", 1, 6));
		bag.addItem(new Equipment(5,2,"Backpack"));
		bag.addItem(new Equipment(0,0,"Druidic Focus (Holly)"));
				
		return bag;
	}
}