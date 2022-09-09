package demo;

public class Desktop extends Computer {
	private String memory;
	private String hdd;
	
	@Override
	public String getHdd() {
		return hdd;
	}
	
	@Override
	public String getMemory() {
		return memory;
	}
	
	public Desktop() {
		
	}
	
	public Desktop(String memory, String hdd) {
		this.memory = memory;
		this.hdd = hdd;
	}
}
