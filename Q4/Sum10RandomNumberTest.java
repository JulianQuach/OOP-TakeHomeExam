package Q4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sum10RandomNumberTest {

	Sum10RandomNumbers s;
	
	@BeforeEach
	void setUp() throws Exception {
		s = new Sum10RandomNumbers();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGenerateAllNumber() {
		s.generateAllNumber();
		assertEquals(10, s.list.size());
	}

	@Test
	void testAddNumberToList() {
		s.generateAllNumber();
		s.addNumberToList(10);
		assertEquals(11, s.list.size());
	}
	
	@Test
	void testToString() {
		s.generateAllNumber();
		String ret = "Generated numbers: ";
		for (int i = 0; i < s.list.size(); i++) {
			ret += s.list.get(i) + " ";
		}
		ret += "\nTotal: " + s.getTotal();
		assertEquals(ret, s.toString());
	}
}
