package certification.tutorials.classes;

public class Squares {

	
	
	public static long sqaure(int x) {
		
		var y=x* (long)x;
		x=-1;
		return y;
	}
	public static void main(String[] args) {
		
		var value= 9;
		
		var result= sqaure(value);
		System.out.println("value="+value);
		System.out.println("result="+result);
		
		

	}

}
