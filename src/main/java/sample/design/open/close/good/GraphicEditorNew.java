package sample.design.open.close.good;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 1:32:49 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class GraphicEditorNew {

		public void drawShape(ShapeNew s) {
				System.out.println("[INIT:Canvas]");
				s.draw();
				System.out.println("[RENDER:Canvas]");
		}

		public static void main(String[] args) {
				GraphicEditorNew ge = new GraphicEditorNew();
				// Print circle
				CircleNew c = new CircleNew();
				ge.drawShape(c);

				// Print Rectangle
				RectangleNew rec = new RectangleNew();
				ge.drawShape(rec);
		}
}
