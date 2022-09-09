package demo;

import methodrefpack.IStudent;
import methodrefpack.Student;

//import interfacepack.Interface1;
//import methodrefpack.ReferenceImpl;

public class MainClass {

	public static void main(String[] args) {
//		Triangle tri = new Triangle();
//		tri.draw();
		
//		InterfaceImpl obj = new InterfaceImpl();
//		//obj.myMethod();
//		//obj.calc(12, 34);
//		obj.reverseStr("StringDemo");
		
//		ReferenceImpl obj = new ReferenceImpl();
////		Interface1 inter = obj::myMethod;
////		inter.method1();
//		obj.listDemo();
//		Student s = new Student();
		IStudent s1 = Student::new;
		s1.getStudentData(12, "Rohan");
//		s.show();
	}

}
