package demo;

public class LaptopFactory implements ComputerAbstractFactory{
	private String memory;
	private String hdd;
	
	public LaptopFactory() {}

	public LaptopFactory(String memory, String hdd) {
		super();
		this.memory = memory;
		this.hdd = hdd;
	}
	
	@Override
	public Computer createComputer() {
		return new Laptop(memory, hdd);
	}
}
