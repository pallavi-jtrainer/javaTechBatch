package methodrefpack;

public class Student {
	private int id;
	private String name;
	
	public Student(int i, String n) {
		this.id = i;
		this.name = n;
		System.out.println("Id: " + this.id + ", Name: " + this.name);
	}
}
