package io.betterbanking.FinTech;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinTechApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void TransactionServiceTest() {
		TransactionService service = new TransactionService();
		int listSize;
		listSize = service.findAllByAccountNumber(4).size();
	
		Assertions.assertTrue(listSize >= 1);
	}
	
	@Test
	void TransactionControllerIntegrationTest() {
		
	}
}
