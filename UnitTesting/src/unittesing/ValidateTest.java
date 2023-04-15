package unittesing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidateTest {
	Validate validate ;
	
	@BeforeEach
	void setUp() throws Exception {
		
		validate = new Validate();
	}

	@AfterEach
	void tearDown() throws Exception {
		
		validate = null;
	}

	@Test
	void testCheck() {
		
		assertEquals(true, validate.check("shiv", "shiv"));
	}

}
