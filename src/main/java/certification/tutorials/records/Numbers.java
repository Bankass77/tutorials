package certification.tutorials.records;

import java.util.ArrayList;
import java.util.List;

public record Numbers (int num)  {
	 public int compareTo(Numbers n) {
		 return Integer.compare(n.num, num);
	 }

	 public static void main(String[] args) {
		 //var x = new Numbers(x.com);
		 //var y = new Numbers();
		 List<Numbers> list = new ArrayList<Numbers>();
		 int one = Math.min(5, 3);
		 long two = Math.round(5.5);
		 double three = Math.floor(6.6);
		 var doubles = new double[] {one, two, three};
		 System.out.println("one="+one);
		 System.out.println("two="+two);
		 System.out.println("three="+three);
		 System.out.println("double="+doubles);
	 }
}
