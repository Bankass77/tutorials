package certification.tutorials.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * Calculez la somme de sablier pour chaque sablier dans A, puis imprimez la
 * somme maximale de sablier.
 *
 */
public class SommeMaxSablier {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, 6).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(Collectors.toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();

		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.size() - 2; i++) {
			for (int j = 0; j < arr.get(i).size() - 2; j++) {
				int currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
						+ arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1)
						+ arr.get(i + 2).get(j + 2);
				maxSum = Math.max(maxSum, currentSum);
			}
		}

		// Imprimer la somme maximale de sablier
		System.out.println(maxSum);
	}

}
