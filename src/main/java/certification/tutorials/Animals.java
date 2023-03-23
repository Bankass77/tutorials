package certification.tutorials;

public enum Animals {
	MAMMAL(true), INVERTEBRATE(Boolean.FALSE), BIRD(false),REPTILE(false), AMPHIBIAN(false), FISH(false){
		public int swing() {
			return 4;
		}
	}
	
	final boolean hasHair;
	public Animals(boolean hasHair) {
		this.hasHair=hasHair;
	}

	
	public boolean hasHair() {
		return hasHair;
	}
	
	public int swing() {
		return 0;
	}
}
