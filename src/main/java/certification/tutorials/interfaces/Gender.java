package certification.tutorials.interfaces;

public enum Gender {
	
	MALE (1, "M"),
	FEMALE (2,"F"),
	UNSPECIFIED(3, "U"){
		
		
		@Override
		public String comment() {
			return  "to be decided later: " + getDescr() + ", " + getRepr();
		}
	};
	
	private final int repr;
	private final String descr;
	private Gender(int repr, String descr) {
		this.repr = repr;
		this.descr = descr;
	}
	public int getRepr() {
		return repr;
	}
	public String getDescr() {
		return descr;
	}

	public String comment() {
		
		return repr + ": " + descr;
	}
	
}
