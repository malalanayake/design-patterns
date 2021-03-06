package sample.design.single.responsibility.good;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 11:20:19 AM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class BookNew implements ReadingMaterial {

	private static final String BOOK = "Book";
	private int bookId;
	private String name;

	public int getId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return BOOK;
	}

}
