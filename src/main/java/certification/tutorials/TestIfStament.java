package certification.tutorials;

public class TestIfStament {

	public static void main(String[] args) {
		int temperature = 4;
		long humidity = -temperature + temperature * 3;

		if (temperature >= 4)
			if (temperature < 6)
				System.out.println("Too low");
			else
				System.out.println("Just Right");
		else
			System.out.println("Too High");

	}
}
