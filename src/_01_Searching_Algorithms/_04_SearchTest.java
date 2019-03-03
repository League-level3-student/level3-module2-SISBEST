package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		_00_LinearSearch ls = new _00_LinearSearch();
		String [] arr = new String[3];
		arr[0] = "ur mom";
		arr[1] = "suck an egg";
		arr[2] = "beep";
		assertEquals(ls.linearSearch(arr, "ur"), 0);
		assertEquals(ls.linearSearch(arr, "mom"), 0);
		assertEquals(ls.linearSearch(arr, "su"), 1);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
