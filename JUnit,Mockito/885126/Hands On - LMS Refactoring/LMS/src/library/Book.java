package library;

//import java.lang.String;
public class Book {
	private String bookId;
	private String bookTitle;
	private String authorName;
	private String publisherName;
	public Book(){
	    
	    super();
		
	}
	public String getBookId() {
		return bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public Book(String bookId, String bookTitle, String authorName, String publisherName) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.publisherName = publisherName;
	}
	

}
