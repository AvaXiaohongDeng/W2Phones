package phones;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Test class for the SmartPhone.java file. Will be used to demo Junit testing
 * in SYST 38634 Xiaohong Deng 2021.
 * There is no bad test for getFormattedPrice() because of no throws 
 * NumberFormatException.
 * 
 */

class TestSmartPhone {

	SmartPhone sp;

	@BeforeEach
	public void setup() {
		sp = new SmartPhone();
	}

	/**
	 * A test on good input. We expect this test to return the correct formatting
	 * price.
	 *
	 */
	@Test
	void testGetFormattedPriceGood() {
		sp.setPrice(1.23);
		String price = sp.getFormattedPrice();
		assertTrue("The price was not formatted properly", price.equals("$1.23"));
	}

	/**
	 * A method to check that the method will still work properly on boundary input
	 *
	 */
	@Test
	void testGetFormattedPriceBoundary() {
		sp.setPrice(0);
		String price = sp.getFormattedPrice();
		assertTrue("The price was not formatted properly", price.equals("$0"));
	}

	/**
	 * A test on good input. We expect this test to return the correct version.
	 * 
	 * @throws VersionNumberException
	 *
	 */
	@Test
	void testSetVersionGood() throws VersionNumberException {
		sp.setVersion(1);
		assertTrue("The version was not setted properly", sp.getVersion() == 1);
	}

	/**
	 * A method to check that when we enter a wrong version, it will throw an
	 * VersionNumberException exception
	 *
	 */
	@Test
	void testSetVersionBad() {
		assertThrows(VersionNumberException.class, () -> {
			sp.setVersion(5);
		});
	}

	/**
	 * A method to check that the method will still work properly on boundary input
	 *
	 */
	@Test
	void testSetVersionBoundaryBoundary() throws VersionNumberException {
		sp.setVersion(4);
		assertTrue("The version was not setted properly", sp.getVersion() == 4);
	}

	/**
	 * A method to check that when we enter a wrong version, the
	 * VersionNumberException works
	 *
	 */
	@Test
	public void whenDerivedExceptionThrown_thenAssertionSucceds() {
		Exception exception = assertThrows(VersionNumberException.class, () -> {
			sp.setVersion(5);
		});

		String expectedMessage = "The following version number is unsupported at this time:";
		String actualMessage = exception.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}

}
