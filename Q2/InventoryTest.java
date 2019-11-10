package Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryTest {
	
	InventoryItem item1;
	InventoryItem item2;
	Inventory inventory;
	
	@BeforeEach
	void setUp() throws Exception {
		item1 = new InventoryItem("sword", 250, "Excalibur", 1);
		item2 = new InventoryItem("sword", 50, "Long sword", 1);
		inventory = new Inventory(); 
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddToAFullInventory() {
		inventory.addItemToInventory(item1);
		assertEquals(false, inventory.addItemToInventory(item2));
	}
	
	@Test
	void testDropTheExistingItem() {
		inventory.addItemToInventory(item1);
		assertEquals(true, inventory.dropInventoryItem(item1));
	}

}
