package library;

import java.util.ArrayList;

public class TransactionDAO {
	ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

	public void addTransaction(Transaction transaction) {
		transactionList.add(transaction);

	}

	public void removeTransaction(Transaction transaction) {
		transactionList.remove(transaction);
	}

	public void viewTransaction() {
		if (transactionList.isEmpty()) {
			System.out.println("Transaction List is empty");
		}

		for (int i = 0; i < transactionList.size(); i++) {
			System.out.println("Transaction Id:" + transactionList.get(i).getTransactionId());
			System.out.println("Member Id:" + transactionList.get(i).getMember().getMemberId());
			System.out.println("Book Id:" + transactionList.get(i).getBook().getBookId());
			System.out.println("Transaction Date:" + transactionList.get(i).getTransactionDate());
			System.out.println("Transaction Type:" + transactionList.get(i).getTransactionType());
			System.out.println("No Of Books:" + transactionList.get(i).getNoOfBooks());
			System.out.println("Book Return Date:" + transactionList.get(i).getBookReturnDate());
		}

	}

}
