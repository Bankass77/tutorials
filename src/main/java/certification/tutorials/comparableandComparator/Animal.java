package certification.tutorials.comparableandComparator;

public class Animal implements Comparable<Animal> {

	private int id;

	@Override
	public int compareTo(Animal o) {

		return id - o.id;
	}

	public static void main(String[] args) {

		var al = new Animal();

		var al2 = new Animal();
		al.id = 5;
		al2.id = 7;
		System.out.println(al.compareTo(al2));
		System.out.println(al.compareTo(al));
		System.out.println(al2.compareTo(al));
	}
}
