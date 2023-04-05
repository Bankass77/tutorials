package certification.tutorials.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamFilterWithMax {

	private static void magic(Stream<Integer> s) {
		   Optional o = s.filter(x -> x <5).max((x, y) -> x - y);
		   System.out.println(o.get());
		}
	public static void main(String[] args) {

//StreamFilterWithMax.magic(Stream.empty()); //  throws an exception.
//StreamFilterWithMax.magic(Stream.of(5,10));// throws an exception.
//StreamFilterWithMax.magic(Stream.iterate(1, x->x++));//  runs infinitely.

}
