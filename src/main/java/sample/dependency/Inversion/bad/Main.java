package sample.dependency.Inversion.bad;

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
				ApplicationProgram app = new ApplicationProgram();
				ServiceProgram service = new ServiceProgram();

				OperatingSystem os = new OperatingSystem();
				os.start(app);
				os.start(service);
		}

}
