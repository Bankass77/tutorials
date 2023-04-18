package certification.tutorials.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Given an integer,n , print its first 10 multiples. Each multiple nxi (where 1<=i<=10 ) should be printed on a new line in the form: n x i = result.
 * @param args
 * @throws IOException
 */
public class PrintFirstMultiples {

	public static void main(String[] args)  throws IOException{

		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());

		for (int i = 1; i <= 10; i++) {
		        int result = n * i;
		        System.out.println(String.format("%d x %d = %d", n, i, result));
		    }

		        bufferedReader.close();
		    }
		

	}

}
