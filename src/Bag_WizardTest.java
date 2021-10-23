import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Bag_WizardTest {
	
	CharacterStats_Builder character1_builder;
	Character character1;
	Bag bag;
	Bag_Factory character1_bagFactory;
	
	@BeforeEach
	void setUp() throws Exception {
		character1_builder = new CharacterStats_Builder_Human();
		character1 = character1_builder.setStrength().setCharisma().setConstitution().setDexterity().setIntelligence().setWisdom().setTraits().build();
		
		character1_bagFactory = new Bag_Wizard();
		bag = character1_bagFactory.createBag(character1);
	}

	@Test
	void testCreateBag() {
		assertEquals(bag.getItemCount(),7,"There should be 7 items");
	}

}
