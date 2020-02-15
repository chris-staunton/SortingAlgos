// -------------------------------------------------------------------------

/**
 * This class contains static methods that implementing sorting of an array of
 * numbers using different sort algorithms.
 *
 * @author
 * @version HT 2020
 */

class SortComparison {

	/**
	 * Sorts an array of doubles using InsertionSort. This method is static, thus it
	 * can be called as SortComparison.sort(a)
	 * 
	 * @param a: An unsorted array of doubles.
	 * @return array sorted in ascending order.
	 *
	 */
	static double[] insertionSort(double a[]) {

		// todo: implement the sort

		for (int i = 1; i < a.length; i++) {
			double tmp = a[i];
			int j = i;

			while (j > 0 && tmp < a[j - 1]) {
				a[j] = a[j - 1];
				j = j - 1;
			}
			a[j] = tmp;
		}
		return a;
	}// end insertionsort

	/**
	 * Sorts an array of doubles using Selection Sort. This method is static, thus
	 * it can be called as SortComparison.sort(a)
	 * 
	 * @param a: An unsorted array of doubles.
	 * @return array sorted in ascending order
	 *
	 */
	static double[] selectionSort(double a[]) {

		// todo: implement the sort
		for (int i = 0; i < a.length; i++) {
			int minIndex = i;
			// int j ;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}

			}
			// swap
			double tmp = a[minIndex];
			a[minIndex] = a[i];
			a[i] = tmp;
		}
		return a;
	}// end selectionsort

	/**
	 * Sorts an array of doubles using Quick Sort. This method is static, thus it
	 * can be called as SortComparison.sort(a)
	 * 
	 * @param a: An unsorted array of doubles.
	 * @return array sorted in ascending order
	 *
	 */

	private static int partition(double a[], int low, int hi) {
		int i = low;
		int j = hi + 1;
		double pivot = a[low];
		while (true) {
			while ((a[++i] < pivot)) {
				if (i == hi)
					break;
			}
			while (((a[--j]) < pivot)) {
				if (j == low)
					break;
			}
			if (i >= j)
				break;
			double temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		a[low] = a[j];
		a[j] = pivot;
		return j;

	}

	public void sort(double[] a) {
		recursiveQuick(a, 0, a.length - 1);
	}

	static double[] recursiveQuick(double[] numbers, int lo, int hi) {
		if (hi <= lo) {
			return numbers;
		}
		int pivotPos = partition(numbers, lo, hi);
		recursiveQuick(numbers, lo, pivotPos - 1);
		recursiveQuick(numbers, pivotPos + 1, hi);
		return numbers;
	}

//	static double[] quickSort(double a[]) {
//		if ((a.length <= 1)) {
//			return a;
//		}
//
//		// todo: implement the sort
//
//	}// end quicksort

	/**
	 * Sorts an array of doubles using Merge Sort. This method is static, thus it
	 * can be called as SortComparison.sort(a)
	 * 
	 * @param a: An unsorted array of doubles.
	 * @return array sorted in ascending order
	 *
	 */
	/**
	 * Sorts an array of doubles using iterative implementation of Merge Sort. This
	 * method is static, thus it can be called as SortComparison.sort(a)
	 *
	 * @param a: An unsorted array of doubles.
	 * @return after the method returns, the array must be in ascending sorted
	 *         order.
	 */

	// static double[] mergeSortIterative(double a[]) {

	// 	// todo: implement the sort

	// }// end mergesortIterative

	/**
	 * Sorts an array of doubles using recursive implementation of Merge Sort. This
	 * method is static, thus it can be called as SortComparison.sort(a)
	 *
	 * @param a: An unsorted array of doubles.
	 * @return after the method returns, the array must be in ascending sorted
	 *         order.
	 */
	// static double[] mergeSortRecursive(double a[]) {

	// 	// todo: implement the sort

	// }// end mergeSortRecursive

// 	public static void main(String[] args) {

// 		// todo: do experiments as per assignment instructions
// 	}

 }// end class
