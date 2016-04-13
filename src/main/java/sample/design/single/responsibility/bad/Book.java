package sample.design.single.responsibility.bad;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 11:20:19 AM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class Book {
 private int bookId;
 private String name;

 public int getBookId() {
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

 /**
  * 1. Get DB connection and 2. Create transaction 3. Save the book 4. Commit
  * transaction
  */
 public void saveBook() {

	System.out.println("[SAVE:BOOK " + this.bookId + "]");
 }

 /**
  * 1. Get DB connection and 2. Create transaction 3. Update the book 4. Commit
  * transaction
  */
 public void updateBook() {

	System.out.println("[UPDATE:BOOK " + this.bookId + "]");
 }

 /**
  * 1. Get DB connection and 2. read the book
  * 
  */
 public void readBook() {

	System.out.println("[READ:BOOK " + this.bookId + "]");
 }

 /**
  * 1. Get DB connection and 2. Create transaction 3. Delete the book 4. Commit
  * transaction
  */
 public void deleteBook() {

	System.out.println("[DELETE:BOOK " + this.bookId + "]");
 }

}
