public class Decorator_Strength extends Decorator_Trait {
	
	public Decorator_Strength(Character chara) {
		this.chara = chara;
	}
 
 
	public int getStrength() {
		return chara.getStr() + 1;
	}
}