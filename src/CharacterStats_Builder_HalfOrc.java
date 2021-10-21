public class CharacterStats_Builder_HalfOrc extends CharacterStats_Builder {
	public CharacterStats_Builder_HalfOrc() {
		race = Character.Races.HALFORC;
	}

	@Override
	public CharacterStats_Builder setStrength() {
		strBuff++;
		strBuff++;
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
		return this;
	}

	@Override
	public CharacterStats_Builder setCharisma() {
		return this;
	}
	public CharacterStats_Builder setTraits() {
		traits.add(new Trait("Darkvision", "Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray."));
		traits.add(new Trait("Menacing", "You gain proficiency in the Intimidation skill."));
		traits.add(new Trait("Relentless Endurance", "When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest."));
		traits.add(new Trait("Savage Attacks","When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit." ));
		
		
		return this;
	}
	
}