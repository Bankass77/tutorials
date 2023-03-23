package certification.tutorials.checkTest;

public class TestYieldSwitchStatement {

	public static void main(String[] args) {
		final int score1=8, score2=3;
		char myScore=7;
		
		var goal= switch (myScore) {
		
		default ->{
			if( 10 >score1)
				yield "unknow";
		}
		
		case score1-> "great";
		case 2, 4, 6 ->"good";
		case score2, 0->{"bad"; yield "know";}

	};
	System.out.println(goal);

}
}
