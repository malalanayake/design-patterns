package sample.design.liskov.substitution.bad;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * @author dmalalan
 * @created Apr 11, 2016 3:52:15 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class Car extends Vehicle {

	@Override
	public void setRimSize(float rimSize) {
		super.setTireSize(rimSize);
	}

	@Override
	public void setTireSize(float tireSize) {
		super.setRimSize(tireSize);
	}

	@Override
	public void initEngine() {
		System.out.println("[START:Car Engine]");
	}
}
