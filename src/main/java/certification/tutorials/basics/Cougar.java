package certification.tutorials.basics;

public class Cougar implements Hastail {

	@Override
	public int gettailLenght() {

		return 0;
	}

	public int gettailLenght(int lenght) {
		return 2;
	}

	public static void main(String[] args) {
		var puma = new Puma() {
		};

		System.out.println(puma.gettailLenght());
	}

}
