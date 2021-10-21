public class Trait{
	String name;
	String description;
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public Trait(String n, String d) {
		name = n;
		description = d;
	}
}