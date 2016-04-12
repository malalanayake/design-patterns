package sample.dependency.Inversion.good;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 12, 2016 2:58:58 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class Main {

	public static void main(String[] args) {
		ApplicationProgramNew app = new ApplicationProgramNew();
		ServiceProgramNew service = new ServiceProgramNew();

		OperatingSystemNew os = new OperatingSystemNew();
		os.start(app);
		os.start(service);
	}

}
