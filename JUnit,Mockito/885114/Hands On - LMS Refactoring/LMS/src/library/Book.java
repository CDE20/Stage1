package library;

/**
 * @author Atik
 *
 */
public class Book {
	/**
	 * 
	 */
	private String authorName;
	private String bookId;
	private String bookTitle;
	private String publisherName;

    /** 
    * Creates instance of Book.
    */ 
    public Book() { 
        // The explicit constructor is here. 
    } 

	/**
	 * @param bookId
	 * @param bookTitle
	 * @param authorName
	 * @param publisherName
	 */
	public Book(String bookId, String bookTitle, String authorName, String publisherName) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.publisherName = publisherName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getBookId() {
		return bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getPublisherName() {
		return publisherName;
	}

}
