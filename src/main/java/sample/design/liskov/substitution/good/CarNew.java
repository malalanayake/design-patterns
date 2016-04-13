package sample.design.liskov.substitution.good;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 3:52:15 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class CarNew extends VehicleNew {

 @Override
 public void setRimSize(float rimSize) {
	super.setRimSize(rimSize);
 }

 @Override
 public void setTireSize(float tireSize) {
	super.setTireSize(tireSize);
 }

 @Override
 public void initEngine() {
	System.out.println("[START:Car Engine]");
 }
}
