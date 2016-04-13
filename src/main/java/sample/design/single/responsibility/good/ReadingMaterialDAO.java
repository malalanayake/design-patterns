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
	 * 1. Get DB connection and 2. Create transaction 3. Save the RM 4. Commit
	 * transaction
	 */
	public void saveRM(ReadingMaterial readingMaterial) {

		System.out.println("[SAVE:RM " + readingMaterial.getId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. Create transaction 3. Update the RM 4. Commit
	 * transaction
	 */
	public void updateRM(ReadingMaterial readingMaterial) {

		System.out.println("[UPDATE:RM " + readingMaterial.getId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. read the RM
	 * 
	 */
	public void readRM(ReadingMaterial readingMaterial) {

		System.out.println("[READ:RM " + readingMaterial.getId() + "]");
	}

	/**
	 * 1. Get DB connection and 2. Create transaction 3. Delete the RM 4. Commit
	 * transaction
	 */
	public void deleteRM(ReadingMaterial readingMaterial) {

		System.out.println("[DELETE:RM " + readingMaterial.getId() + "]");
	}

}
