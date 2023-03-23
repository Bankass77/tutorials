package certification.tutorials.primitive;

public class SwappingPrimitives {

	public static void main(String[] args) {

		int k = 42, q = 44;

		swap(k, q);
		System.out.println("k=" + k);
		System.out.println("q=" + q);

	}

	private static void swap(int k, int q) {

		int temp = k;
		k = q;
		q = temp;

	}

}
