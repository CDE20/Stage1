package library;

import java.util.ArrayList;

public class BookDAO {

	private final ArrayList<Book> bookList;

    public BookDAO() {
        bookList = new ArrayList<>();
    }

	public void addBook(Book obj) {
		bookList.add(obj);
	}

	public void bookDAODetails() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println("Book Id:" + bookList.get(i).getBookId());
			System.out.println("Book Title:" + bookList.get(i).getBookTitle());
			System.out.println("Author Name:" + bookList.get(i).getAuthorName());
			System.out.println("Publisher Name:" + bookList.get(i).getPublisherName());
		}
	}

	public void removeBook(Book obj) {
		bookList.remove(obj);
	}
}
