package demo;

public class Triangle extends Shape{
	@Override
	public void draw() {
		Color obj = new Color() {

			@Override
			public void fillColor(String color) {
				System.out.println("Filling Color: " + color);
			}
				
		};
		System.out.println("Drawing Triangle");
		obj.fillColor("Red");
	}
}
