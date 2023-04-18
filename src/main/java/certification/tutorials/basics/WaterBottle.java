package certification.tutorials.basics;

/**
 * 
 * The question does not compile because line 25 and line 30 do not always
 * return a value in the case block, which is required when a switch expression
 * is used in an assignment operation. Line 25 is missing a yield statement when
 * the if statement evaluates to false, while line 30 is missing a yield
 * statement entirely. Since two lines don’t compile
 *
 */
public class WaterBottle {
	private String brand;
	private boolean empty;
	public static float code;

	public static void main(String[] args) {
		 WaterBottle wb = new WaterBottle();
		 System.out.println("Empty = " + wb.empty);
		 System.out.println("Brand = " + wb.brand);
		 System.out.println("Code = " + code);
		 final int score1 = 8, score2 = 3;
		 char myScore = 7;
		 var goal = switch (myScore) {
		 default -> {
			 if(10>score1)  yield "unknown";
		 }
		 case  score1-> "great";
		 case 2, 4,6 -> "good";
		 case score2, 0 ->{
			 "bad";
		 }
		 };
		 System.out.println(goal);
	}
}
