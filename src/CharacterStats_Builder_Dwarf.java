public class CharacterStats_Builder_Dwarf extends CharacterStats_Builder {
	public CharacterStats_Builder_Dwarf() {
		race = Character.Races.DWARF;
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
		return this;
	}

	@Override
	public CharacterStats_Builder setIntelligence() {
		return this;
	}

	@Override
	public CharacterStats_Builder setConstitution() {
		conBuff++;
		conBuff++;
		return this;
	}

	@Override
	public CharacterStats_Builder setCharisma() {
		return this;
	}
	public CharacterStats_Builder setTraits() {
		traits.add(new Trait("Darkvision", "Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray."));
		traits.add(new Trait("Dwarven Resilience", "You have advantage on saving throws against poison, and you have resistance against poison damage"));
		traits.add(new Trait("Dwarven Combat Training", "You have proficiency with the battleaxe, handaxe, light hammer, and warhammer."));
		traits.add(new Trait("Stonecunning", "Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus."));
		
		
		return this;
	}
	
}