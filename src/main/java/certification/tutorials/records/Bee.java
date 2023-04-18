package certification.tutorials.records;

/**
 * 
 * Line 18 does not compile because a compact constructor must have the same
 * public access as the record itself. Lines 19 and 20 do not compile because
 * compact constructors cannot set field values with this. They can only modify
 * constructor parameters. The constructor on line 24 compiles, as the access
 * modifier does not need to match for non-compact constructors and chained
 * constructors. Line 29 does not compile because species() is supplied by the
 * record, which does not match getSpecies(). In this case, using the @Override
 * annotation triggers a compiler error. Finally, the toString() override is
 * correct. Since four lines do not compile.
 *
 */
public record Bee(boolean gender, String species) {

	Bee {
		this.gender = gender;
		this.species = species;

	}

	Bee(boolean gender) {
		this(gender, "HoneyBee");
	}

	@Override
	public String getSpecies() {
		return species;
	}

	@Override
	public String toString() {
		return species;
	}
}
