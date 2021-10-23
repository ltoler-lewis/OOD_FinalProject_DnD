import java.util.*;

public class Character{
	private
		int strength;
		int intelligence;
		int charisma;
		int wisdom;
		int dexterity;
		int constitution;
		
		int level;
		int xp;
		int health;
		
		int speed;
		double height;
		
		String name;
	public
		enum Races{
			//For brevity, we will not implement all 9 base races
			HUMAN, ELF, DWARF, HALFORC
		}
		
		enum Classes{
			//BARBARIAN, BARD, CLERIC, DRUID, FIGHTER, MONK, PALADIN, RANGER, ROGUE, SORCERER, WARLOCK, WIZARD
			//Also not implementing them all for brevity
			DRUID, FIGHTER, WIZARD, BARD
		}
		
		enum Alignment{
			LAW_GOOD,LAW_NEU,LAW_EVIL,
			NEU_GOOD,TRUE_NEU,NEU_EVIL,
			CHAO_GOOD,CHAO_NEU,CHAO_EVIL
		}
		
		Races race;
		Classes class_DnD;
		Alignment align;
		
		int hitDice;
		
		List<Trait> traits;
		
		List<Observer> str_observers= new ArrayList<Observer>();
		
		Bag bag;
		Weapon weapon;
	
	
	private String getAlignmentString() {
		if(align==Alignment.LAW_GOOD) {
			return "Lawful Good";
		}else if (align == Alignment.NEU_GOOD) {
			return "Neutral Good";
		}else if (align == Alignment.CHAO_GOOD) {
			return "Chaotic Good";
		}else if (align == Alignment.LAW_NEU) {
			return "Lawful Neutral";
		}else if (align == Alignment.TRUE_NEU) {
			return "True Neutral";
		}else if (align == Alignment.CHAO_NEU) {
			return "Chaotic Neutral";
		}else if (align == Alignment.LAW_EVIL) {
			return "Lawful Evil";
		}else if (align == Alignment.NEU_EVIL) {
			return "Neutral Evil";
		}else if (align == Alignment.CHAO_EVIL) {
			return "Chaotic Evil";
		}else {
			return "(No alignment defined)";
		}
	}
	
	private String getRaceString() {
		if(race==Races.HUMAN) {
			return "Human";
		}else if (race==Races.DWARF) {
			return "DWARF";
		}else if (race==Races.ELF) {
			return "Elf";
		}else if (race==Races.HALFORC) {
			return "Half-Orc";
		}else {
			return "(No race defined)";
		}
	}
	
	private String getClassString() {
		if(class_DnD == Classes.DRUID) {
			return "Druid";
		}else if (class_DnD == Classes.FIGHTER) {
			return "Fighter";
		}else if (class_DnD == Classes.WIZARD) {
			return "Wizard";
		}else if (class_DnD == Classes.BARD) {
			return "Bard";
		}else {
			return "(No class defined)";
		}
	}
	
	public void registerSTRObserver(Observer o) {

		//System.out.println("Register observer");
		if (o == null || str_observers == null) {
			System.out.println("Failed to register observer");
		}else {
			boolean b = str_observers.add(o);
			//System.out.println(b);
		}
	}
	
	public void updateObservers() {
		for (int x = 0; x < str_observers.size(); x++) {
			str_observers.get(x).update(x);
		}
	}
	
	public int getStr() {
		return strength;
	}
	
	public int getInt() {
		return intelligence;
	}
	
	public int getChar() {
		return charisma;
	}
	
	public int getWis() {
		return wisdom;
	}
	
	public int getDex() {
		return dexterity;
	}
	
	public int getCon() {
		return constitution;
	}
	
	public void setStr(int x) {
		strength = x;
	}
	
	public void setInt(int x) {
		intelligence = x;
	}
	
	public void setChar(int x) {
		charisma = x;
	}
	
	public void setWis(int x) {
		wisdom = x;
	}
	
	public void setDex(int x) {
		dexterity = x;
	}
	
	public void setCon(int x) {
		constitution = x;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setRace(Races r) {
		race = r;
	}
	
	public void setClass(Classes c) {
		class_DnD = c;
	}
	
	public void setAlign(Alignment a) {
		align = a;
	}
	
	public void setTraits(List<Trait> t) {
		traits = t;
	}
	
	public void addTrait(Trait t) {
		traits.add(t);
	}
	
	public void addBag(Bag b) {
		bag = b;
	}

	public void printCharacter() {
		System.out.println("\n\nYour name is " + name + ". You are a " + getAlignmentString() + " " + getRaceString() + " " + getClassString() + ".\n");
		System.out.println("Your stats are:\n" + "Strength: " + strength + "\nDexterity: " + dexterity + "\nConstitution: " + constitution + "\nIntelligence: " + intelligence + "\nWisdom: " + wisdom + "\nCharisma: " + charisma + "\n");
		System.out.println("Your traits are: ");
		if(traits.size()!=0) {
			for(int x=0; x< traits.size(); x++) {
				System.out.println("         " + traits.get(x).name + " " + traits.get(x).description);
			}
		}
			
	}


}