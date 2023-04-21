package certification.tutorials.lambda;

public class Scientist {
	 public static void main(String[] courses) {
	      final Study s =new BiologyMaterial();  // h1   can be replace by (x,y)->{return x==null ? y: y+1;}
	      System.out.print(s.learn(courses[0],
	        Integer.parseInt(courses[1])));
	   } 

}
