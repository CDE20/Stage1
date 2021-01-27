package library;

import java.util.Date;

public class Transaction {
	private Member member;
	private Book book;
	private int transactionId;
	private String transactionType;
	private static final int NO_OF_BOOKS = 0;
	private Date transactionDate;
	private Date bookTobeReturnDate;
	public static final int PENALTYPERDAY = 10;
	private double penalty;
	private Date bookReturnDate;

	public Transaction(Member member, Book book, int transactionId, String transactionType, Date transactionDate,
			Date bookTobeReturnDate, double penalty, Date bookReturnDate) {
		super();
		this.member = member;
		this.book = book;
		this.transactionId = transactionId;
		this.transactionType = transactionType;
		this.transactionDate = transactionDate;
		this.bookTobeReturnDate = bookTobeReturnDate;
		this.penalty = penalty;
		this.bookReturnDate = bookReturnDate;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Date getBookTobeReturnDate() {
		return bookTobeReturnDate;
	}

	public void setBookTobeReturnDate(Date bookTobeReturnDate) {
		this.bookTobeReturnDate = bookTobeReturnDate;
	}

	public double getPenalty() {
		return penalty;
	}

	public void setPenalty(double penalty) {
		this.penalty = penalty;
	}

	public Date getBookReturnDate() {
		return bookReturnDate;
	}

	public void setBookReturnDate(Date bookReturnDate) {
		this.bookReturnDate = bookReturnDate;
	}

	public static int getNoOfBooks() {
		return NO_OF_BOOKS;
	}

	public static int getPenaltyperday() {
		return PENALTYPERDAY;
	}

}
