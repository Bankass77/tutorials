package certification.tutorials.records;

public record Fruit(Name n) {

	public static void main(String [] vitamins) {
		
		var x= new Name("Apple");
		System.out.println(new Fruit(x));
	}

}
