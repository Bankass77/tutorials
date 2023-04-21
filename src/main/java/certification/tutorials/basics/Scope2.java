package certification.tutorials.basics;

import java.util.Scanner;

public class Scope2 {

	int[] _element;
	int min = 0;
	int max = 0;
	int maximumDifference;

	public Scope2(int[] array) {

		this._element = array;

	}

	public int computeDifference() {
		int min = _element[0];
		int max = _element[0];
		for (int i = 1; i < _element.length; i++) {
			if (_element[i] < min) {
				min = _element[i];
			}
			if (_element[i] > max) {
				max = _element[i];
			}
		}
		return maximumDifference = Math.abs(max - min);
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the values of the table");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Scope2 difference = new Scope2(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
