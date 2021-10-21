public class CharacterStats_Builder_Human extends CharacterStats_Builder {
	public CharacterStats_Builder_Human() {
		race = Character.Races.HUMAN;
	}

	@Override
	public CharacterStats_Builder setStrength() {
		strBuff++;
		return this;
	}

	@Override
	public CharacterStats_Builder setWisdom() {
		wisBuff++;
		return this;
	}

	@Override
	public CharacterStats_Builder setDexterity() {
		dexBuff++;
		return this;
	}

	@Override
	public CharacterStats_Builder setIntelligence() {
		intBuff++;
		return this;
	}

	@Override
	public CharacterStats_Builder setConstitution() {
		conBuff++;
		return this;
	}

	@Override
	public CharacterStats_Builder setCharisma() {
		charBuff++;
		return this;
	}

	@Override
	public CharacterStats_Builder setTraits() {
		// Do nothing
		return this;
	}
	
}