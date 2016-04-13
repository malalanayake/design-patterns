package sample.design.Interface.segregation.bad;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 12, 2016 1:27:46 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class Robot implements Worker {

 public void startWork() {
	System.out.println("[START:Working Robot]");
 }

 public void stopWork() {
	System.out.println("[STOP:Working Robot]");
 }

 /**
  * The interface force to implement the method which is not needed.
  */
 public void eat() {
	System.out.println("[NOT APPLICABLE]");
 }

}
