public class CharacterStats_Builder_Elf extends CharacterStats_Builder {
	public CharacterStats_Builder_Elf() {
		race = Character.Races.ELF;
	}

	@Override
	public CharacterStats_Builder setStrength() {
		return this;
	}

	@Override
	public CharacterStats_Builder setWisdom() {
		return this;
	}

	@Override
	public CharacterStats_Builder setDexterity() {
		dexBuff++;
		dexBuff++;
		return this;
	}

	@Override
	public CharacterStats_Builder setIntelligence() {
		return this;
	}

	@Override
	public CharacterStats_Builder setConstitution() {
		return this;
	}

	@Override
	public CharacterStats_Builder setCharisma() {
		return this;
	}
	public CharacterStats_Builder setTraits() {
		traits.add(new Trait("Darkvision", "Accustomed to twilit forests and the night sky, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray."));
		traits.add(new Trait("Keen Senses", "You have proficiency in the Perception skill."));
		traits.add(new Trait("Fey Ancestry", "You have advantage on saving throws against being charmed, and magic can’t put you to sleep."));
		traits.add(new Trait("Trance","Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep." ));
		
		
		return this;
	}
	
}