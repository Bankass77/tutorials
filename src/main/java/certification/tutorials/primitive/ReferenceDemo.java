package certification.tutorials.primitive;

public class ReferenceDemo {

	public static void main(String[] args) {

		var intContainer = new IntContainer(42);
		var intContainer2 = new IntContainer(44);

		swap(intContainer, intContainer2);

		System.out.println("incontainer=" + intContainer.getValue());
		System.out.println("incontainer2=" + intContainer2.getValue());

	}

	private static void swap(IntContainer intContainer, IntContainer intContainer2) {

		var temp = new IntContainer(intContainer.getValue());
		intContainer = intContainer2;
		intContainer2 = temp;

	}

}
