package interfacepack;

public class InterfaceImpl {
	public void myMethod() {
//		Interface1 inter = new Interface1() {
//			
//			@Override
//			public void method1() {
//				System.out.println("Method1 implementation");
//			}
//		};
//		inter.method1();
//		inter.method2();
//		Interface1.display();
		
		Interface1 inter = () -> System.out.println("Method1 implementation");
		inter.method1();
		
	}
	
	public void calc(int a, int b) {
		MyInterface inter = (x, y) -> { return x + y; };
		System.out.println("Adding: " + inter.add(a, b));
	}
	
	public void reverseStr(String str) {
		MyInterface1 obj = (n) -> {
			String res = "";
			
			for(int i = n.length() - 1; i >= 0; i--) {
				res += n.charAt(i);
			}
			
			return res;
		};
		
		System.out.println("original: " + str + ", reversed: " + obj.reverseString(str));
	}
}
