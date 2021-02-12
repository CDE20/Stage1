package library;

import java.util.Date;

public class Transaction {
	private static final int NO_OF_BOOKS = 0;
	public static final int PENALTY_PER_DAY = 10;

	private Book book;
	private Date bookReturnDate;
	private Date bookTobeReturnDate;
	private Member member;
	private double penalty;
	private Date transactionDate;
	private int transactionId;
	private String transactionType;

    /** 
    * Creates instance of Transaction.
    */ 
    public Transaction() { 
        // The explicit constructor is here. 
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
	public static int getNoOfBooks() {
		return NO_OF_BOOKS;
	}

	public Book getBook() {
		return book;
	}

	public Date getBookReturnDate() {
		return bookReturnDate;
	}

	public Date getBookTobeReturnDate() {
		return bookTobeReturnDate;
	}

	public Member getMember() {
		return member;
	}

	public double getPenalty() {
		return penalty;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

}
