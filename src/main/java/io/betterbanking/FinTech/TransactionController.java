package io.betterbanking.FinTech;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

	@GetMapping("/transactions/{accountNumber}")
	List<Transaction> GetTransactions(@PathVariable int accountNumber) {
		TransactionService service = new TransactionService();
		List<Transaction> allTransactions = new ArrayList<>();
		allTransactions = service.findAllByAccountNumber(accountNumber);
		
		return allTransactions;
	}
	
}
