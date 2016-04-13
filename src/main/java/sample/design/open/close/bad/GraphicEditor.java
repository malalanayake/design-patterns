package sample.design.open.close.bad;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Apr 11, 2016 1:32:49 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class GraphicEditor {

 public void drawShape(Shape s) {
	if (s.getType() == 1)
	 drawRectangle((Rectangle) s);
	else if (s.getType() == 2)
	 drawCircle((Circle) s);
 }

 public void drawCircle(Circle s) {
	System.out.println("[PRINT:Circle]");
 }

 public void drawRectangle(Rectangle r) {
	System.out.println("[PRINT:Rectangle]");
 }

 public static void main(String[] args) {
	GraphicEditor ge = new GraphicEditor();
	// Print circle
	Circle c = new Circle();
	ge.drawShape(c);

	// Print Rectangle
	Rectangle rec = new Rectangle();
	ge.drawShape(rec);
 }

}
