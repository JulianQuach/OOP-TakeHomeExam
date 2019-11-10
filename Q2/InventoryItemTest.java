package Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryItemTest {

	InventoryItem item;
	
	@BeforeEach
	void setUp() throws Exception {
		item = new InventoryItem("sword", 250, "Excalibur", 1);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetItemName() {
		assertEquals("Excalibur", item.getName());
	}
	
	@Test
	void testItemDescription() {
		String ret = "Excalibur type (sword), wt: 250";
		assertEquals(ret, item.toString());
	}

}
