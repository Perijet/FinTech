package io.betterbanking.FinTech;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

	public List<Transaction> findAllByAccountNumber(int accountNumber) {
		List<Transaction> transaction = new ArrayList<>();
		Transaction firstTransaction = new Transaction();
		Transaction secondTransaction = new Transaction();
		
		firstTransaction.type = "Deposit";
		firstTransaction.accountNumber = accountNumber;
		firstTransaction.currency = "dollars";
		firstTransaction.amount = 12;
		firstTransaction.merchantName = "Eagle Investments";
		firstTransaction.merchantLogo = "eagle.jpg";
		
		secondTransaction.type = "Inquiary";
		secondTransaction.accountNumber = accountNumber;
		secondTransaction.currency = "dollars";
		secondTransaction.amount = 0;
		secondTransaction.merchantName = "Eagle Investments";
		secondTransaction.merchantLogo = "eagle.jpg";
		
		transaction.add(firstTransaction);
		transaction.add(secondTransaction);
		
		return transaction;
	}
}
