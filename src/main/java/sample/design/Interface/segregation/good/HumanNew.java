package sample.design.Interface.segregation.good;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 12, 2016 1:25:34 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class HumanNew implements Workable, Feedable {

 public void startWork() {
	System.out.println("[START:Working Human]");
 }

 public void stopWork() {
	System.out.println("[STOP:Working Human]");
 }

 public void eat() {
	System.out.println("[EAT:Lunch Human]");
 }

}
