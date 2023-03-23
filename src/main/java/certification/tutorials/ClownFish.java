package certification.tutorials;

public class ClownFish implements Aquatic {
	String getNumOfGills() {
		return "14";
	}

	public int getNumOfGills(int p) {
		return 15;
	}

	public static void main(String[] args) {
		System.out.println(new ClownFish().getNumOfGills(-1));
	}
}
