package interfacepack;

@FunctionalInterface
public interface Interface1 {
	public void method1();
	
	public default void method2() {
		System.out.println("In default method in Interface");
	}
	
	public static void display() {
		System.out.println("Inside static method in Interface");
	}
}
