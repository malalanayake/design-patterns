package sample.design.liskov.substitution.bad;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 3:41:57 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class Vehicle {

 private float tireSize;
 private float rimSize;

 public float getTireSize() {
	return tireSize;
 }

 public float getRimSize() {
	return rimSize;
 }

 public void setTireSize(float tireSize) {
	this.tireSize = tireSize;
 }

 public void setRimSize(float rimSize) {
	this.rimSize = rimSize;
 }

 public void initEngine() {
	System.out.println("[START:Vehicle Engine]");
 }

 public void start() {
	System.out.println("[ENTER:KEY]");
	initEngine();
	System.out.println("[INIT:DashBoard Connection]");
 }

 public void print() {
	System.out.println("RIM Size:" + rimSize + " TIRE Size:" + tireSize + "");
 }
}
