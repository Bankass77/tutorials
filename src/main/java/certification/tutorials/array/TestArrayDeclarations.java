package certification.tutorials.array;

/**
 * 
 * When creating an array object, a set of elements or size is required.
 * Therefore, lion and bear are incorrect. The brackets containing the size are
 * required to be after the type
 *
 */
public class TestArrayDeclarations {

	public static void main(String[] args) {
		
		//float[] lion = new float[];	//not work
		float[] tiger = new float[1];
		//float[] bear = new[] float;  //not work
		//float[] ohMy = new[1] float; // not work
		
		int[][] scores = new int[5][];
		Object[][][] cubbies = new Object[3][0][5];
		//String beans[] = new beans[6]; // not work
		java.util.Date[] dates[] = new java.util.Date[2][];
		//int[][] types = new int[];  //not work
		//int[][] java = new int[][];   //not work
		
		 [][]String alpha;
		   []String beta;
		   String[][] gamma;
		   String[] delta[];
		   String epsilon[][];
		   var[][] zeta;
	}

}
