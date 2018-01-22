package coding;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MagicNumberTest {
	
	@Test
	public void testTwo(){
		assertEquals(25, MagicNumber.findMagicNumber(2));
	}
	
	@Test
	public void testFour(){
		assertEquals(125, MagicNumber.findMagicNumber(4));
	}
	
	@Test
	public void testFive(){
		assertEquals(130, MagicNumber.findMagicNumber(5));
	}
	
	@Test
	public void testZero(){
		assertEquals(0, MagicNumber.findMagicNumber(0));
	}

}
