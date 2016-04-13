package sample.dependency.Inversion.good;

import java.util.List;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 12, 2016 2:48:03 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class OperatingSystemNew {
		private List<Runner> apps;

		public void start(Runner runner) {
				apps.add(runner);
				runner.run();
		}
}
