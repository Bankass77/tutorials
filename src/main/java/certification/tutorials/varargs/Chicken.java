package certification.tutorials.varargs;

public class Chicken {

	private void layEggs(int... eggs, int egg) {
	      System.out.print("many " + eggs[0] + " ");
	   }
	   private void layEggs(int eggs) {
	      System.out.print("one " + eggs + " ");
	   }
	   public static void main(String[] args) {
	      var c = new Chicken();
	      c.layEggs(1, 2);
	      c.layEggs(3);
	      c.layEggs(Integer.valueOf(2));
	   }
}
