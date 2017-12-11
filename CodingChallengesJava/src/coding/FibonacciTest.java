package coding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
	private Fibonacci fib = new Fibonacci();
	
	@Test
	public void testFibonacci4(){
		int[] answer = {1, 1, 2, 3};
		 assertEquals(fib.getFibonacciNumber(4), answer);
	}
	
	@Test
	public void testFibonacci12(){
		int[] answer = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
		 assertEquals(fib.getFibonacciNumber(12), answer);
	}
	
	@Test
	public void testFibonacci25(){
		int[] answer = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025};
		 assertEquals(fib.getFibonacciNumber(25), answer);
	}

}
