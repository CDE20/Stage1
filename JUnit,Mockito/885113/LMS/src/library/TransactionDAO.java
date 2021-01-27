package library;
//import library.Book;

//import java.time.DateTimeException;
//import java.time.LocalDate;
import java.util.ArrayList;

//import java.util.Date;
//import java.util.Date;


public class TransactionDAO {
	ArrayList<Transaction> transactionList =  new ArrayList<Transaction>();
	
	
	public void addTransaction(Transaction obj){
		//obj = new Transaction();
	    transactionList.add(obj);
		
	}
	
	
	


	
	public void viewTransaction(){
		
		if(transactionList.isEmpty()) {
			System.out.println("Transaction List is empty");
		}
		
		for (int i = 0; i < transactionList.size(); i++) {
			System.out.println("Transaction Id:" + transactionList.get(i).transactionId());
			System.out.println("Member Id:"+transactionList.get(i).getMember().getMemberId());
			System.out.println("Book Id:"+transactionList.get(i).getBook().getBookId());
			System.out.println("Transaction Date:" + transactionList.get(i).getTransactionDate());
			System.out.println("Transaction Type:"+transactionList.get(i).getTransactionType());
			System.out.println("No Of Books:"+transactionList.get(i).getNoOfBooks());
			System.out.println("Book Return Date:"+transactionList.get(i).getBookReturnDate());
		}
		
	}
	

}
