package sample.design.liskov.substitution.bad;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 3:57:49 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class LSPTest {

		public static void main(String[] args) {
				Vehicle vehicle = new Vehicle();
				vehicle.setRimSize(10);
				vehicle.setTireSize(12);
				vehicle.initEngine();
				vehicle.print();

				Vehicle car = new Car();
				car.setRimSize(10);
				car.setTireSize(12);
				car.initEngine();
				car.print();
		}

}
