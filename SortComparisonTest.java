import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 * Test class for SortComparison.java
 *
 * @author
 * @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest {
	// ~ Constructor ........................................................
	@Test
	public void testConstructor() {
		new SortComparison();
	}

	// ~ Public Methods ........................................................

	// ----------------------------------------------------------
	/**
	 * Check that the methods work for empty arrays
	 */
	@Test
	public void testEmpty() {
		double a[] = new double[10];
		double b[] = new double[10];
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.insertionSort(a)));
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.selectionSort(a)));
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.quickSort(a)));
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.mergeSortIterative(a)));
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.mergeSortRecursive(a)));

	}

	@Test
	public void testInsertionSort() {
		// SortComparison sorter = new SortComparison();
		double a[] = { 12, 11, 13, 5, 6, 111.7, 45, 68, 0.9999 };
		double b[] = { 0.9999, 5.0, 6.0, 11.0, 12.0, 13.0, 45.0, 68.0, 111.7 };
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.insertionSort(a)));
	}

	@Test
	public void testSelectionSort() {
		// SortComparison sorter = new SortComparison();
		double a[] = { 12, 11, 13, 5, 6 };
		double b[] = { 5.0, 6.0, 11.0, 12.0, 13.0 };
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.selectionSort(a)));
	}

	@Test
	public void testQuickSort() {
		// SortComparison sorter = new SortComparison();
		double a[] = { 12, 11, 13, 5, 6 };
		double b[] = { 5.0, 6.0, 11.0, 12.0, 13.0 };
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.quickSort(a)));
	}

	@Test
	public void testMergeSort() {
		// SortComparison sorter = new SortComparison();
		double a[] = { 12, 11, 13, 5, 6 };
		double b[] = { 5.0, 6.0, 11.0, 12.0, 13.0 };
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.mergeSortRecursive(a)));
	}

	@Test
	public void testMergeSortIterative() {
		// SortComparison sorter = new SortComparison();
		double a[] = { 12, 11, 13, 5, 6 };
		double b[] = { 5.0, 6.0, 11.0, 12.0, 13.0 };
		assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.mergeSortIterative(a)));
	}

	// TODO: add more tests here. Each line of code and ech decision in
	// Collinear.java should
	// be executed at least once from at least one test.

	// ----------------------------------------------------------
	/**
	 * Main Method. Use this main method to create the experiments needed to answer
	 * the experimental performance questions of this assignment.
	 * 
	 * @throws FileNotFoundException
	 *
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO: implement this method
		File file = new File("numbers10.txt");
		Scanner scan = new Scanner(file);
		double[] a = new double[1000];

		int i = 0;

		while (scan.hasNextDouble()) {
			a[i] = scan.nextDouble();
			i++;
		}
		SortComparison.main(args);
	}

}
