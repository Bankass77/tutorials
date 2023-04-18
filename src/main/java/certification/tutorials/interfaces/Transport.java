package certification.tutorials.interfaces;

public class Transport {
	public static void main(String[] args) {
	      Vehicle vehicle = new Bus();
	      boolean n = null instanceof Bus;
	      boolean v = vehicle instanceof Vehicle;
	      boolean b = vehicle instanceof Bus;
	      System.out.println(n + " " + v + " " + b);
	  }

}
