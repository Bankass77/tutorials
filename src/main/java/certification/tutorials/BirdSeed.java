package certification.tutorials;

public class BirdSeed {
	private int numberBags;
	boolean call;

	public BirdSeed() {
		// LINE 1

		// this(2);
		call = false;
		// LINE 2

	}

	public BirdSeed(int numberBags) {
		this.numberBags = numberBags;
	}

	public void method() {
		x((var x) -> {
		}, (var x, var y) -> false);
	}

	public static void main(String[] args) {
		var seed = new BirdSeed();
		System.out.print(seed.numberBags);
	}

}
