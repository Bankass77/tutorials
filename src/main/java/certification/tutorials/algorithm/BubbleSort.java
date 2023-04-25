package certification.tutorials.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BubbleSort {

    public static int[] array(int[] a) {

        int n = a.length;

        if (a.length < 2) {

            return a;
        }

        int firstElement = 0;
        int lastElement = 0;
        int numSwaps = 0;

        for (int i = 0; i < n; i++) {

            // Track the number of elements swapped during a single traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order

                if (a[j] > a[j + 1]) {

                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }

            }

            // If no elements were swapped during the traversal, array is sorted

            if (numberOfSwaps == 0) {
                break;

            }
            numSwaps += numberOfSwaps;

            firstElement = a[0];
            lastElement = a[n - 1];
        }

        System.out.println("Array is sorted in " + numSwaps + " " + "swaps");
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element :" + lastElement);

        return a;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = a.get(i);
        }
        array(tab);
        bufferedReader.close();

    }

}
