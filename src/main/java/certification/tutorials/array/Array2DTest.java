package certification.tutorials.array;

/**
 * 
 * This array has two elements, making listing.length output 2. While each array
 * element does not have the same size, this does not matter because we are only
 * looking at the first element. The first element has one
 *
 */
public class Array2DTest {

	public static void main(String[] args) {
		var listing = new String[][] { { "Book" }, { "Game", "29.99" } };
		System.out.println(listing.length + " " + listing[0].length);

	}

}
