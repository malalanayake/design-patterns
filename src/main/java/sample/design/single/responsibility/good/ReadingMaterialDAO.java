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
public class ReadingMaterialDAO {

	/**
	 * 1. Get DB connection and 2. Create transaction 3. Save the book 4. Commit
	 * transaction
	 */
	public void saveBook(ReadingMaterial bookNew) {

		System.out.println("[SAVE:RM " + bookNew.getId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. Create transaction 3. Update the book 4.
	 * Commit transaction
	 */
	public void updateBook(ReadingMaterial bookNew) {

		System.out.println("[UPDATE:RM " + bookNew.getId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. read the book
	 * 
	 */
	public void readBook(ReadingMaterial bookNew) {

		System.out.println("[READ:RM " + bookNew.getId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. Create transaction 3. Delete the book 4.
	 * Commit transaction
	 */
	public void deleteBook(ReadingMaterial bookNew) {

		System.out.println("[DELETE:RM " + bookNew.getId() + "]");
	}

}
