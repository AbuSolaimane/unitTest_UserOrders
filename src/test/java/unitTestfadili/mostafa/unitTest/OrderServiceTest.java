package unitTestfadili.mostafa.unitTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(3)
public class OrderServiceTest {

	@BeforeAll
	static void setup() {
		
		System.out.println("Test method related to user orders");
	}
	
	@Test
	void testCreateOrder_WhenProductIdIsMissing_throwsOrderServiceException() {
		
	}
}
