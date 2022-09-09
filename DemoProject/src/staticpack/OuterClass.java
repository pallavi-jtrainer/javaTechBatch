package staticpack;

public class OuterClass {
	int id = 10;
	static int x = 2;
	
	public class InnerClass {
		public void show() {
			System.out.println(id);
		}
	}
	
	public static class Inner {
		public void show() {
			System.out.println(x);
		}
	}
}
