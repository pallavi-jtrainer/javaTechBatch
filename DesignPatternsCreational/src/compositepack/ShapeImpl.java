package compositepack;

public class ShapeImpl {
	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		Circle c = new Circle();
		
		Drawing d = new Drawing();
		d.addShape(s1);
		d.addShape(s2);
		d.addShape(c);
		
		d.draw();
	}
}
