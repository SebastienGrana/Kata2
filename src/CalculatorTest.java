import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	// Constants to pass to add()
	private static final String EMPTY_STRING = "";
	private static final String ONE_TOKEN_STRING = "1";
	private static final String TWO_TOKEN_STRING = "1,2";
	private static final String MULTI_TOKEN_STRING = "1,2,3";
//	private static final String MULTI_TOKEN_STRING_WITH_FEED = "1 \n 2,3";
	
	// Calculator object
	private Calculator calculator;

	// Initialize Calculator
	@Before
	public void setup() {
		calculator = new Calculator();
	}

	// empty string
	@Test
	public void testEmptyString() {
		int res = calculator.add(EMPTY_STRING);
		assertEquals(0, res);
	}

	// one token
	@Test
	public void testOneTokenString() {
		int res = calculator.add(ONE_TOKEN_STRING);
		assertEquals(1, res);
	}

	// two tokens
	@Test
	public void testTwoTokenString() {
		int res = calculator.add(TWO_TOKEN_STRING);
		assertEquals(3, res);
	}

	// 3 or more tokens
	@Test
	public void testMultiTokenString() {
		int res = calculator.add(MULTI_TOKEN_STRING);
		assertEquals(6, res);
	}
	
	//multi token with line feed
//	@Test
//	public void testMultiTokenStringWithLineFeed() {
//		int res = calculator.add(MULTI_TOKEN_STRING_WITH_FEED);
//		assertEquals(6, res);
//	}
	
}
