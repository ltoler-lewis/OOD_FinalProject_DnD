

public class Playtime {
	
	
	public static void main(String args[]) {
		
		//Character1 - True Neutral Human Druid
		CharacterStats_Builder character1_builder = new CharacterStats_Builder_Human();
		Bag_Factory character1_bagFactory = new Bag_Druid();
		
		Character character1 = character1_builder.setStrength().setCharisma().setConstitution().setDexterity().setIntelligence().setWisdom().setTraits().build();
		
		Bag bag1 = character1_bagFactory.createBag(character1);
		character1.addBag(bag1);
		character1.setAlign(Character.Alignment.TRUE_NEU);
		character1.setName("Steve");
		character1.setClass(Character.Classes.DRUID);
		character1.printCharacter();
		character1.bag.printContents();
		
		
		//character2 - Chaotic good half-orc fighter
		CharacterStats_Builder character2_builder = new CharacterStats_Builder_HalfOrc();
		Bag_Factory character2_bagFactory = new Bag_Fighter();
		
		Character character2 = character2_builder.setStrength().setCharisma().setConstitution().setDexterity().setIntelligence().setWisdom().setTraits().build();
		
		Bag bag2 = character2_bagFactory.createBag(character2);
		character2.addBag(bag2);
		character2.setAlign(Character.Alignment.CHAO_GOOD);
		character2.setName("Phil");
		character2.setClass(Character.Classes.FIGHTER);
		character2.printCharacter();
		character2.bag.printContents();
		
		
	}

	
}