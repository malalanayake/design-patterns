package sample.design.single.responsibility.good;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 11:35:44 AM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class BookDAO {

	/**
	 * 1. Get DB connection and 2. Create transaction 3. Save the book 4. Commit
	 * transaction
	 */
	public void saveBook(BookNew bookNew) {

		System.out.println("[SAVE:BOOK " + bookNew.getBookId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. Create transaction 3. Update the book 4.
	 * Commit transaction
	 */
	public void updateBook(BookNew bookNew) {

		System.out.println("[UPDATE:BOOK " + bookNew.getBookId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. read the book
	 * 
	 */
	public void readBook(BookNew bookNew) {

		System.out.println("[READ:BOOK " + bookNew.getBookId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. Create transaction 3. Delete the book 4.
	 * Commit transaction
	 */
	public void deleteBook(BookNew bookNew) {

		System.out.println("[DELETE:BOOK " + bookNew.getBookId() + "]");
	}

}
