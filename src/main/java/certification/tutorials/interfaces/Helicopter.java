package certification.tutorials.interfaces;

public class Helicopter extends Rotorcraft implements CanFly {
	   private int height = 10;
	   protected int fly() {
	      return super.height;
	   }
	   public static void main(String[] unused) {
	      Helicopter h = (Helicopter)new Rotorcraft();
	      System.out.print(h.fly());
	   } }