import java.util.Random;
import java.util.Arrays;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public abstract class CharacterStats_Builder {
	


	//String name;
	Character.Races race;
	int strBuff;
	int wisBuff;
	int intBuff;
	int dexBuff;
	int charBuff;
	int conBuff;
	List<Trait> traits;
	//List<String> toppings = new ArrayList<String>();
	
	
	
	public abstract CharacterStats_Builder setStrength();
	public abstract CharacterStats_Builder setWisdom();
	public abstract CharacterStats_Builder setDexterity();
	public abstract CharacterStats_Builder setIntelligence();
	public abstract CharacterStats_Builder setConstitution();
	public abstract CharacterStats_Builder setCharisma();
	public abstract CharacterStats_Builder setTraits();
	
	private int RandomStatGenerator() {
		Random rand = new Random(); //instance of random class
	    int upperbound = 6;
	    int lowerbound = 1;
		int [] diceRoll = {rand.nextInt(upperbound-lowerbound)+lowerbound, rand.nextInt(upperbound-lowerbound)+lowerbound, 
				rand.nextInt(upperbound-lowerbound)+lowerbound, rand.nextInt(upperbound-lowerbound)+lowerbound, rand.nextInt(upperbound-lowerbound)+lowerbound,
				rand.nextInt(upperbound-lowerbound)+lowerbound};
		Arrays.sort(diceRoll);
		return (diceRoll[0] + diceRoll[1] + diceRoll[2]);
	}
	
	public Character build() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Character chara = new Character();
				
		chara.setRace(this.race);
		//chara.addToppings(toppings);
		chara.setStr(RandomStatGenerator() + strBuff);
		chara.setWis(RandomStatGenerator() + wisBuff);
		chara.setInt(RandomStatGenerator() + intBuff);
		chara.setChar(RandomStatGenerator() + charBuff);
		chara.setCon(RandomStatGenerator() + conBuff);
		chara.setDex(RandomStatGenerator() + dexBuff);
		chara.setTraits(traits);
		
		return chara;
	}
}