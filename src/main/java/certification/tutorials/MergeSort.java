package certification.tutorials;

public class MergeSort<T extends Comparable<T>> implements InPlaceSort<T> {

	@Override
	public void sort(T[] elements) {

		T[] arr = (T[]) new Comparable[elements.length];
		sort(elements, arr, 0, elements.length - 1);
	}

	private void sort(T[] elements, T[] arr, int low, int high) {

		if (low >= high) {
			return;
		}

		int mid = low + (high - low) / 2;
		sort(elements, arr, low, mid);
		sort(elements, arr, mid + 1, high);
		merge(elements, arr, low, high, mid);

	}

	private void merge(T[] a, T[] b, int low, int high, int mid) {

		int i = low;
		int j = mid + 1;

		for (int k = low; k < high; k++) {

			if (i <= mid && j <= high) {
				if (a[i].compareTo(a[j]) >= 0) {
					b[k] = a[j++];
				} else {
					b[k] = a[i++];
				}
			} else if (j > high && i <= mid) {
				b[k] = a[i++];
			} else if (i > mid && j <= high) {
				b[k] = a[j++];
			}
		}
		for (int j2 = low; j2 <= high; j2++) {

			a[j2] = b[j2];
		}
	}

}
