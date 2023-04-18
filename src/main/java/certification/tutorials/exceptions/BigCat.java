package certification.tutorials.exceptions;

public class BigCat {
	void roar(int level) throws RuntimeException {
	      if(level<3) throw new IllegalArgumentException();
	      System.out.print("Roar!");
	   } }
	public class Lion extends BigCat {
	   public void roar() { System.out.print("Roar!!!"); }
	   @Override void roar(int sound) throws IllegalStateException {
	      System.out.print("Meow");
	   }
	   public static void main(String[] cubs) {
	      final BigCat kitty = new Lion();
	      kitty.roar(2);
	   } 

}
