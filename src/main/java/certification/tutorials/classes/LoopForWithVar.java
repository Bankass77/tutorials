package certification.tutorials.classes;

public class LoopForWithVar {

	public static void main(String[] args) {
		for(var a = 0; a<10; ++a) {
			   a++;
			   System.out.print("A");
			}
			for(var b = 1; b<10; b++) {
			   System.out.print("B");
			   b += 2;
			}
			for(var c = 4; c<5; c+=10) {
			   System.out.print("C");
			}

	}

}
