package certification.tutorials.OOP;

public class Temperature {

	public double t = 25;

	public double getCelcius() {
		return t;
	}

	final public double getFahrenheit() {

		return t * 9 / 5 + 32;
	}
}
