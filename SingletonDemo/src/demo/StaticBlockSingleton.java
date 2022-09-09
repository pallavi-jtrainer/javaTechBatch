package demo;

public class StaticBlockSingleton {
//	private final static StaticBlockSingleton instance = new StaticBlockSingleton();
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception s) {
			throw new RuntimeException("Exception occured during Singleton object creation");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
