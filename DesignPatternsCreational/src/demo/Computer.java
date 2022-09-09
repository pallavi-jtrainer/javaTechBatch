package demo;

public abstract class Computer {
	public abstract String getMemory();
	public abstract String getHdd();
	
	@Override
	public String toString() {
		return "RAM: " + getMemory() + ", HardDisk: " + getHdd();
	}
}
