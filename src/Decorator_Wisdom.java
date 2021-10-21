

public class Decorator_Wisdom extends Decorator_Trait {
	
	public Decorator_Wisdom(Character chara) {
		this.chara = chara;
	}
 
 
	public int getWisdom() {
		return chara.getWis() + 1;
	}
}