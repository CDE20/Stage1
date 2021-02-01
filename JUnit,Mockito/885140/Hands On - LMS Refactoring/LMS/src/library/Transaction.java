package library;
import java.util.Date;

public class Transaction {
	private Member member;
	private Book book;
	private int transactionId;
	private String transactionType;
	private static final int NOOFBOOKS=0;	
	private Date transactionDate;
	private Date bookTobeReturnDate;
	public Date getBookTobeReturnDate() {
		return bookTobeReturnDate;
	}
	public static final int PENALTYPERDAY=10;
	private double penalty;
	private Date bookReturnDate;
	
	public Transaction(){
		
	} 
	
	public Transaction(Member member, Book book, int transactionId, String transactionType, Date transactionDate,
		double penalty) {
		super();
		this.member = member;
		this.book = book;
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.penalty = penalty;
	}
	public Member getMember() {
		return member;
	}
	public Book getBook() {
		return book;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public static int getNoOfBooks() {
		return NOOFBOOKS;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	
	public double getPenalty() {
		return penalty;
	}
	public Date getBookReturnDate() {
		return bookReturnDate;
	}
	
	

}
