package staticpack;

public class StaticDemo {
	private static int id;
	private String name;
	private static final int VAL;
	
	static {
		//static variable initialization
		id = 10;
		VAL = 12;
		System.out.println("Initial value: " + getId());
	}
	
	public static int getVal() {
		return VAL;
	}
	
	public static int getId() {
		return id;
	}
	
	public static void setId(int id) {
		StaticDemo.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
