package unitTestfadili.mostafa.unitTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@Order(1)
public class UserServiceTest {

	@BeforeAll
	static void setup() {
		
		System.out.println("Test method related to user");
	}
	
	@Test
	void testCreateUser_WhenFirstNameIsMissing_throwsUserServiceException() {
		
	}
}
