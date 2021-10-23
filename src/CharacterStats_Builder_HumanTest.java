import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterStats_Builder_HumanTest {
	
	CharacterStats_Builder character1_builder;
	Character character1;
	
	@BeforeEach
	void setUp() throws Exception {
		character1_builder = new CharacterStats_Builder_Human();
		character1 = character1_builder.setStrength().setCharisma().setConstitution().setDexterity().setIntelligence().setWisdom().setTraits().build();
	}

	@Test
	void testSetStrength() {
		assertEquals(character1_builder.strBuff,1,"Strength buff should be 1");
	}

	@Test
	void testSetWisdom() {
		assertEquals(character1_builder.wisBuff,1,"Wisdom buff should be 1");
	}

	@Test
	void testSetDexterity() {
		assertEquals(character1_builder.dexBuff,1,"Dex buff should be 1");
	}

	@Test
	void testSetIntelligence() {
		assertEquals(character1_builder.intBuff,1,"Intelligence buff should be 1");
	}

	@Test
	void testSetConstitution() {
		assertEquals(character1_builder.conBuff,1,"Constitution buff should be 1");
	}

	@Test
	void testSetCharisma() {
		assertEquals(character1_builder.charBuff,1,"Charisma buff should be 1");
	}

	@Test
	void testSetTraits() {
		System.out.print(character1_builder.traits.size());
		assertEquals(character1_builder.traits.size(),0,"No Traits");
	}


}
