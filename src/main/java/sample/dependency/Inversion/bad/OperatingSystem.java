package sample.dependency.Inversion.bad;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 12, 2016 2:48:03 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class OperatingSystem {
		private ApplicationProgram app;
		private ServiceProgram service;

		public void start(ApplicationProgram app) {
				this.app = app;
				app.run();
		}

		public void start(ServiceProgram service) {
				this.service = service;
				service.run();
		}
}
