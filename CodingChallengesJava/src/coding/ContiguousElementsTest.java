package coding;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class ContiguousElementsTest {
	
	@Test
	public void test1(){
		ContiguousElements ce = new ContiguousElements();
		int arr[] = {10, 12, 11};
		assertTrue(ce.findLength(arr) == 3);
	}
	
	@Test
	public void test2(){
		ContiguousElements ce = new ContiguousElements();
		int arr[] = {14, 12, 11, 20};
		assertTrue(ce.findLength(arr) == 2);
	}

	@Test
	public void test3(){
		ContiguousElements ce = new ContiguousElements();
		int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
		assertTrue(ce.findLength(arr) == 5);
	}
}
