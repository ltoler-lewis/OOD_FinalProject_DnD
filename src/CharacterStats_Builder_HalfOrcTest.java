import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterStats_Builder_HalfOrcTest {

	CharacterStats_Builder character1_builder;
	Character character1;
	
	@BeforeEach
	void setUp() throws Exception {
		character1_builder = new CharacterStats_Builder_HalfOrc();
		character1 = character1_builder.setStrength().setCharisma().setConstitution().setDexterity().setIntelligence().setWisdom().setTraits().build();
	}

	@Test
	void testSetStrength() {
		assertEquals(character1_builder.strBuff,2,"Strength buff should be 2");
	}

	@Test
	void testSetWisdom() {
		assertEquals(character1_builder.wisBuff,0,"Wisdom buff should be 0");
	}

	@Test
	void testSetDexterity() {
		assertEquals(character1_builder.dexBuff,0,"Dex buff should be 0");
	}

	@Test
	void testSetIntelligence() {
		assertEquals(character1_builder.intBuff,0,"Intelligence buff should be 0");
	}

	@Test
	void testSetConstitution() {
		assertEquals(character1_builder.conBuff,1,"Constitution buff should be 1");
	}

	@Test
	void testSetCharisma() {
		assertEquals(character1_builder.charBuff,0,"Charisma buff should be 0");
	}

	@Test
	void testSetTraits() {
		System.out.print(character1_builder.traits.size());
		assertEquals(character1_builder.traits.size(),4,"4 Traits");
	}
}
