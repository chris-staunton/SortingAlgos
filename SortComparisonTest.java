import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
    }
    
    @Test
    public void testInsertionSort() {
    	//SortComparison sorter = new SortComparison();
    	double a[] = {12, 11, 13, 5, 6};
    	double b[] = {5.0, 6.0, 11.0, 12.0, 13.0};
    	assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.insertionSort(a)));
    }
    
    @Test
    public void testSelectionSort() {
    	//SortComparison sorter = new SortComparison();
    	double a[] = {12, 11, 13, 5, 6};
    	double b[] = {5.0, 6.0, 11.0, 12.0, 13.0};
    	assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.selectionSort(a)));
    }
    
    @Test
    public void testQuickSort() {
    	//SortComparison sorter = new SortComparison();
    	double a[] = {12, 11, 13, 5, 6};
    	double b[] = {5.0, 6.0, 11.0, 12.0, 13.0};
    	assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.quickSort(a)));
    }
    
    @Test
    public void testMergeSort() {
    	//SortComparison sorter = new SortComparison();
    	double a[] = {12, 11, 13, 5, 6};
    	double b[] = {5.0, 6.0, 11.0, 12.0, 13.0};
    	assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.mergeSortRecursive(a)));
    }

    
    @Test
    public void testMergeSortIterative() {
    	//SortComparison sorter = new SortComparison();
    	double a[] = {12, 11, 13, 5, 6};
    	double b[] = {5.0, 6.0, 11.0, 12.0, 13.0};
    	assertEquals(Arrays.toString(b), Arrays.toString(SortComparison.mergeSortIterative(a)));
    }


    // TODO: add more tests here. Each line of code and ech decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}
