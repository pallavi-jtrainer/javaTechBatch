package compositepack;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();
	
	@Override
	public void draw() {
		for(Shape s: shapes) {
			s.draw();
		}
	}
	
	public void addShape(Shape s) {
		shapes.add(s);
	}
	
	public void remove(Shape s) {
		shapes.remove(s);
	}
}
