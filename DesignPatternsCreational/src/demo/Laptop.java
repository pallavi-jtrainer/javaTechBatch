package demo;

public class Laptop extends Computer{
	private String memory;
	private String hdd;
	
	public Laptop() {}

	public Laptop(String memory, String hdd) {
		super();
		this.memory = memory;
		this.hdd = hdd;
	}
	
	@Override
	public String getHdd() {
		return hdd;
	}
	
	@Override
	public String getMemory() {
		return memory;
	}
}
