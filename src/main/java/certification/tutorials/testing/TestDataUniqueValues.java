package certification.tutorials.testing;

public class TestDataUniqueValues {
	
	 static int [] array = new int [2];
	
	public static int [] get_array() {
		
	
		
		if (array.length <2) {
			
			throw new AssertionError("less than 2 elements in the array");
			
		}
		return array;
		
	}

	public static int get_expected_result() {
		
		int minValue= 0;
				
		for (int i = 1; i < array.length; ++i) {
			
			if (array[i]<array[minValue]) {
				
				minValue= i;
			}
		}
		
		return minValue;
	}

}
