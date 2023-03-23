package certification.tutorials.classes;

public class Lion {

	
	public class Club{}
	
	static class Den {}
	
	public static void rest() {}
	
	
	public static void main(String[] args) {
		
		
		Club club= new Lion().new Club();
		
		 var club2= new Lion().new Club();
		 
		 var den = new Den();
		 var den2= new Lion.Den();
		 
		
		
	}

}
