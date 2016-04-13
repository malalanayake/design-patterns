package sample.design.Interface.segregation.good;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 12, 2016 1:27:46 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class RobotNew implements Workable {

	public void startWork() {
		System.out.println("[START:Working Robot]");
	}

	public void stopWork() {
		System.out.println("[STOP:Working Robot]");
	}

}
