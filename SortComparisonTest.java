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
 * @author Christopher Staunton
 * @version HT 2020
 * 
 * 		*timing in milliseconds*
 * 							Insert 	Selection 	Merge 	Recursive	 Merge 	Iterative 	Quick
 * 10 random				0.0016	0.0020		0.0037				0.0054				0.0028
 * 100 random				0.0298	0.0709		0.0312				0.0429				0.0166
 * 1000 random				0.9468	1.9042		0.1405				0.4478				0.1370
 * 1000 few unique			1.9853	1.2813		0.1398				0.1784				0.1114
 * 1000 nearly ordered		1.3136	1.8000		0.1121				0.1830				0.2403
 * 1000 reverse order		2.7691	2.5155		0.1349				0.2076				0.2553
 * 1000 sorted				0.5017	2.0137		0.1605				0.1617				0.2283
 * 
 * 
 * 
 * a. Which of the sorting algorithms does the order of input have an impact on? Why?
 * The order of input has the biggest impact on insertion sort.
 * 
 * b. Which algorithm has the biggest difference between the best and worst performance, based
 * on the type of input, for the input of size 1000? Why? Insertion Sort, this has the biggest difference between the best 
 * and worst performance as the best case is theta(n) and worst is O(n^2). The best occurs when the array 
 * is already sorted (only has to compare each value once), the worst occurs when array is reverse ordered
 * (algo has to compare and move each value)
 *  
 * 
 * 
 * c. Which algorithm has the best/worst scalability, i.e., the difference in performance time
 * based on the input size? Please consider only input files with random order for this answer.
 * From my experiments it appears that quick sort has the best scalability. The worst scalability is Selection Sort.
 * 
 * d. Did you observe any difference between iterative and recursive implementations of merge
 * sort? They are both fairly similar, however recursive is slightly faster in all of my implementations.
 * the 1000 random merge iterative time may be an outlier. 
 * 
 * e. Which algorithm is the fastest for each of the 7 input files?
 * mergeSort recursive. It is close between quick and merge recursive however in the bigger input files, 
 * recursive performs better.
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
		File file = new File("numbersSorted1000.txt");
    	Scanner scan = new Scanner(file);
    	int sizeOfArray = 1000;
    	//double[] a = new double[1000];
    	double[] b = new double[sizeOfArray];
    	double[] c = new double[sizeOfArray];
    	double[] d = new double[sizeOfArray];
    	double[] e = new double[sizeOfArray];
    	double[] f = new double[sizeOfArray];
    	int i=0;
    	
    	while(scan.hasNextDouble()) {
    		b[i] = scan.nextDouble();
    		c[i] = scan.nextDouble();
    		d[i] = scan.nextDouble();
    		e[i] = scan.nextDouble();
    		f[i] = scan.nextDouble();
    		i++;
    	}
    	
    	double startTime = System.nanoTime();
    	b = SortComparison.selectionSort(b);
    	double endTime = System.nanoTime();
    	double runTime = (endTime - startTime)/1E6;
    	System.out.println("selection sort: " +runTime+ " milliseconds");
    	
     	
    	double startTimeInsert = System.nanoTime();
    	c = SortComparison.insertionSort(c);
    	double endTimeInsert= System.nanoTime();
    	double runTimeInsert = (endTimeInsert - startTimeInsert)/1E6;
    	System.out.println("insertion sort: " +runTimeInsert+ " milliseconds");
    	
    	//double[] d = a;
    	double startTimeQuick = System.nanoTime();
    	d = SortComparison.quickSort(d);
    	double endTimeQuick= System.nanoTime();
    	double runTimeQuick = (endTimeQuick - startTimeQuick)/1E6;
    	System.out.println("quick sort: " +runTimeQuick+ " milliseconds");
    	
    	//double[] e = a;
    	double startTimeMergeRecursive = System.nanoTime();
    	e = SortComparison.mergeSortRecursive(e);
    	double endTimeMergeRecursive= System.nanoTime();
    	double runTimeMergeRecursive = (endTimeMergeRecursive - startTimeMergeRecursive)/1E6;
    	System.out.println("Merge sort recursive: " +runTimeMergeRecursive+ " milliseconds");
    	
    //	double[] f = a;
    	double startTimeMerge = System.nanoTime();
    	f = SortComparison.mergeSortIterative(f);
    	double endTimeMerge= System.nanoTime();
    	double runTimeMerge = (endTimeMerge - startTimeMerge)/1E6;
    	System.out.println("Merge sort: " +runTimeMerge+ " milliseconds");
    	
	}

}
