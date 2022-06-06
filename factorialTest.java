package junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class factorialTest {

	@Test
	void test() {

		assertEquals(4,  JUnitTesting.factorial(2));
	}

}
