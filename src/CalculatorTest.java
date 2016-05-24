import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		Calculator calc = new Calculator();
		int res = calc.add("");
		assertEquals(0,res);
	}
	
	@Test
	public void testOneString() {
		Calculator calc = new Calculator();
		int res = calc.add("1");
		assertEquals(1,res);
	}

	@Test
	public void testFullString() {
		Calculator calc = new Calculator();
		int res = calc.add("1,2,3");
		assertEquals(6,res);
	}
}
