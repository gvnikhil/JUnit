package JUnit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testaddStrings {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		junitfunction junitstring = new junitfunction();
		
		String result= junitstring.addStrings("capestone","project" );
		assertEquals("capestoneproject",result);
	}


}
