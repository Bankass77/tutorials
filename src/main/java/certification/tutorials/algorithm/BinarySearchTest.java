package certification.tutorials.algorithm;

import junit.framework.AssertionFailedError;

public class BinarySearchTest {
	
	public int indexOfTargetInArray( int [] array, int target) {
		
		int L=0, R= array.length-1;
		
		 while (L < R) {
			
			 int M= (L+R)/2;
			 
			 if (array[M]<target) {
				L= M+1;
			}else {
				
				R=M;
			}
		}
		return (array[L] <target) ? L+1: L;
	}

	public static void main(String[] args) {
		
	}

}
