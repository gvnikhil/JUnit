package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testaddNumbers {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		junitfunction junit = new junitfunction();
		int result = junit.addNumbers(100, 200);
		assertEquals(300, result);
	}

}
