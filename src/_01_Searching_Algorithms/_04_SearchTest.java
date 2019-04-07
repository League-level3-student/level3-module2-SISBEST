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
		_01_BinarySearch bs = new _01_BinarySearch();
		int [] arr = new int[3];
		arr[0] = 1111111111;
		arr[1] = 222222;
		arr[2] = 3333;
		assertEquals(bs.binarySearch(arr, 0, 2, 0), -1);
		assertEquals(bs.binarySearch(arr, 0, 2, 1), -1);
		assertEquals(bs.binarySearch(arr, 0, 2, 2), -1);
	}
	
	@Test
	public void testInterpolationSearch() {
		_02_InterpolationSearch is = new _02_InterpolationSearch();
		int [] arr = new int[3];
		arr[0] = 11111;
		arr[1] = 22222;
		arr[2] = 33333;
		assertEquals(is.interpolationSearch(arr, 1), -1);
		assertEquals(is.interpolationSearch(arr, 2), -1);
		assertEquals(is.interpolationSearch(arr, 3), -1);
	}
	
	@Test
	public void testExponentialSearch() {
		_03_ExponentialSearch es = new _03_ExponentialSearch();
		int [] arr = new int[3];
		arr[0] = 1111111111;
		arr[1] = 222222;
		arr[2] = 3333;
		assertEquals(es.exponentialSearch(arr, 0), -1);
		assertEquals(es.exponentialSearch(arr, 83883), -1);
		assertEquals(es.exponentialSearch(arr, 939), -1);
	}
}
