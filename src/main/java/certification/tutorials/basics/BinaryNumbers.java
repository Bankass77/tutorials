package certification.tutorials.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumbers {

	public static int convertDecimalNumberToBinaryNumber(int n) {
		
		
		String binaryStr= "";
		int count =0;
		
		while (n >0) {
			
			int bit= n%2;
			
			binaryStr= bit + binaryStr;
			n  /=2;
			System.out.println(binaryStr);
		}
		
		while (n!=0) {
           count++;
           
           n= n & (n>>1);
		}
		return count;
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		bufferedReader.close();
	}

}
