package certification.tutorials;

public class Ostrich {

	public Ostrich() {
		this("white");
	}

	public Ostrich(String color) {

		color = color;
	}

	public static void main(String[] args) {
		var o = new Ostrich();
		System.out.println("Color:" + o.color);

	}
}
