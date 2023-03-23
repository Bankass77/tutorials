package certification.tutorials.OOP;

//Overloading with methods parameters
public class Age {

	public double a = 0;

	public void setAge(double _a) {
		a = _a;
	}

	public void setAget(int year, int month) {

		a = year + (double) month / 12;
	}

	public double getAge() {

		return a;
	}

}
