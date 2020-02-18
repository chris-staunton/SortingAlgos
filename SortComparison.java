import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
			while (((a[--j]) > pivot)) {
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


	static double[] recursiveQuick(double[] numbers, int lo, int hi) {
		if (hi <= lo) {
			return numbers;
		}
		int pivotPos = partition(numbers, lo, hi);
		recursiveQuick(numbers, lo, pivotPos - 1);
		recursiveQuick(numbers, pivotPos + 1, hi);
		return numbers;
	}

	static double[] quickSort(double a[]) {
		
		return recursiveQuick(a, 0, a.length - 1);
		// todo: implement the sort

	}// end quicksort

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

	
	
	  
	
	static double[] mergeSort(double arr[], int l, int r) 
	{ 
	   if (l < r) 
	   { 
	      int m = l+(r-l)/2; //Same as (l+r)/2 but avoids overflow for large l & h 
	      mergeSort(arr, l, m); 
	      mergeSort(arr, m+1, r); 
	      merge(arr, l, m, r); 
	   } 
	   
	   return arr;
	} 
	  
	/* Function to merge the two haves arr[l..m] and arr[m+1..r] of array arr[] */
	static void merge(double arr[], int l, int m, int r) 
	{ 
	    int i, j, k; 
	    int n1 = m - l + 1; 
	    int n2 =  r - m; 
	  
	    /* create temp arrays */
	    double L[] = new double[n1];
	    double R[] = new double[n2]; 
	  
	    /* Copy data to temp arrays L[] and R[] */
	    for (i = 0; i < n1; i++) 
	        L[i] = arr[l + i]; 
	    for (j = 0; j < n2; j++) 
	        R[j] = arr[m + 1+ j]; 
	  
	    /* Merge the temp arrays back into arr[l..r]*/
	    i = 0; 
	    j = 0; 
	    k = l; 
	    while (i < n1 && j < n2) 
	    { 
	        if (L[i] <= R[j]) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	        } 
	        else
	        { 
	            arr[k] = R[j]; 
	            j++; 
	        } 
	        k++; 
	    } 
	  
	    /* Copy the remaining elements of L[], if there are any */
	    while (i < n1) 
	    { 
	        arr[k] = L[i]; 
	        i++; 
	        k++; 
	    } 
	  
	    /* Copy the remaining elements of R[], if there are any */
	    while (j < n2) 
	    { 
	        arr[k] = R[j]; 
	        j++; 
	        k++; 
	    } 
	} 
	static double[] mergeSortIterative(double a[]) {
		return mergeSort(a, 0, a.length-1);
		// todo: implement the sort

	}// end mergesortIterative

	/**
	 * Sorts an array of doubles using recursive implementation of Merge Sort. This
	 * method is static, thus it can be called as SortComparison.sort(a)
	 *
	 * @param a: An unsorted array of doubles.
	 * @return after the method returns, the array must be in ascending sorted
	 *         order.
	 */
	static double[] mergeSortRecursive(double a[]) {
		
		double[] aux = new double[a.length];
		return sort(a, aux, 0, a.length-1);

		// todo: implement the sort

	}// end mergeSortRecursive
	
	private static double[] sort(double[] a, double[] aux, int lo, int hi) {
		if (hi<=lo) return a;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
		return a;
	}
	
	private static double[] merge(double[] a, double[]aux, int lo, int mid, int hi) {
		for(int k=lo; k<= hi; k++) {
			aux[k] = a[k];
		}
		
		int i=lo, j = mid+1;
		for(int k= lo; k<=hi; k++) {
			if(i>mid) a[k] = aux[j++];
			else if (j>hi) a[k] = aux[i++];
			else if(aux[j] < aux[i]) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
		
		return a;
	}

	public static void main(String[] args) throws FileNotFoundException {

		// todo: do experiments as per assignment instructions
		
		File file = new File("numbersSorted1000.txt");
    	Scanner scan = new Scanner(file);
    	double[] a = new double[1000];
    
    	int i=0;
    	
    	while(scan.hasNextDouble()) {
    		a[i] = scan.nextDouble();
    		i++;
    	}
    	double[] b = a;
    	double startTime = System.nanoTime();
    	b = selectionSort(b);
    	double endTime = System.nanoTime();
    	double runTime = (endTime - startTime)/1000000;
    	System.out.println("selection sort: " +runTime+ " milliseconds");
    	
     	double[] c = a;
    	double startTimeInsert = System.nanoTime();
    	c = insertionSort(c);
    	double endTimeInsert= System.nanoTime();
    	double runTimeInsert = (endTimeInsert - startTimeInsert)/1000000;
    	System.out.println("insertion sort: " +runTimeInsert+ " milliseconds");
    	
    	double[] d = a;
    	double startTimeQuick = System.nanoTime();
    	d = quickSort(d);
    	double endTimeQuick= System.nanoTime();
    	double runTimeQuick = (endTimeQuick - startTimeQuick)/1000000;
    	System.out.println("quick sort: " +runTimeQuick+ " milliseconds");
    	
    	double[] e = a;
    	double startTimeMergeRecursive = System.nanoTime();
    	e = quickSort(e);
    	double endTimeMergeRecursive= System.nanoTime();
    	double runTimeMergeRecursive = (endTimeMergeRecursive - startTimeMergeRecursive)/1000000;
    	System.out.println("Merge sort recursive: " +runTimeMergeRecursive+ " milliseconds");
    	
    	double[] f = a;
    	double startTimeMerge = System.nanoTime();
    	f = quickSort(f);
    	double endTimeMerge= System.nanoTime();
    	double runTimeMerge = (endTimeMerge - startTimeMerge)/1000000;
    	System.out.println("Merge sort: " +runTimeMerge+ " milliseconds");
	}

}// end class
