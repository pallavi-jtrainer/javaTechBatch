package demo;

public class ComputerFactory {
	public static Computer getComputer(String type, String memory, String hdd) {
		if("Laptop".equalsIgnoreCase(type)) {
			return new Laptop(memory, hdd);
		}
		if("Desktop".equalsIgnoreCase(type)) {
			return new Desktop(memory, hdd);
		} else
			return null;
	}
	
//	public static Computer getComputer(ComputerAbstractFactory factory) {
//		return factory.createComputer();
//	}
}
