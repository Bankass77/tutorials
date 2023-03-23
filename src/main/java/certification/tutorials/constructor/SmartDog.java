package certification.tutorials.constructor;

import lombok.Data;

@Data
public class SmartDog {
	private String name;

	private double price;

	public SmartDog() {
		// Call another constructor with "Unknown" and 0.0 as parameters

		this("Unknow", 0.0);
		// Initialize the name to 'Unknow" and the price to 0.0
		this.name = "Unknown";
		this.price = 0.0;

		System.out.println("Using SmartDog() constructor");
	}

	public SmartDog(String name, double price) {
		// Initialize the name to 'Unknow" and the price to 0.0
		this.name = "Unknown";
		this.price = 0.0;

		System.out.println("Using SmartDog(String name, double price) constructor");
	}

	public void bark() {

		System.out.println(name + " is barking ...");
	}

	public void printDetails() {
		System.out.println("Name : " + this.name);

		if (price > 0.0) {
			System.out.println(", price :" + this.price);
		} else {
			System.out.println(", price : free");
		}
	}
}
